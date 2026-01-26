import java.util.*;

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
}

public class SimplePersonTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            persons[i] = new Person(name, age);
        }
        for (Person p : persons) {
            System.out.print(p.name + " ");
        }
    }
}
