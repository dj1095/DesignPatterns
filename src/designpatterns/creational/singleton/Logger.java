package designpatterns.creational.singleton;

public class Logger {
    private static Logger logger = new Logger();
    private static int counter = 1;
    private Logger() {
    }

    public static  Logger getInstance(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Instances created: " + counter);
        return logger;
    }

    public void log(String message){
        System.out.println(message);
    }
}
