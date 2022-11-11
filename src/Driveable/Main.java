package Driveable;

public class Main {

    public void run() {
        System.out.println("I dette program øver jeg interface og implements funktionen");

        //Opretter en ny instance af klassen car og for at kalde en metode fra den klasse
        Car c = new Car();

        c.startEngine();
        c.drive(10000);
        c.stopEngine();

        System.out.println();// Bare for at lave mellemrum og gøre det lidt pænere
        //Opretter en ny instance af klassen Motorcycle og for at kalde en metode fra den klasse
        Motorcycle m = new Motorcycle();

        m.startEngine();
        m.drive(500);
        m.stopEngine();


    }


        public static void main (String[]args){
            new Main().run();
        }
    }
