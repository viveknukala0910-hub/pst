import java.util.*;

public class ExceptionHandlingDemo{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        try{

            int x=sc.nextInt();
            int y=sc.nextInt();

            System.out.println(x/y);
        }

        catch(ArithmeticException e){

            System.out.println("java.lang.ArithmeticException: / by zero");
        }

        catch(InputMismatchException e){

            System.out.println("java.util.InputMismatchException");
        }
    }
}