package designpatterns.creational.builder;

public interface IBuilder {
    public void buildSeats(int numOfSeats);
    public void buildEngine(String engine);
    public void buildTripComputer(boolean isTripEnabled);
    public void buildGps(boolean isGpsEnabled);

}
