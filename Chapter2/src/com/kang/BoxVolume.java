package com.kang;

import java.util.Scanner;

public class BoxVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length: ");
        double length = input.nextDouble();
        System.out.println("Enter the width: ");
        double width = input.nextDouble();
        System.out.println("Enter the height: ");
        double height = input.nextDouble();

        double volume = length * width * height;
        System.out.println("The volume of the box: "+ volume);
    }
}
