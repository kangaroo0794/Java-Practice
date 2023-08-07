package com.kang;

public class Rectangle {
    public static void main(String[] args) {
        int a= 2;
        int b= 5;
        /*Area*/
        int area= ((a)^2 * (b)^2);
        /*Perimeter*/
        int perimeter= 2*(a+b);
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
    }
}
