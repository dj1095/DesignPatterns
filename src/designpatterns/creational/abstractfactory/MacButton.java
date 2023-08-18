package designpatterns.creational.abstractfactory;

public class MacButton implements IButton{
    @Override
    public void click() {
        System.out.println("Clicked On Mac Button");
    }
}
