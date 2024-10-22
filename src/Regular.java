public class Regular extends Vehicles {
    private int howManyPassengers;

    public Regular(int carNumber, int age, int wheelsNumber, boolean shapeIsWheel, double emissionsPerMin, int howManyPassengers) {
        super(carNumber, age, wheelsNumber, shapeIsWheel, emissionsPerMin);
        this.howManyPassengers = howManyPassengers;
    }

    public int getHowManyPassengers() {
        return this.howManyPassengers;
    }

    public void setHowManyPassengers(int howManyPassengers) {
        this.howManyPassengers = howManyPassengers;
    }

    @Override
    public double exhaust() {
        return super.exhaust() + 10;
    }

    public void noise() {
        System.out.println("Noise level: 70db");
    }

    public void hitchhikers() {
        System.out.println("The car can take: " + (this.howManyPassengers - 1) + " hitchhikers");
    }

    @Override
    public String toString() {
        return super.toString() +
                " ,howManyPassengers=" + this.howManyPassengers;
    }
}
