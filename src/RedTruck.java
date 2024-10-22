public class RedTruck extends Truck {
    private String color;

    public RedTruck(int carNumber, int age, int wheelsNumber, boolean shapeIsWheel, double emissionsPerMin, int trailersTheVehicleCanPull, double maxLoadWeight, String color) {
        super(carNumber, age, wheelsNumber, shapeIsWheel, emissionsPerMin, trailersTheVehicleCanPull, maxLoadWeight);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                " ,color=" + this.color;
    }
}