interface PerformOperation {
    boolean check(int a);
}

public class LambdaExample {

    static PerformOperation isOdd() {
        return a -> a % 2 != 0;
    }

    static PerformOperation isPrime() {
        return a -> {
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    static PerformOperation isPalindrome() {
        return a -> {
            String s = String.valueOf(a);
            return s.equals(new StringBuilder(s).reverse().toString());
        };
    }

    public static void main(String[] args) {
        int num = 11;

        System.out.println("Odd: " + isOdd().check(num));
        System.out.println("Prime: " + isPrime().check(num));
        System.out.println("Palindrome: " + isPalindrome().check(num));
    }
}
