package object.oriented.design.examples.parkinglot.models;

import object.oriented.design.examples.parkinglot.ParkingTicket;
import object.oriented.design.examples.parkinglot.enums.VehicleType;

public abstract  class Vehicle {
    public Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    private VehicleType vehicleType;
    private ParkingTicket parkingTicket;

    public ParkingTicket getParkingTicket() {
        return parkingTicket;
    }

    public void setParkingTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
