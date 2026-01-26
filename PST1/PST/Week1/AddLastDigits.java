public class AddLastDigits {
    public static void main(String[] args) {
        int a = 27;
        int b = 39;

        a = Math.abs(a);
        b = Math.abs(b);

        System.out.println((a % 10) + (b % 10));
    }
}
