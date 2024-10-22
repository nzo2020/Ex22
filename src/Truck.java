public class Truck extends Heavy {
    private double maxLoadWeight;

    public Truck(int carNumber, int age, int wheelsNumber, boolean shapeIsWheel, double emissionsPerMin, int trailersTheVehicleCanPull, double maxLoadWeight) {
        super(carNumber, age, wheelsNumber, shapeIsWheel, emissionsPerMin, trailersTheVehicleCanPull);
        this.maxLoadWeight = maxLoadWeight;
    }

    public double getMaxLoadWeight() {
        return this.maxLoadWeight;
    }

    public void setMaxLoadWeight(double maxLoadWeight) {
        this.maxLoadWeight = maxLoadWeight;
    }

    @Override
    public double exhaust() {
        return super.exhaust() * 1.5;
    }

    @Override
    public String toString() {
        return super.toString() +
                " ,maxLoadWeight=" + this.maxLoadWeight;
    }
}
