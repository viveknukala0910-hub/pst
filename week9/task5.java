import java.util.*;

class InsufficientStockException extends Exception {
    InsufficientStockException(String msg) {
        super(msg);
    }
}

class Order {
    int orderId;
    String productName;
    int quantity;
    int availableStock;

    Order(int id, String name, int qty, int stock) {
        this.orderId = id;
        this.productName = name;
        this.quantity = qty;
        this.availableStock = stock;
    }

    void process() throws InsufficientStockException {
        if (quantity > availableStock) {
            throw new InsufficientStockException("Order " + orderId + " failed: Insufficient stock");
        } else {
            System.out.println("Order " + orderId + " processed successfully");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int qty = sc.nextInt();
            int stock = sc.nextInt();

            Order order = new Order(id, name, qty, stock);

            try {
                order.process();
            } catch (InsufficientStockException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}