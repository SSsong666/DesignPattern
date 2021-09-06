package factory.abstractFactory;

import factory.color.Color;
import factory.traffic.Traffic;

public abstract class AbstractFactory {
    public abstract Color getColor(String code);
    public abstract Traffic getTraffic(String code);
}
