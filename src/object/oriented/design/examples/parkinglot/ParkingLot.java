package object.oriented.design.examples.parkinglot;

import object.oriented.design.examples.parkinglot.enums.ParkingTicketStatus;
import object.oriented.design.examples.parkinglot.enums.VehicleType;
import object.oriented.design.examples.parkinglot.exceptions.ParkingFullException;
import object.oriented.design.examples.parkinglot.models.Vehicle;
import object.oriented.design.examples.parkinglot.utils.ParkingTicketBuilder;
import object.oriented.design.examples.parkinglot.utils.Utils;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private static ParkingLot parkingLot;
    private String name;
    private String location;

    private int compactSpotCount;
    private int largeSpotCount;
    private int handicappedSpotCount;
    private int motorbikeCount;
    private int electricCount;
    private int maxCompactSpotCount = 5;
    private int maxLargeSpotCount = 5;
    private int maxHandicappedSpotCount = 5;
    private int maxMotorbikeCount = 5;
    private int maxElectricCount = 5;


    private final Map<String, ParkingFloor> parkingFloorMap = new HashMap<>();
    private final Map<String, EntrancePanel> entrancePanelMap = new HashMap<>();
    private final Map<String, ExitPanel> exitPanelMap = new HashMap<>();
    private final Map<String, ParkingTicket> activeTickets = new HashMap<>();

    private ParkingLot() {
        // READ FROM DB
        this.name = "LOT A";
        this.location = "Sanders St, TX, USA";
        addParkingFloor("1");
        addParkingFloor("2");
        addParkingFloor("3");
        addEntrancePanel("A");
        addEntrancePanel("B");
        addExitPanel("C");
        addExitPanel("D");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public static ParkingLot getInstance() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public boolean addParkingFloor(String name) {
        return parkingFloorMap.putIfAbsent(name, new ParkingFloor()) == null;
    }

    public boolean addEntrancePanel(String name) {
        return entrancePanelMap.putIfAbsent(name, new EntrancePanel()) == null;
    }

    public boolean addExitPanel(String name) {
        return exitPanelMap.putIfAbsent(name, new ExitPanel()) == null;
    }

    public boolean isFull(VehicleType vehicleType) {
        if (vehicleType == VehicleType.TRUCK || vehicleType == VehicleType.VAN) {
            return largeSpotCount > maxLargeSpotCount;
        } else if (vehicleType == VehicleType.MOTORBIKE) {
            return motorbikeCount > maxMotorbikeCount;
        } else if (vehicleType == VehicleType.ELECTRIC) {
            return electricCount > maxElectricCount;
        } else if (vehicleType == VehicleType.CAR) {
            return (compactSpotCount + largeSpotCount) > (maxLargeSpotCount + maxCompactSpotCount);
        }
        return (compactSpotCount + largeSpotCount + electricCount) > (maxCompactSpotCount + maxLargeSpotCount + maxElectricCount);
    }

    public synchronized ParkingTicket getNewParkingTicket(Vehicle vehicle) throws ParkingFullException {
        if (this.isFull(vehicle.getVehicleType())) {
            throw new ParkingFullException("Parking Lot is Full");
        }
        ParkingTicket ticket = new ParkingTicketBuilder()
                .buildTicketNumber(Utils.generateNewTicketNumber())
                .buildIssuedAt(LocalDateTime.now())
                .buildStatus(ParkingTicketStatus.ACTIVE)
                .build();
        vehicle.setParkingTicket(ticket);
        //We can save here to DB
        this.incrementSpotCount(vehicle.getVehicleType());
        activeTickets.put(ticket.getTicketNumber(), ticket);
        return ticket;
    }

    private void incrementSpotCount(VehicleType vehicleType) {
        if (vehicleType == VehicleType.MOTORBIKE) {
            motorbikeCount++;
        } else if (vehicleType == VehicleType.TRUCK || vehicleType == VehicleType.VAN) {
            largeSpotCount++;
        } else if (vehicleType == VehicleType.CAR) {
            if (compactSpotCount < largeSpotCount) {
                compactSpotCount++;
            } else {
                largeSpotCount++;
            }
        } else if (vehicleType == VehicleType.ELECTRIC) {
            if (electricCount < maxElectricCount) {
                electricCount++;
            } else if (compactSpotCount < largeSpotCount) {
                compactSpotCount++;
            } else {
                largeSpotCount++;
            }
        }
    }


}
