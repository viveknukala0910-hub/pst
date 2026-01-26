import java.util.*;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 1, 9};
        int k = 3;

        Arrays.sort(arr);
        System.out.println(arr[k - 1]);
    }
}
