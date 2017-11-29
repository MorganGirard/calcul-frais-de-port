package com.Boysband;

import static java.lang.Double.max;

public class BigPackage extends Package{
    private int height;
    private int width;
    private int depth;
    private double weight;

    public BigPackage(int height, int width, int depth, double weight) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
    }

    public double calculateLocalShippingCost(){
        return max(21.62*(weight), (1.43*height*width*depth)/1000000);
    }
}
