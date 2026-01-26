import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int left = 0, right = input.length() - 1;
        input = input.toLowerCase();
        boolean isPalindrome = true;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}
