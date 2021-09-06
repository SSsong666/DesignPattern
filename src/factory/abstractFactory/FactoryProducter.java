package factory.abstractFactory;

public class FactoryProducter {
    public static AbstractFactory getFactory(String code){
        if (code.equals("traffic")) {
            return new TrafficFactory();
        }else if (code.equals("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
