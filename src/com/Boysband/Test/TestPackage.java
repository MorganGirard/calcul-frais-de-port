package com.Boysband.Test;


import com.Boysband.Package;
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
            { 191, 123, 18,  2.354d, "FR", "12.00" },

            { 253, 215, 164, 1.565d, "FR", "30.39" },

            { 653, 133, 271, 2.132d, "FR", "46.09" },

            { 653, 331, 271, 3.650d, "FR", "83.76" },

            { 123, 191, 18,  2.354d, "MC", "13.04" },

            { 253, 215, 164, 1.565d, "MC", "33.03" },

            { 653, 133, 271, 2.132d, "MC", "50.10" },

            { 653, 331, 271, 3.650d, "MC", "91.05" }
    };

    private int height;
    private int width;
    private int depth;
    private double weight;
    private String country;
    private String expected;

    public TestPackage(int height, int width, int depth, double weight,String country, String expected) {
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
        assertEquals(Double.parseDouble(expected), pack.calculateLocalShippingCost(),0.005);
    }

}
