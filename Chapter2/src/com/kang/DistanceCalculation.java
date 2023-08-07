package com.kang;

import java.util.Scanner;

public class DistanceCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*x-values*/
        System.out.println("Enter x1 value: ");
        double a = input.nextInt();
        System.out.println("Enter x2 value: ");
        double b = input.nextInt();

        /*y-value*/
        System.out.println("Enter y1 value: ");
        double c = input.nextInt();
        System.out.println("Enter y2 value: ");
        double d = input.nextInt();

        double xDiff = (b-a)*(b-a);
        double yDiff = (d-c)*(d-c);


        double distance = Math.sqrt(xDiff+yDiff);
        System.out.println("The distance between the points= "+distance);

    }
}
