public class Tractor extends Heavy {
    private String typesOfTrailers;

    public Tractor(int carNumber, int age, int wheelsNumber, boolean shapeIsWheel, double emissionsPerMin, int trailersTheVehicleCanPull, String typesOfTrailers) {
        super(carNumber, age, wheelsNumber, shapeIsWheel, emissionsPerMin, trailersTheVehicleCanPull);
        this.typesOfTrailers = typesOfTrailers;
    }

    public String getTypesOfTrailers() {
        return this.typesOfTrailers;
    }

    public void setTypesOfTrailers(String typesOfTrailers) {
        this.typesOfTrailers = typesOfTrailers;
    }

    public String ToString() {
        return "Tractor{" +
                "typesOfTrailers=" + this.typesOfTrailers +
                '}';

    }
}
