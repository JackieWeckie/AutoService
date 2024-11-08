public class Car extends MotorizedTransport {
    public Car(String engineType, String model) {
        super(engineType, model);
    }

    @Override
    public void showEngineType() {
        System.out.println("The engine type of this transport is " + engineType);
    }

    @Override
    public void showModel() {
        System.out.println("The model of this transport is " + model);
    }

    @Override
    public void makeRepaired() {
        System.out.println("The " + model + " was successfully repaired!");
    }

    @Override
    public void makePumped() {
        System.out.println("The " + model + "'s wheels was successfully pumped!");
    }

    @Override
    public void service() {
        System.out.println("Thank you for using our auto service! Good luck while driving!");
    }
}
