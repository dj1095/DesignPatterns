package object.oriented.design.examples.parkinglot.models;

import object.oriented.design.examples.parkinglot.enums.VehicleType;
import object.oriented.design.examples.parkinglot.models.Vehicle;

public class Car extends Vehicle {
    public Car() {
        super(VehicleType.CAR);
    }
}
