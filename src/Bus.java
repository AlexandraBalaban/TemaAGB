public class Bus extends Car {

    private int lineNumber;
    private boolean isElectric;

    public Bus() {
    }

    public Bus(int lineNumber, boolean isElectric) {
        this.lineNumber = lineNumber;
        this.isElectric = isElectric;
    }

    public Bus(int kilometersDriven, String brand, int numberOfSeats, Driver driver, int lineNumber, boolean isElectric) {
        super(kilometersDriven, brand, numberOfSeats, driver);
        this.lineNumber = lineNumber;
        this.isElectric = isElectric;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public boolean isElectric() {
        return this.isElectric;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void setElectric(boolean electric) {
        this.isElectric = electric;
    }

    public String toString() {
        int var10000 = this.lineNumber;
        return "Bus{lineNumber=" + var10000 + "', isElectric=" + this.isElectric + " " + super.toString() + "}";
    }

    public void hasBeenDrivenForLong() {
        super.hasBeenDrivenForLong();
    }

    public void sizeOfTheCar() {
        super.sizeOfTheCar();
    }

}
