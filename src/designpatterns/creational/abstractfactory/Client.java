package designpatterns.creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        GUIFactory factory = GUIAbstractFactory.createFactory(OsTypes.WINDOWS);
        IButton button = factory.createButton();
        button.click();

        ITextBox textBox = factory.createTextBox();
        textBox.display();
    }
}
