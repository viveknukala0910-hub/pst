public class EvenOddDigitSum {
    public static void main(String[] args) {
        int num = 1234;
        String type = "even";
        int sum = 0;

        while (num > 0) {
            int d = num % 10;
            if (type.equals("even") && d % 2 == 0)
                sum += d;
            if (type.equals("odd") && d % 2 != 0)
                sum += d;
            num /= 10;
        }

        System.out.println(sum);
    }
}
