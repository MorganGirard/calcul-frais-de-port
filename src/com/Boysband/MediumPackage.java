package com.Boysband;

public class MediumPackage extends Package {

    private double weight;

    public MediumPackage(double weight) {
        this.weight = weight;
    }

    public double calculateLocalShippingCost(){
        return ((17.59*(weight))+2.86);
    }
}
