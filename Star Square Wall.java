package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
            int s = sc.nextInt();
            SquareStarWall(s);
    }
    public static void SquareStarWall(int s){
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


