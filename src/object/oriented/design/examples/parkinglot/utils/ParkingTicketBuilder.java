package object.oriented.design.examples.parkinglot.utils;

import object.oriented.design.examples.parkinglot.ParkingTicket;
import object.oriented.design.examples.parkinglot.enums.ParkingTicketStatus;

import java.time.LocalDateTime;

public class ParkingTicketBuilder {
    private ParkingTicket ticket;

    public ParkingTicketBuilder() {
        ticket = new ParkingTicket();
    }

    public ParkingTicketBuilder buildTicketNumber(String ticketNumber) {
        ticket.setTicketNumber(ticketNumber);
        return this;
    }

    public ParkingTicketBuilder buildIssuedAt(LocalDateTime datetime) {
        ticket.setIssuedAt(datetime);
        return this;
    }

    public ParkingTicketBuilder buildPayedAt(LocalDateTime dateTime) {
        ticket.setPayedAt(dateTime);
        return this;
    }

    public ParkingTicketBuilder buildPayedAmount(double payedAmount) {
        ticket.setPayedAmount(payedAmount);
        return this;
    }

    public ParkingTicketBuilder buildStatus(ParkingTicketStatus status) {
        ticket.setStatus(status);
        return this;
    }

    public ParkingTicket build() {
        ParkingTicket parkingTicket = ticket;
        ticket = null;
        return parkingTicket;
    }


}
