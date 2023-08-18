package designpatterns.creational.factory;

public class Truck implements Transport{
    @Override
    public void delivery() {
        System.out.println("Truck Delivery");
    }
}
