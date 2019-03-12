package com.soft1841.week3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //定义前两项并初始化
        int one = 0;
        int two =  1;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要求的斐波那系数列的项数：");
        n = scanner.nextInt();
        System.out.print("");
        //定义第三项变量，无需初始化
        int three;
        //定义一个for循环变量i
        int i;
        //写出for循环结构
        for (i = 2; i <= 10 ; i++){
            //计算出第三项
            three = one + two;
            System.out.print("  " + three);
            //挪动one和two
            one = two;
            two = three;
        }
    }
}
