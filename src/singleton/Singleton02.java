package singleton;

public class Singleton02 {
    private Singleton02(){}

    private static Singleton02 ins;

    public static Singleton02 getInstance(){
        if(ins == null){
            ins = new Singleton02();
        }
        return ins;
    }

}
