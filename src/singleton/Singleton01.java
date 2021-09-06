package singleton;

/**
 * 饿汉模式,不加锁
 */
public class Singleton01 {
    private Singleton01(){}

    private static final Singleton01 instance = new Singleton01();

    public static Singleton01 getInstance(){
        return instance;
    }

    public void show(){
        System.out.println("hello world");
    }
}
