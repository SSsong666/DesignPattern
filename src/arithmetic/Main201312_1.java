package arithmetic;

import java.util.*;

/**
 * 问题描述
 * 　　给定n个正整数，找出它们中出现次数最多的数。如果这样的数有多个，请输出其中最小的一个。
 * 输入格式
 * 　　输入的第一行只有一个正整数n(1 ≤ n ≤ 1000)，表示数字的个数。
 * 　　输入的第二行有n个整数s1, s2, …, sn (1 ≤ si ≤ 10000, 1 ≤ i ≤ n)。相邻的数用空格分隔。
 * 输出格式
 * 　　输出这n个次数中出现次数最多的数。如果这样的数有多个，输出其中最小的一个。
 * 样例输入
 * 6
 * 10 1 10 20 30 20
 * 样例输出
 * 10
 */
public class Main201312_1 {
    public static void main(String[] args) {
        new Main201312_1().run();
    }

    public void moreNum() {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        if (count < 1) {
            count = 0;
        } else if (count > 1000) {
            count = 1000;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            if (sc.hasNextLine()) {
                int num = sc.nextInt();
                if (num >= 1 && num <= 10000) {
                    list.add(num);
                }
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : list) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int value = 0;
        int key = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > value) {
                value = entry.getValue();
                key = entry.getKey();
            }
            if (entry.getValue() == (value) && entry.getKey() < key) {
                value = entry.getValue();
                key = entry.getKey();
            }
        }

        System.out.println(key);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            //需要重写compare（）方法（默认升序），改成按value降序
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o2.getValue() - o1.getValue());//返回值为正，则将2个对象对调
            }
        });
        System.out.println(list.get(0).getKey()); //获取出现次数最多的那个数
    }
}