package com.company;

public class Boat extends Vehicle{
    public Boat(String eingabeBrand, int eingabeKilometers){
        super(eingabeBrand, eingabeKilometers);

    }
    @Override
    public String doStuff(){
        return "I am " + this.getBrand() + " and I go glug glug!" ;

    }
}
