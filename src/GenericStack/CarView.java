package GenericStack;

import java.util.Stack;

public class CarView {

    private Stack<autoZavod> car;

    public autoZavod delTopCar(){
        return car.pop();
    }

    public  autoZavod getNewCar(autoZavod autozavod){
        return car.push(autozavod);
    }

    public autoZavod lookTopCar(){
        return car.peek();
    }

    public Stack<autoZavod> getCar() {
        return car;
    }

    public void setCar(Stack<autoZavod> car) {
        this.car = car;
    }
}
