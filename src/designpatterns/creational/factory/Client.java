package designpatterns.creational.factory;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Transport transport = LogisticsFactory.createLogistics(TransportMode.FLIGHT);
        transport.delivery();
    }
}
