package arithmetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainTx {
    //739192348543
    //3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        String aStr = String.valueOf(a);
        char[] numArr = aStr.toCharArray();
        int index = maxNumIndex(numArr, numArr[0]);

        if (b > index) {
            char[] arr2 = new char[numArr.length - (index + 1)];
            System.arraycopy(numArr, index + 1, arr2, 0, numArr.length - (index + 1));
            for (int i = 0; i < arr2.length; i++) {
//                if (numArr[i]>max){
//                    max=numArr[i];
//                    index = i;
//                }
            }
            System.out.println(index);
        } else if (b < index) {

        } else {

        }

    }

    private static int maxNumIndex(char[] numArr, int max) {
        int index = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > max) {
                max = numArr[i];
                index = i;
            }
        }
        return index;
    }
}
