import factory.abstractFactory.AbstractFactory;
import factory.abstractFactory.FactoryProducter;
import factory.color.Color;
import factory.traffic.Traffic;
import factory.traffic.TrafficFactory;

import java.math.BigDecimal;
import java.util.*;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
//        singleton.Singleton01 ob = singleton.Singleton01.getInstance();
//        ob.show();

//        for (int i=0; i<100; i++){
//            new Thread(()->{
////                singleton.Singleton04 ob4 = singleton.Singleton04.getInstance();
////                System.out.println(ob4.hashCode());
//                Singleton05 ob5 = Singleton05.INSTANCE;
//                System.out.println(ob5.hashCode());
//            }).start();
//        }
//
//        Singleton04 ob4 = Singleton04.getInstance();
//        System.out.println(ob4.hashCode());
//        test1();
//        test2();
//        testFactory();
        testAbstractFactory();

    }

    public static void test1(){
        List<Integer> list = new ArrayList<>();
        Integer[] strArrays = {1,1,2,3};
        list.addAll(Arrays.asList(strArrays));
        System.out.println(list);

        Map<String, String> map =new HashMap<>();
        map.put("1","1");
        map.put("1","11");
        map.put("2","2");
        map.put("3","3");
        System.out.println(map.get("4"));
        if (map.keySet().contains("4")){
            System.out.println(map.keySet());
        }

        String str = " key:Application value:nice";
        String ss = str.trim().replace("key:", "").replace(" value:",",");
        System.out.println(ss);

        List<String> list1 = new ArrayList<>();
        list1.add("bb");
        list1.add("aa");
        list1.add("dd");
        list1.add("cc");
        list1.add("CC");
        System.out.println(list1);
        Collections.sort(list1, (a,z)->a.compareTo(z));
        System.out.println(list1);


    }
    public static void test2(){
        BigDecimal a = null;
        a.setScale(2, BigDecimal.ROUND_DOWN).doubleValue();
        System.out.println(a);
    }

    public static void testFactory(){
        TrafficFactory factory = new TrafficFactory();
        Traffic car = factory.getTraffic("car");
        car.go();
        Traffic plane = factory.getTraffic("plane");
        plane.go();
    }

    public static void testAbstractFactory(){
        AbstractFactory tp = FactoryProducter.getFactory("traffic");
        Traffic traffic = tp.getTraffic("car");
        traffic.go();
        AbstractFactory cp = FactoryProducter.getFactory("color");
        Color color = cp.getColor("red");
        color.fill();
    }
}
