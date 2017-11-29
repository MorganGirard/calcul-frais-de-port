package com.Boysband.Test;


import com.Boysband.Package;
import com.Boysband.ShippingCostsCalculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestPackage {

    @Parameters(name="{index}: testprix")
    public static Iterable<Object[]> data() {
        return Arrays.asList(testParameters);
    }

    private static final Object[][] testParameters = new Object[][]{
            { 191, 123, 18,  2.354d, ShippingCostsCalculator.Destination.France, 12.00 },

            { 253, 215, 164, 1.565d, ShippingCostsCalculator.Destination.France, 30.39 },

            { 653, 133, 271, 2.132d, ShippingCostsCalculator.Destination.France, 46.09 },

            { 653, 331, 271, 3.650d, ShippingCostsCalculator.Destination.France, 83.76 },

            { 191, 123, 18,  2.354d, ShippingCostsCalculator.Destination.Monaco, 13.04 },

            { 253, 215, 164, 1.565d, ShippingCostsCalculator.Destination.Monaco, 33.03 },

            { 653, 133, 271, 2.132d, ShippingCostsCalculator.Destination.Monaco, 50.10 },

            { 653, 331, 271, 3.650d, ShippingCostsCalculator.Destination.Monaco, 91.05 }
    };

    private int height;
    private int width;
    private int depth;
    private double weight;
    private ShippingCostsCalculator.Destination country;
    private Double expected;

    public TestPackage(int height, int width, int depth, double weight,ShippingCostsCalculator.Destination country, Double expected) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
        this.country = country;
        this.expected = expected;
    }

    @Test
    public void good_price_for_package () {
        Package pack = new Package(height,width,depth,weight);
        assertEquals(expected, ShippingCostsCalculator.calculateShippingCost(pack,country),0.005);
    }

}
