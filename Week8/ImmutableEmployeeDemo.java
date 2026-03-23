final class Employee{

    private final int id;
    private final String name;

    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    int getId(){
        return id;
    }

    String getName(){
        return name;
    }
}

public class ImmutableEmployeeDemo{

    public static void main(String[] args){

        Employee e=new Employee(101,"Rohith");

        System.out.println(e.getId());
        System.out.println(e.getName());
    }
}