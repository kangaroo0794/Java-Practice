package com.kang;


import java.util.Scanner;

public class RadianConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radian: ");
        double radian = input.nextDouble();

        double degree = radian * (180/3.142);
        System.out.println("The radian converted to degree: " + degree);

    }
}
