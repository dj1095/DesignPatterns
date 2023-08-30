package object.oriented.design.examples.parkinglot;

import object.oriented.design.examples.parkinglot.enums.ParkingTicketStatus;
import object.oriented.design.examples.parkinglot.utils.Utils;

import java.time.LocalDate;

public class EntrancePanel {
    private String id;

    public ParkingTicket printTicket(ParkingTicket ticket) {
        System.out.println("========================================================");
        System.out.println(" TKTNo: " + ticket.getTicketNumber() + "\n Entered At: " + ticket.getIssuedAt() + "\n Tkt Status: " + ticket.getStatus());
        System.out.println("========================================================");
        return null;
    }

}
