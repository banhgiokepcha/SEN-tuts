public class IronSuit extends Vehicle {

    public static void main(String[] args) {
        IronSuit.fly();
    }

    public IronSuit() {

    }
    public static void fly() {
        int miles = 20;
        System.out.print("A ");
        for (int i=0; i < miles; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(". ");
        }
        System.out.println(" B");

    }
}
