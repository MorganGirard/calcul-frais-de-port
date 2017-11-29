package com.Boysband;

public class PackageFactory {
    public static Package createPackage(int height, int width, int depth, double weight){
        if (height<229 && width<162 && depth<25) {
            return new SmallPackage();
        } else if (weight<1.8) {
            return new MediumPackage(weight);
        } else {
            return new BigPackage(height,width,depth,weight);
        }
    }
}
