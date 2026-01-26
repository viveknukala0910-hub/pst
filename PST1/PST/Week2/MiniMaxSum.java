import java.util.*;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(sc.nextInt());
        }

        long sum = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int n : arr) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        System.out.println((sum - max) + " " + (sum - min));
    }
}
