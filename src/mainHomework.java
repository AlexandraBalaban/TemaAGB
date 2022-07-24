public class mainHomework {

    public static void main(String[] args) {

        Driver dr1 = new Driver("Andrei", true);
        Car c1 = new Car();
        System.out.println(c1);

        c1.setDriver(dr1);
        System.out.println(c1);

        c1.setNumberOfSeats(4);
        c1.setKilometersDriven(5000);
        c1.setBrand("Opel");
        System.out.println(c1);

        Driver dr2 = new Driver("Marius", false);
        Car c2 = new Car(10000, "Volkswagen", 6, dr2);
        System.out.println(c2);

        Car bus1 = new Bus(10, true);
        System.out.println(bus1);

        Driver dr3 = new Driver("George", true);
        bus1.setDriver(dr3);
        System.out.println(bus1);

        bus1.setKilometersDriven(5000);
        bus1.setNumberOfSeats(40);
        bus1.setBrand("Mercedes-Benz");
        System.out.println(bus1);

        bus1.hasBeenDrivenForLong();
        bus1.sizeOfTheCar();
        Car bus2 = new Bus(15000, "Volvo", 25, null, 5, true);
        System.out.println(bus2);

        bus2.setDriver(dr1);
        System.out.println(bus2);

        bus2.hasBeenDrivenForLong();
        bus2.sizeOfTheCar();
    }

}
