package com.soft1841.week3;

import java.util.Scanner;

public class PirmeNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数，判断其是否为素数");
        number = scanner.nextInt();
        int i;
        for (i = 2; i<number;i++){
            if (number % i ==0);
            break;
        }
        if (i< number){
            System.out.println("这个数是素数");
        }else {
            System.out.println("这个数不熟素数");
        }
        scanner.close();


            }
        }





