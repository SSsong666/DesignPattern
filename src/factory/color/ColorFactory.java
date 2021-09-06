package factory.color;

public class ColorFactory {
    public Color getColor(String code){
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
}
