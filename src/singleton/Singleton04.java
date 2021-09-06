package singleton;

public class Singleton04 {
    private Singleton04(){}

    private static class SingletonInner{
        private static final Singleton04 ins = new Singleton04();
    }

    public static Singleton04 getInstance(){
        return SingletonInner.ins;
    }

}
