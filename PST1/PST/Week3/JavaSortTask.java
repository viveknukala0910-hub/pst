import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id,String name,double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
}

public class JavaSortTask {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Rohit",8.2));
        list.add(new Student(2,"Amit",9.5));
        list.add(new Student(3,"Rahul",7.9));

        Collections.sort(list,(a,b)->{
            if(a.cgpa!=b.cgpa) return Double.compare(b.cgpa,a.cgpa);
            if(!a.name.equals(b.name)) return a.name.compareTo(b.name);
            return a.id-b.id;
        });

        for(Student s:list){
            System.out.println(s.name+" "+s.cgpa);
        }
    }
}
