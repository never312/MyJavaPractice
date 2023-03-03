package GenericStack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<autoZavod> car = new Stack<>();
        car.push(new autoZavod("bentli"));
        car.push(new autoZavod("bmw"));
        car.push(new autoZavod("mercedes"));
        car.push(new autoZavod("bugati"));

        CarView zavod = new CarView();

        zavod.setCar(car);

        autoZavod car1 = zavod.delTopCar();
        autoZavod car2 = zavod.delTopCar();
        autoZavod car3 = zavod.delTopCar();
        autoZavod car4 = zavod.delTopCar();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

    }

}
