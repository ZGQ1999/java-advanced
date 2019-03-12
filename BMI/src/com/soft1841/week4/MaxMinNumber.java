package com.soft1841.week4;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        final  int COUNT = 5;
        int n ;
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 27;
        for (int i = 1; i <=COUNT; i ++){
            System.out.println("please input a number :");
            n = scanner.nextInt();
            if (n > max){
                max = n;
            }
            if (n < min){
                min = n;
            }
        }
        System.out.println("max =" + max + "    ,min = " + min);
    }
}
