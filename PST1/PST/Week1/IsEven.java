public class IsEven {

    public int isEven(int input1) {
        return (input1 % 2 == 0) ? 2 : 1;
    }
    public static void main(String[] args) {
        IsEven obj = new IsEven();
        System.out.println(obj.isEven(10));
    }
}
