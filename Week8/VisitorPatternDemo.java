interface Visitor{
    void visit(Book book);
}

class Book{

    int price=500;

    void accept(Visitor v){
        v.visit(this);
    }
}

class PriceVisitor implements Visitor{

    public void visit(Book book){
        System.out.println("Book price: "+book.price);
    }
}

public class VisitorPatternDemo{

    public static void main(String[] args){

        Book b=new Book();
        Visitor v=new PriceVisitor();

        b.accept(v);
    }
}