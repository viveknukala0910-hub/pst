import java.util.*;

public class GetCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int sum=0;
        for(char c:s.toCharArray()){
            sum += (int)c;
        }

        System.out.println(sum);
    }
}
