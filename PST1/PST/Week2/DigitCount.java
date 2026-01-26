import java.util.*;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = String.valueOf(num).length();
        System.out.println("Digits count: " + count);
    }
}
