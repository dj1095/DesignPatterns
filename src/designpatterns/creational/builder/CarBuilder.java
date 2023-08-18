package designpatterns.creational.builder;

public class CarBuilder implements IBuilder {
    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildSeats(int numOfSeats) {
        car.setNumberOfSeats(numOfSeats);
    }

    @Override
    public void buildEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void buildTripComputer(boolean isTripEnabled) {
        car.setTripComputerEnabled(isTripEnabled);
    }

    @Override
    public void buildGps(boolean isGpsEnabled) {
        car.setGpsEnabled(isGpsEnabled);
    }

    public Car build(){
        Car product = car;
        this.car = null;
        return product;
    }
}
