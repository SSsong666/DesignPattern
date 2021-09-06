package factory.traffic;

public class Car implements Traffic{
    @Override
    public void go() {
        System.out.println("汽车gogo");
    }
}
