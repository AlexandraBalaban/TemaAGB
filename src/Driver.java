public class Driver {

    private String name;
    private boolean isExperienced;

    public Driver() {
        super();
    }

    public Driver(String name) {
        this.name = name;
    }

    public Driver(String name, boolean isExperienced) {
        this.name = name;
        this.isExperienced = isExperienced;
    }

    public String getName() {
        return name;
    }

    public boolean isExperienced() {
        return isExperienced;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperienced(boolean experienced) {
        isExperienced = experienced;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", isExperienced=" + isExperienced +
                '}';
    }
}
