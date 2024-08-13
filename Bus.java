public class Bus extends Vehicle {
    public Bus(String n, double wi, double h, double l, double we, int sc, String rn) {
        super(n, wi, h, l, we, sc, rn);
    }

    @Override
    public boolean validateWeight(double we) {
        if (we >= 5000 && we <= 20000) {
            return true;
        }
        System.err.println("invalid weight for bus");
        return false;
    }

    @Override
    public boolean validateLength(double l) {
        if (l >= 4 && l <= 10) {
            return true;
        }
        System.err.println("invalid length for bus");
        return false;
    }

    @Override
    public boolean validateRegistrationNumber(String rn) {
        if (rn.length() > 0 && rn.length() <= 8) {
            return true;
        }
        System.err.println("invalid registrationNumber for bus");
        return false;
    }
}
