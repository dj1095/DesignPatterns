package object.oriented.design.examples.parkinglot.exceptions;

public class ParkingFullException extends Exception {
    public ParkingFullException(String message) {
        super(message);
    }
}
