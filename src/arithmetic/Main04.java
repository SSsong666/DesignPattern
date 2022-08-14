package arithmetic;

public class Main04 {
    public static int maxChunksToSorted(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; ) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= arr[i]) {
                    count++;
                    i = j;
                    break;
                }
                if (j == arr.length - 1) {
                    i = arr.length;
                }
            }

        }
        return count + 1;
    }

    public static void main(String[] args) {
//        int[] arr={4,2,2,1,1};
//        int[] arr={5,4,3,2,1};
        int[] arr = {2, 1, 3, 4, 4};
        System.out.println(maxChunksToSorted(arr));
//        for (int i=0;i<10;i++){
//            System.out.println("i--"+i);
//            for (int j=0; j<10;j++){
//                System.out.println("j:"+j);
//                break;
//            }
//        }
    }
}
