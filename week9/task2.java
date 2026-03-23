import java.util.*;

class Vehicle {
    int vehicleId;
    String modelName;
    double baseRent;

    Vehicle(int id, String name, double rent) {
        this.vehicleId = id;
        this.modelName = name;
        this.baseRent = rent;
    }

    double calculateRent() {
        return baseRent;
    }
}

class Car extends Vehicle {
    int seats;

    Car(int id, String name, double rent, int seats) {
        super(id, name, rent);
        this.seats = seats;
    }

    double calculateRent() {
        return baseRent + (seats * 100);
    }
}

class Bike extends Vehicle {
    int engineCapacity;

    Bike(int id, String name, double rent, int capacity) {
        super(id, name, rent);
        this.engineCapacity = capacity;
    }

    double calculateRent() {
        return baseRent + (engineCapacity * 2);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Vehicle> vehicles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            char type = sc.next().charAt(0);
            int id = sc.nextInt();
            String model = sc.next();
            double rent = sc.nextDouble();

            if (type == 'C') {
                int seats = sc.nextInt();
                vehicles.add(new Car(id, model, rent, seats));
            } else {
                int capacity = sc.nextInt();
                vehicles.add(new Bike(id, model, rent, capacity));
            }
        }

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle ID: " + v.vehicleId +
                    ", Model: " + v.modelName +
                    ", Total Rent: " + v.calculateRent());
        }
    }
}