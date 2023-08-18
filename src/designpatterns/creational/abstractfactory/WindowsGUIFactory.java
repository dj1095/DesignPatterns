package designpatterns.creational.abstractfactory;

public class WindowsGUIFactory extends GUIFactory {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new WindowsTextBox();
    }
}
