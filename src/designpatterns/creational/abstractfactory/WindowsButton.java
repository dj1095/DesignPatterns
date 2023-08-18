package designpatterns.creational.abstractfactory;
public class WindowsButton implements IButton {

    @Override
    public void click() {
        System.out.println("Clicked on Windows Button");
    }
}
