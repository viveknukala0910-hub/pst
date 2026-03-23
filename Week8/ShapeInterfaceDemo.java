interface Shape{

    double area();
}

class Circle implements Shape{

    double radius;

    Circle(double r){
        radius=r;
    }

    public double area(){
        return 3.14*radius*radius;
    }
}

public class ShapeInterfaceDemo{

    public static void main(String[] args){

        Circle c=new Circle(5);

        System.out.println("Area = "+c.area());
    }
}