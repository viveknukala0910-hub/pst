class ParkingSystem {

    int big, medium, small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {

        if (carType == 1 && big > 0) {
            big--;
            return true;
        }

        if (carType == 2 && medium > 0) {
            medium--;
            return true;
        }

        if (carType == 3 && small > 0) {
            small--;
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        ParkingSystem ps = new ParkingSystem(1,1,0);

        System.out.println(ps.addCar(1));
        System.out.println(ps.addCar(2));
        System.out.println(ps.addCar(3));
    }
}