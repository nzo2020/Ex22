public class Vehicles {
    private int carNumber;
    private int age;
    private int wheelsNumber;
    private boolean shapeIsWheel;
    private double emissionsPerMin;


    public Vehicles(int carNumber, int age, int wheelsNumber, boolean shapeIsWheel, double emissionsPerMin) {
        this.carNumber = carNumber;
        this.age = age;
        this.wheelsNumber = wheelsNumber;
        this.shapeIsWheel = shapeIsWheel;
        this.emissionsPerMin = emissionsPerMin;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public boolean getShapeIsWheel() {
        return this.shapeIsWheel;
    }

    public void setShapeWheel(boolean shapeIsWheel) {
        this.shapeIsWheel = shapeIsWheel;
    }

    public double getEmissionsPerMin() {
        return emissionsPerMin;
    }

    public void setEmissionsPerMin(double emissionsPerMin) {
        this.emissionsPerMin = emissionsPerMin;
    }

    public double exhaust() {
        return this.emissionsPerMin * 60;
    }

    @Override
    public String toString() {
        return "carNumber=" + carNumber +
                ", age=" + age +
                ", wheelsNumber=" + wheelsNumber +
                ", shapeIsWheel='" + shapeIsWheel +
                ", emissionsPerMin=" + emissionsPerMin;
    }
}
