import java.util.*;

public class WeightHillPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int weight = sc.nextInt();
        int increment = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= rows; i++) {
            sum += i * weight;
            weight += increment;
        }

        System.out.println("Total Weight: " + sum);
    }
}
