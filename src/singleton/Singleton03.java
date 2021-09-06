package singleton;

public class Singleton03 {
    private Singleton03(){}

    //volatile是为了解决语句重排
    private static volatile Singleton03 ins;

    public static Singleton03 getInstance(){
        //为什么要加两个if语句，第二个if已经解决问题了，那第一个作用是什么？
        //第一个if作用就是为了解决，如果已经有对象了，就直接跳过，提高性能
        if (ins == null){
            synchronized (Singleton03.class){
                if(ins == null){
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ins = new Singleton03();
                }
            }
        }
        return ins;
    }

}
