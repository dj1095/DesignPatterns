package designpatterns.creational.builder;

public class Manual {
    private int numberOfSeats;
    private String engine;
    private boolean isTripComputerEnabled;
    private boolean isGpsEnabled;

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputerEnabled(boolean tripComputerEnabled) {
        isTripComputerEnabled = tripComputerEnabled;
    }

    public void setGpsEnabled(boolean gpsEnabled) {
        isGpsEnabled = gpsEnabled;
    }

    @Override
    public String toString() {
        return "[Car Manual - Engine = " + engine +"]";
    }
}
