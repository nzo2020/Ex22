public class Kibbutz {
    private Vehicles[] vehicles;
    private int amountOfVehicles;

    public Kibbutz() {
        this.vehicles = new Vehicles[500];
        this.amountOfVehicles = 0;
    }

    public void addVehicle(Vehicles vehicle) {
        if (amountOfVehicles < 500) {
            vehicles[amountOfVehicles] = vehicle;
            amountOfVehicles++;
        }
    }

    public Vehicles[] listOfVehicles() {
        int count = 0;
        for (Vehicles v : this.vehicles) {
            if (v.getAge() > 15 && v.getShapeIsWheel()) {
                count++;
            }
        }

        Vehicles[] vehicles1 = new Vehicles[count];
        count = 0;
        for (Vehicles v : this.vehicles) {
            if (v.getAge() > 15 && v.getShapeIsWheel()) {
                vehicles1[count] = v;
                count++;
            }
        }
        return vehicles1;
    }

    public int wheelsCount() {
        int count = 0;
        for (Vehicles v : this.vehicles) {
            if (v instanceof Regular || v instanceof Light) {
                if (v.getShapeIsWheel()) {
                    count++;
                }
            }
        }
        return count;
    }
}