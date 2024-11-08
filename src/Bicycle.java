public class Bicycle extends WheeledTransport {
    public Bicycle(String type, byte wheelCount) {
        super(type, wheelCount);
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
    public void service() {
        System.out.println("Thank you for using our auto service! Good luck while driving!");
    }
}
