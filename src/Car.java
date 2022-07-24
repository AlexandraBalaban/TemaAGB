import java.util.Objects;
public class Car {

    private int kilometersDriven;
    private String brand;
    private int numberOfSeats;
    private Driver driver;

    public Car() {
        this.driver = new Driver("Marius");
    }

    public Car(int kilometersDriven, String brand, int numberOfSeats, Driver driver) {
        this.kilometersDriven = kilometersDriven;
        this.brand = brand;
        this.numberOfSeats = numberOfSeats;
        this.driver = driver;
    }

    public Car(Driver driver) {
        this.driver = driver;
    }

    public int getKilometersDriven() {
        return this.kilometersDriven;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public Driver getDriver() {
        return this.driver;
    }

    public void setKilometersDriven(int kilometersDriven) {
        this.kilometersDriven = kilometersDriven;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String toString() {
        return "Car{kilometersDriven=" + this.kilometersDriven + ", brand='" + this.brand + "', numberOfSeats=" + this.numberOfSeats + ", driver=" + this.driver + "}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Car car = (Car)o;
            return this.kilometersDriven == car.kilometersDriven && this.numberOfSeats == car.numberOfSeats && Objects.equals(this.brand, car.brand) && Objects.equals(this.driver, car.driver);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.kilometersDriven, this.brand, this.numberOfSeats, this.driver});
    }

    public void hasBeenDrivenForLong() {
        if (this.kilometersDriven <= 10000) {
            System.out.println("The car hasn't been driven for long.");
        } else {
            System.out.println("The car has been driven for long");
        }

    }

    public void sizeOfTheCar() {
        if (this.numberOfSeats < 30) {
            System.out.println("This is a small car.");
        } else {
            System.out.println("This is a large car.");
        }

    }

}
