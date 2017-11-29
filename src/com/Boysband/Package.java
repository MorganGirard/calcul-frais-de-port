package com.Boysband;


import static java.lang.Double.max;

public class Package {

    private int height;
    private int width;
    private int depth;
    private double weight;

    public Package(int height, int width, int depth, double weight) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
    }

    public double calculateLocalShippingCost(){
        if (height<229 && width<162 && depth<25) {
            return 12;
        } else if (weight<1.8) {
            return ((17.59*(weight))+2.86);
        } else {
            return max(21.62*(weight), (1.43*height*width*depth)/1000000);
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public double getWeight() {
        return weight;
    }
}
