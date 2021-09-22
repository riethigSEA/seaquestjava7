package com.company;

public class Hangar {

    public static void main(String[] args) {
	// write your code here
        Boat boat1 = new Boat("Bootsfirma1", 3000);
        Car car1 = new Car("Audi", 50000);

        System.out.println(boat1.doStuff());
        System.out.println(car1.doStuff());
    }
}
