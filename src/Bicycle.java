public class Bicycle extends WheeledTransport {
    public Bicycle(String type, byte wheelCount, String color) {
        super(type, wheelCount, color);
    }

    @Override
    public void makeRepaired() {
        System.out.println("The " + type + " was successfully repaired!");
    }

    @Override
    public void makePumped() {
        System.out.println("The " + type + "'s wheels was successfully pumped!");
    }

    @Override
    public void makeColored() {
        System.out.println("The " + type + " was successfully painted!");
    }

    @Override
    public void service() {
        System.out.println("Thank you for using our auto service! Good luck while driving!");
    }
}
