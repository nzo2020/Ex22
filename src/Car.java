public class Car extends Regular {
    private boolean isElectric;

    public Car(int carNumber, int age, int wheelsNumber, boolean shapeIsWheel, double emissionsPerMin, int howManyPassengers, boolean isElectric) {
        super(carNumber, age, wheelsNumber, shapeIsWheel, emissionsPerMin, howManyPassengers);
        this.isElectric = isElectric;
    }

    public boolean getIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return super.toString() +
                " ,isElectric=" + this.isElectric;
    }
}