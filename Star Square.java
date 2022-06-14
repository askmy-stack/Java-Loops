package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
            int s = sc.nextInt();
            SquareStar(s);
    }
    public static void SquareStar(int s){
        for(int i=1;i<=s*s;i++){
            if(i>=1 && i<=s){
                System.out.print("*"+" ");
                if(i==s)
                    System.out.print("\n");
            }
            else if(i<=(s*s-s)){
                if(i%s==0)
                    System.out.print("*" + "\n");
                else if(i%s==1)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }
            else{
                System.out.print("*" + " ");
                if(i==s*s)
                    System.out.print("\n");
            }
        }
    }
}


