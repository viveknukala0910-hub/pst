final class Student{

    private final String name;
    private final int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }
}

public class ImmutableStudentDemo{

    public static void main(String[] args){

        Student s=new Student("Rohith",21);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}