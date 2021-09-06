package factory.traffic;

public class TrafficFactory {

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
