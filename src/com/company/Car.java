package com.company;

public class Car extends Vehicle {
    public Car(String eingabeBrand, int eingabeKilometers){
        super(eingabeBrand, eingabeKilometers);
    }

    @Override
    public String doStuff() {
        return " I am " + this.getBrand() + " and I go zoom zoom zoom!";
    }
}
