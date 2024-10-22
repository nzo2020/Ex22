public class Main {
    public static double sumOfEmissions(Vehicles[] vehicles) {
        double sum = 0;
        for (Vehicles v : vehicles) {
            sum = sum + v.exhaust();
        }
        return sum;
    }



    public static void noiseLevelAmount(Vehicles[] vehicles) {
        for (Vehicles v : vehicles) {
            if (v instanceof Regular) {
                ((Regular) v).noise();
            }
        }
    }

    public static int AmountOfPassengers(Vehicles[] vehicles) {
        int sum = 0;
        for (Vehicles v : vehicles) {
            if (v instanceof Bicycle) {
                sum = sum + 1;
            } else if (v instanceof Regular) {
                sum = sum + ((Regular) v).getHowManyPassengers() - 1;
            }
        }
        return sum;
    }

    public static double maxChargingTime(Vehicles[] vehicles) {
        double max = 0;
        int carWithMaxChargingTime = 0;
        for (Vehicles v : vehicles) {
            if (v instanceof Cart) {
                if (((Cart) v).getChargingTime() > max) {
                    max = ((Cart) v).getChargingTime();
                    carWithMaxChargingTime = v.getCarNumber();
                }
            }
        }
        return carWithMaxChargingTime;
    }
}