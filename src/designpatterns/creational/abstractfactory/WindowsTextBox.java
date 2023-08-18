package designpatterns.creational.abstractfactory;

public class WindowsTextBox implements ITextBox{
    @Override
    public void display() {
        System.out.println("This is windows text box");
    }
}
