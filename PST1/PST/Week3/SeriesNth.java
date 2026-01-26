import java.util.*;

public class SeriesNth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a=1,b=2,c;

        if(n==1) 

        System.out.println(a);
        else 
            if(n==2)
               System.out.println(b);
        else{
            for(int i=3;i<=n;i++){
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(b);
        }
    }
}
