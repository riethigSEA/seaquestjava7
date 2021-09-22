package com.company;

public abstract class Vehicle {
    private String brand;
    private int kilometers;
    public Vehicle(String eingabeBrand, int eingabeKilometers){
        this.brand = eingabeBrand;
        this.kilometers = eingabeKilometers;

    }
    public String getBrand(){
        return this.brand;

    }
    public int getKilometers(){
        return this.kilometers;

    }
    public void setBrand(String eingabeBrand){
        this.brand = eingabeBrand;
    }
    public void setKilometers(int eingabeKilometers){
        this.kilometers = eingabeKilometers;

    }
    public abstract String doStuff();


}
