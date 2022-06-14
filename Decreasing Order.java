package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
            int n = sc.nextInt();
            DecreasingOrder(n);
            System.out.println();
    }
    public static void DecreasingOrder(int n){
        while(n>=0){
            System.out.println(n+ " ");
            n--;
        }
    }
}

