package Sort;

public class Car {
    private int topSpeed;

    Car(int topSpeed){
        this.topSpeed = topSpeed;
    }
    public int getTopSpeed(){
        return  topSpeed;
    }

    @Override
    public String toString() {
        return "Car" + "topSpeed = " + topSpeed;
    }

}
