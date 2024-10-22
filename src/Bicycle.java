public class Bicycle extends Light {
    private boolean hasBasket;

    public Bicycle(int carNumber, int age, int wheelsNumber, boolean shapeIsWheel, double emissionsPerMin, boolean hasEngine, boolean hasBasket) {
        super(carNumber, age, wheelsNumber, shapeIsWheel, emissionsPerMin, hasEngine);
        this.hasBasket = hasBasket;
    }

    public boolean getHasBasket() {
        return this.hasBasket;
    }

    public void setHasBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }

    @Override
    public String toString() {
        return super.toString() +
                " ,hasBasket=" + this.hasBasket;
    }
}
