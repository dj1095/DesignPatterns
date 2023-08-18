package designpatterns.creational.builder;

public class ManualBuilder implements IBuilder {
    private Manual manual;

    public ManualBuilder() {
        this.manual = new Manual();
    }

    @Override
    public void buildSeats(int numOfSeats) {
        this.manual.setNumberOfSeats(numOfSeats);
    }

    @Override
    public void buildEngine(String engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void buildTripComputer(boolean isTripEnabled) {
        this.manual.setTripComputerEnabled(isTripEnabled);
    }

    @Override
    public void buildGps(boolean isGpsEnabled) {
        this.manual.setGpsEnabled(isGpsEnabled);
    }

    public Manual build(){
        Manual product = manual;
        this.manual = null;
        return product;
    }
}
