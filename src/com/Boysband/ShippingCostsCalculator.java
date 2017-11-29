package com.Boysband;

public class ShippingCostsCalculator {
    public enum Destination {
        France,
        Monaco
    }
    public static double calculateShippingCost(Package pack, Destination destination){
        if(destination==Destination.France){
            return pack.calculateLocalShippingCost();
        } else if (destination==Destination.Monaco){
            return pack.calculateLocalShippingCost()*(1+(8.7/100));
        } else {
            return 0;
        }
    }
}
