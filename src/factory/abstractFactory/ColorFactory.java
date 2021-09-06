package factory.abstractFactory;

import factory.color.Color;
import factory.color.Green;
import factory.color.Red;
import factory.traffic.Traffic;

public class ColorFactory extends AbstractFactory{

    @Override
    public Color getColor(String code) {
        if (code==null){
            return null;
        }
        if (code.equals("red")){
            return new Red();
        }else if (code.equals("green")){
            return new Green();
        }
        return null;
    }

    @Override
    public Traffic getTraffic(String code) {
        return null;
    }
}
