public class Vehicle {
    private String name;
    private double width;
    private double height;
    private double length;
    private double weight;
    private int seatingCapacity;
    private String registrationNumber;

    public Vehicle() {

    }


    public Vehicle(String n, double wi, double h, double l, double we, int sc, String rn) {
        this.name = n;
        this.width = wi;
        this.height = h;
        if (validateLength(l)) {
            this.length = l;
        }
        if (validateWeight(we)) {
            this.weight = we;
        }
        this.seatingCapacity = sc;
        if (validateRegistrationNumber(rn)) {
            this.registrationNumber = rn;
        }
    }

    public boolean validateWeight(double we) {
        return true;
    }

    public boolean validateLength(double l) {
        return true;
    }

    public boolean validateRegistrationNumber(String rn) {
        if (rn.length() > 0 && rn.length() <= 12) {
            return true;
        }
        System.err.println("invalid registrationNumber for vehicle");
        return false;
    }

    @Override
    public String toString() {

        return this.getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", weight=" + weight +
                ", seatingCapacity=" + seatingCapacity +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }

}
