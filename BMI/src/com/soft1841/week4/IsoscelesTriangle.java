package com.soft1841.week4;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a number ");
        int line = scanner.nextInt();
        if (line <= 1 ){
            System.out.println("plesase input");
        }else {
            for (int i = 1 ; i <= line ; i++ ){
                for (int j =1 ; j <= line-i ;j++){
                    System.out.print(" ");
                }
                for (int j =1 ; j <= 2*i-1 ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
