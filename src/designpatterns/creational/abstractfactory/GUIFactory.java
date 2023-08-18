package designpatterns.creational.abstractfactory;

public abstract class GUIFactory {
    public abstract  IButton createButton();
    public abstract  ITextBox createTextBox();
}
