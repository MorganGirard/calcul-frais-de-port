package com.Boysband;

public class ShippingCostsCalculator {
    public enum Destination {
        France(0.0, 0.0),
        Monaco(8.7, 0.0),
        DOMTOM(5.4, 1.26);

        private double multiplyBy;
        private double add;

        Destination(double multiplyBy, double add) {
            this.multiplyBy = multiplyBy;
            this.add = add;
        }

        public double getMultiplyBy() {
            return multiplyBy;
        }

        public double getAdd() {
            return add;
        }
    }
    public static double calculateShippingCost(Package pack, Destination destination){
        double baseValue = pack.calculateLocalShippingCost();
        return baseValue*(1+destination.getMultiplyBy()/100)+destination.getAdd();
    }
}
