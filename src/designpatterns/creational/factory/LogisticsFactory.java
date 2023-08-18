package designpatterns.creational.factory;

public class LogisticsFactory {

    public static Transport createLogistics(TransportMode mode) {
        Transport transport = null;
        switch (mode) {
            case SHIP:
                transport = new SeaLogistics().createTransport();
                break;
            case TRUCK:
                transport = new RoadLogistics().createTransport();
                break;
            case FLIGHT:
                transport = new AirLogistics().createTransport();
                break;
            default:
                System.out.println("Unknown Transport Mode");
                break;
        }
        return transport;
    }
}
