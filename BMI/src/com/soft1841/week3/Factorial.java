package com.soft1841.week3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number;
        //定义初始值
        int i =1;
        number = scanner.nextInt();
        //设置循环条件，输入的数字大于0
        while (number>0){
            i =i*number;
            number--;
        }
        System.out.println("阶乘为：" +i);
    }
}



