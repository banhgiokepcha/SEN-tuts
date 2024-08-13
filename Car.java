public class Car extends Vehicle {
    public Car(String n, double wi, double h, double l, double we, int sc, String rn) {
        super(n, wi, h, l, we, sc, rn);
    }

    @Override
    public boolean validateWeight(double we) {
        if (we >= 1000 && we <= 2000) {
            return true;
        }
        System.err.println("invalid weight for car");
        return false;
    }

    @Override
    public boolean validateLength(double l) {
        if (l >= 1.5 && l <= 3.5) {
            return true;
        }
        System.err.println("invalid length for car");
        return false;
    }

    @Override
    public boolean validateRegistrationNumber(String rn) {
        if (rn.length() > 0 && rn.length() <= 6) {
            return true;
        }
        System.err.println("invalid registrationNumber for car");
        return false;
    }
}
