package designpatterns.creational.factory;

public class Ship implements Transport{
    @Override
    public void delivery() {
        System.out.println("Ship Delivery");
    }
}
