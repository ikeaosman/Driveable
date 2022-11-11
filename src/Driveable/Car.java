package Driveable;

public class Car implements Driveable{ //Denne klasse implemter interface som hedder 'Driveable'
    @Override
    public void startEngine() {
        System.out.println("CAR engine is started");//Jeg skriver en sout for at se om den kalde på metoden

    }

    @Override
    public void drive(int distance) {
        System.out.println("CAR is driving " + distance + "Km"); //Jeg skriver en sout for at se om den kalde på metoden
    }

    @Override
    public void stopEngine() {
        System.out.println("CAR engine is stopped");//Jeg skriver en sout for at se om den kalde på metoden

    }
}
