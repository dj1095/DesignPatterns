package designpatterns.creational.singleton;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        /*Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();
        System.out.println(logger1 == logger);
        logger.log("This is Log");*/

        Runnable r1 = () -> {
            Logger.getInstance().log("Thread1");
        };
        Runnable r2 = () -> {
            Logger.getInstance().log("Thread2");
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
