public class Heavy extends Vehicles {
    private int trailersTheVehicleCanPull;

    public Heavy(int carNumber, int age, int wheelsNumber, boolean shapeIsWheel, double emissionsPerMin, int trailersTheVehicleCanPull) {
        super(carNumber, age, wheelsNumber, shapeIsWheel, emissionsPerMin);
        this.trailersTheVehicleCanPull = trailersTheVehicleCanPull;
    }

    public int getTrailersTheVehicleCanPull() {
        return this.trailersTheVehicleCanPull;
    }

    public void setTrailersTheVehicleCanPull(int trailersTheVehicleCanPull) {
        this.trailersTheVehicleCanPull = trailersTheVehicleCanPull;
    }

    @Override
    public double exhaust() {
        return super.exhaust() + (500 * trailersTheVehicleCanPull);
    }

    @Override
    public String toString() {
        return super.toString() +
                " ,trailersTheVehicleCanPull=" + this.trailersTheVehicleCanPull;
    }
}
