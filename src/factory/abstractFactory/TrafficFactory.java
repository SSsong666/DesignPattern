package factory.abstractFactory;

import factory.color.Color;
import factory.traffic.Car;
import factory.traffic.Plane;
import factory.traffic.Traffic;

public class TrafficFactory extends AbstractFactory{

    @Override
    public Color getColor(String code) {
        return null;
    }

    @Override
    public Traffic getTraffic(String code){
        if (code==null){
            return null;
        }
        if (code.equals("car")){
            return new Car();
        }else if (code.equals("plane")){
            return new Plane();
        }
        return null;
    }
}
