package designpatterns.structural.adpater;

public class Client {
    public static void main(String[] args) {
        String xmlData = "This is XML Data";
        IClient adapter = new Adapter(new ThirdPartyService());
        adapter.processData(xmlData);
    }
}
