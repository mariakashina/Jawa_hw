package lesson6_hw;

class ParkingSystem {
    private int[] space;

    public ParkingSystem(int big, int medium, int small) {
        space = new int[]{0, big, medium, small};
    }

    public boolean addCar(int carType) {
        if (space[carType] == 0) {
            return false;
        }
        --space[carType];
        return true;
    }
}

