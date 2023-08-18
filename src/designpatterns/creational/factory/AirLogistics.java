package designpatterns.creational.factory;

public class AirLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Flight();
    }
}
