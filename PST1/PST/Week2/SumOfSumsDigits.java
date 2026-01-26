import java.util.*;

public class SumOfSumsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String s = String.valueOf(num);
        int totalSum = 0;

        for (int i = 0; i < s.length(); i++) {
            int currSum = 0;
            for (int j = i; j < s.length(); j++) {
                currSum += s.charAt(j) - '0';
            }
            totalSum += currSum;
        }

        System.out.println("Result: " + totalSum);
    }
}
