package com.Boysband;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height, width, depth;
        double weight;
        String destString;
        ShippingCostsCalculator.Destination dest = ShippingCostsCalculator.Destination.France;

        System.out.println("=== Calcul de coût d'envoi de colis ===");
        System.out.println("Entrer hauteur:");
        height = Integer.parseInt(sc.next());
        System.out.println("Entrer largeur:");
        width = Integer.parseInt(sc.next());
        System.out.println("Entrer longueur:");
        depth = Integer.parseInt(sc.next());
        System.out.println("Entrer poids:");
        weight = Double.parseDouble(sc.next());
        System.out.println("Entrer destination: (France, Monaco, DOMTOM)");
        destString = sc.next();

        if(destString.equals("France"))
            dest = ShippingCostsCalculator.Destination.France;
        else if(destString.equals("Monaco"))
            dest = ShippingCostsCalculator.Destination.Monaco;
        else if(destString.equals("DOMTOM"))
            dest = ShippingCostsCalculator.Destination.DOMTOM;
        else {
            System.out.println("Erreur, rentrer un nom de destination possible");
            System.exit(1);
        }

        System.out.println("=== Coût de votre colis ===");
        System.out.println(ShippingCostsCalculator.calculateShippingCost(PackageFactory.createPackage(height, width, depth, weight), dest));
    }
}
