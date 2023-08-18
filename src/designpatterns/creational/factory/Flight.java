package designpatterns.creational.factory;

public class Flight implements Transport{

    @Override
    public void delivery() {
        System.out.println("Flight Delivery");
    }
}
