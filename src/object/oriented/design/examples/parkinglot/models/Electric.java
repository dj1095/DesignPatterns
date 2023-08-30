package object.oriented.design.examples.parkinglot.models;

import object.oriented.design.examples.parkinglot.models.Vehicle;
import object.oriented.design.examples.parkinglot.enums.VehicleType;

public class Electric extends Vehicle {
    public Electric() {
        super(VehicleType.ELECTRIC);
    }
}
