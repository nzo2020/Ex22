public class Light extends Vehicles {
    private boolean hasEngine;

    public Light(int carNumber, int age, int wheelsNumber, boolean shapeIsWheel, double emissionsPerMin, boolean hasEngine) {
        super(carNumber, age, wheelsNumber, shapeIsWheel, emissionsPerMin);
        this.hasEngine = hasEngine;
    }

    public boolean getHasEngine() {
        return this.hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    @Override
    public String toString() {
        return super.toString() +
                " ,hasEngine=" + this.hasEngine;
    }
}
