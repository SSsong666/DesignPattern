package adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 适配器
 * JDBC -> JDBC-ODBC-Bridge -> ODBC -> SQLServer
 * jdbc-odbc-bridge就是jdbc和odbc的适配器
 */
public class Main {
    //bufferedReader 和 inputstream的转接
    public static void main(String[] args) throws Exception {
//        FileInputStream fis = new FileInputStream("D:/2904.txt");
//        InputStreamReader isr = new InputStreamReader(fis);
//        BufferedReader br = new BufferedReader(isr);
//        String line = br.readLine();
//        while (line!=null&&!line.equals("")){
//            System.out.println(line);
//        }
//        br.close();
        test1();
    }

    private static void test1() {
        System.out.println("111");

    }
}
