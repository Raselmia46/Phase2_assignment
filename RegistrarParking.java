public class RegistrarParking {
    private final int carId;

    public RegistrarParking(int carId) {
        this.carId = carId;
    }

    public int getCarId() {
        return carId;
    }

    public void park() {
        System.out.println("Car " + carId + " is parked.");
    }
}