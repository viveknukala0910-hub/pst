import java.util.*;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            if (sub.compareTo(smallest) < 0) smallest = sub;
            if (sub.compareTo(largest) > 0) largest = sub;
        }

        System.out.println(smallest);
        System.out.println(largest);
    }
}
