package com.kang;

import java.util.Scanner;

public class GameScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter wins: ");
        int wins = input.nextInt();
        System.out.println("Enter draws: ");
        int draws = input.nextInt();
        System.out.println("Enter losses: ");
        int losses = input.nextInt();

        int totalscore= (wins*3)+(draws*1)+(losses*0);

        System.out.println("Total points= " + totalscore);
    }
}
