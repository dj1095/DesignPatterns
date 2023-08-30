package object.oriented.design.examples.parkinglot.models;

import object.oriented.design.examples.parkinglot.enums.VehicleType;

public class Truck extends Vehicle {
    public Truck() {
        super(VehicleType.TRUCK);
    }
}
