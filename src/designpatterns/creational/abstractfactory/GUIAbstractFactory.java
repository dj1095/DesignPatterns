package designpatterns.creational.abstractfactory;

public class GUIAbstractFactory {
    public static GUIFactory createFactory(OsTypes os) {
        GUIFactory factory = null;
        switch (os) {
            case WINDOWS:
                factory = new WindowsGUIFactory();
                break;
            case MAC:
                factory = new MacGUIFactory();
                break;
            default:
                System.out.println("Unkown Os Type");
                break;
        }
        return factory;
    }
}
