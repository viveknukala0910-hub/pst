class Singleton {

    private static Singleton instance;

    public String str;

    private Singleton(){}

    public static Singleton getInstance(){

        if(instance==null){
            instance=new Singleton();
        }

        return instance;
    }
}

public class SingletonPatternDemo {

    public static void main(String[] args) {

        Singleton obj = Singleton.getInstance();

        obj.str="Hello Singleton";

        System.out.println(obj.str);
    }
}