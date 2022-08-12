package singleton;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Test implements Serializable {
    public static void main(String[] args) {
////        ArrayDeque arrayDeque = new ArrayDeque();
        Map<String, String> map =new HashMap<String, String>();
        map.put("1","1");
        map.put("1","2");
        map.put("3","3");

        System.out.println(map);
    }
}
