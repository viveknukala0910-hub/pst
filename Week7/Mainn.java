class Arithmetic {

    int add(int a,int b) {
        return a+b;
    }
}

class Adder extends Arithmetic {
}

public class Mainn {

    public static void main(String[] args) {

        Adder a = new Adder();

        System.out.println("Superclass: " + a.getClass().getSuperclass().getName());

        System.out.println(a.add(10,20));
        System.out.println(a.add(30,40));
    }
}