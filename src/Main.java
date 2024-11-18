import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** This is a program that outputs repairing vehicles to the console
 *  This is a first version of this. It's not an app or a web service.
 */


public class Main {
    public static void main(String[] args) {
        Bicycle bycicle1 = new Bicycle("BMX", (byte) 2, "Gray");
        Car car1 = new Car("Three-Cylindrate Oiled", "BMW I8", "White");
        Truck truck = new Truck("Diesel", "Ford F-Max", "Blue");
        Bicycle bycicle2 = new Bicycle("Peugeot", (byte) 2, "White");
        Car car2 = new Car("RX-7", "Mazda RX-7", "Red");
        Car car3 = new Car("RX-7", "Mazda RX-7", "Black");

        List<String> motorlessTransport = new ArrayList<>();
        motorlessTransport.add("BMX, 2 wheels, Gray");
        motorlessTransport.add("\nPeugeot, 2 wheels, White");

        List<String> cars = new ArrayList<>();
        cars.add("BMW I8, Three-Cylindrate Oiled, White");
        cars.add("\nMazda RX-7, RX-7, Red");
        cars.add("\nMazda RX-7, RX-7, Black");

        List<String> heavyTransport = new ArrayList<>();
        heavyTransport.add("Ford F-Max, Diesel, Blue");

        System.out.println(motorlessTransport);
        System.out.println(cars);
        System.out.println(heavyTransport);

        System.out.println(bycicle1.type + ":");
        bycicle1.makePumped();
        bycicle1.makeRepaired();
        bycicle1.makeColored();
        bycicle1.service();

        System.out.println();

        System.out.println(bycicle2.type + ":");
        bycicle2.makePumped();
        bycicle2.makeRepaired();
        bycicle2.makeColored();
        bycicle2.service();

        System.out.println();

        System.out.println(car1.model + ":");
        car1.showEngineType();
        car1.showModel();
        car1.makeColored();
        car1.makePumped();
        car1.makeRepaired();
        car1.service();

        System.out.println();

        System.out.println(car2.model + ":");
        car2.showEngineType();
        car2.showModel();
        car2.makeColored();
        car2.makePumped();
        car2.makeRepaired();
        car2.service();

        System.out.println();

        System.out.println(car3.model + ":");
        car3.showEngineType();
        car3.showModel();
        car3.makeColored();
        car3.makePumped();
        car3.makeRepaired();
        car3.service();

        System.out.println();

        System.out.println(truck.model + ":");
        truck.showEngineType();
        truck.showModel();
        truck.makeColored();
        truck.makePumped();
        truck.makeRepaired();
        truck.service();
    }
}