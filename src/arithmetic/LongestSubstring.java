package arithmetic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int sl=s.length();
        Set<Character> set = new HashSet<Character>();
        int le = 0;
        int n = 0;
        for (int j = 0; j < arr.length; j++) {
            if (set.contains(arr[j])) {
                int count = 0;
                while (n < j) {
                    set.remove(arr[n]);
                    count++;
                    n++;
                }
                if (le < count) {
                    le = count;
                }
            }
            set.add(arr[j]);
        }
        return le;
    }
}
