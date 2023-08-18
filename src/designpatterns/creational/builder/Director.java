package designpatterns.creational.builder;

public class Director {
    private IBuilder builder;

    public Director(IBuilder builder) {
        this.builder = builder;
    }

    public void makeSportsCar(){
        this.builder.buildEngine("Sports Engine");
        this.builder.buildSeats(2);
        this.builder.buildTripComputer(true);
        this.builder.buildGps(true);
    }

    public void makeSUV(){
        this.builder.buildEngine("SUV Engine");
        this.builder.buildSeats(4);
        this.builder.buildTripComputer(false);
        this.builder.buildGps(true);
    }


}
