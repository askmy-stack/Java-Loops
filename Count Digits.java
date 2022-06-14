package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
            int n = sc.nextInt();
            countDigits(n);
            System.out.println();
    }
    public static void countDigits(int n){
        int a = 0;
        while(n>0){
            n=n/10;
            a=a+1;
        }
        System.out.println("Total Number of Digits are:"+a);
    }
}

