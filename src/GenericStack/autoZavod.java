package GenericStack;

public class autoZavod {

    private String nameOfCar;

    public autoZavod(String nameOfCar){
        this.nameOfCar = nameOfCar;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }

    public String toString(){
        return "Car " + "model " + nameOfCar;
    }
}
