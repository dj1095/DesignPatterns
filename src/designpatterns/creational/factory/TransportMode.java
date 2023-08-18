package designpatterns.creational.factory;

public enum TransportMode {
    SHIP("SHIP"),
    TRUCK("TRUCK"),
    FLIGHT("FLIGHT");
    private String value;
    TransportMode(String truck) {
        this.value = truck;
    }
    public String getValue() {
        return value;
    }
}
