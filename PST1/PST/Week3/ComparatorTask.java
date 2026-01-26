import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class ComparatorTask {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Rohit",8.5));
        list.add(new Student(2,"Amit",9.1));
        list.add(new Student(3,"Rahul",9.1));

        list.sort((a,b) -> {
            if (a.cgpa != b.cgpa) return Double.compare(b.cgpa, a.cgpa);
            return a.name.compareTo(b.name);
        });

        for(Student s : list){
            System.out.println(s.name + " " + s.cgpa);
        }
    }
}
