/** This is a program that outputs repairing vehicles to the console
 *  This is a first version of this. It's not an app or a web service.
 */


public class Main {
    public static void main(String[] args) {
        Bicycle bycicle = new Bicycle("BMX", (byte) 2);
        Car car = new Car("Three-Cylindered Oiled", "BMW I8");
        Truck truck = new Truck("Diesel", "Ford F-Max");

        System.out.println(bycicle.type + ":");
        bycicle.makePumped();
        bycicle.makeRepaired();
        bycicle.service();

        System.out.println();

        System.out.println(car.model + ":");
        car.showEngineType();
        car.showModel();
        car.makePumped();
        car.makeRepaired();
        car.service();

        System.out.println();

        System.out.println(truck.model + ":");
        truck.showEngineType();
        truck.showModel();
        truck.makePumped();
        truck.makeRepaired();
        truck.service();
    }
}