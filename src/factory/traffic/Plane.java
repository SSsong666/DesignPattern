package factory.traffic;

public class Plane implements Traffic{
    @Override
    public void go() {
        System.out.println("飞机 gogo");
    }
}
