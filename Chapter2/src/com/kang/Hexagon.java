package com.kang;

import java.util.Scanner;

public class Hexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = input.nextInt();
        double hexagon = (3 * Math.sqrt(3) * (a^2))/2;

        System.out.println("Area of hexagon: " +hexagon);

    }
}
