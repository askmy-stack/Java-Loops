package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
            String n = sc.nextLine();
            EvenCharacters(n);
            System.out.println();
    }
    public static void EvenCharacters(String n){
        for (int i = 0; i <n.length(); i++) {
            if(i%2==0){
                System.out.println(n.charAt(i));
            }
        }
    }
}

