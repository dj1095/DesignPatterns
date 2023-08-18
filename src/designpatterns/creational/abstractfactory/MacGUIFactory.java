package designpatterns.creational.abstractfactory;

public class MacGUIFactory extends GUIFactory{
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new MacTextBox();
    }
}
