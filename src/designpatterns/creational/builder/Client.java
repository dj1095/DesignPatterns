package designpatterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        Director director = new Director(builder);
        director.makeSUV();
        Car car = builder.build();
        System.out.println(car);

        ManualBuilder manualBuilder = new ManualBuilder();
        Director director2 = new Director(manualBuilder);
        director2.makeSUV();
        Manual manual = manualBuilder.build();
        System.out.println(manual);
    }
}
