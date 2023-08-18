package designpatterns.creational.abstractfactory;

public class MacTextBox implements ITextBox{
    @Override
    public void display() {
        System.out.println("This is mac text box");
    }
}
