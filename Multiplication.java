package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
            int n = sc.nextInt();
            Multiply(n);
            System.out.println();
    }
    public static void Multiply(int n){
        for (int i = 1; i <11; i++) {
            System.out.println(n*i);
        }
    }
}

//Using For Loop
