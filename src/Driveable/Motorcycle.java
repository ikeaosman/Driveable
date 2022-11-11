package Driveable;


public class Motorcycle implements Driveable{ //Denne klasse implemter interface som hedder 'Driveable'
    @Override
    public void startEngine() {
    System.out.println("MOTORCYCLE engine is started");//Jeg skriver en sout for at se om den kalde på metoden
    }

    @Override
    public void drive(int distance) {
    System.out.println("MOTORCYCLE is driving " + distance + "Km");//Jeg skriver en sout for at se om den kalde på metoden
    }

    @Override
    public void stopEngine() {
    System.out.println("MOTORCYCLE engine is stopped");//Jeg skriver en sout for at se om den kalde på metoden
    }
}
