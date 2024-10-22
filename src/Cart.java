public class Cart extends Light {
    private double chargingTime;

    public Cart(int carNumber, int age, int wheelsNumber, boolean shapeIsWheel, double emissionsPerMin, boolean hasEngine, double chargingTime) {
        super(carNumber, age, wheelsNumber, shapeIsWheel, emissionsPerMin, hasEngine);
        this.chargingTime = chargingTime;
    }

    public double getChargingTime() {
        return this.chargingTime;
    }

    public void setChargingTime(double chargingTime) {
        this.chargingTime = chargingTime;
    }

    @Override
    public double exhaust() {
        return super.exhaust() + 5;
    }

    public void hitchhikers() {
        System.out.println("The cart can take 3 passengers ");
    }

    @Override
    public String toString() {
        return super.toString() +
                " ,chargingTime=" + this.chargingTime;
    }
}