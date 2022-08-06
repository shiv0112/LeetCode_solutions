// Design Parking System
class ParkingSystem {
    int big, medium, small;

    public ParkingSystem(int b, int m, int s) {
        big = b;
        medium = m;
        small = s;
    }

    public boolean addCar(int carType) {
        if (carType == 1 && big != 0) {
            big--;
            return (true);
        } else if (carType == 2 && medium != 0) {
            medium--;
            return (true);
        } else if (carType == 3 && small != 0) {
            small--;
            return (true);
        } else
            return (false);
    }

    public List<Boolean> main(int[][] a, int[][] b) {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        list.add(null);
        ParkingSystem obj = new ParkingSystem(b[0][0], b[0][1], b[0][2]);
        for (int i = 1; i < b.length; i++) {
            list.add(obj.addCar(b[i][0]));
        }
        return (list);
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */