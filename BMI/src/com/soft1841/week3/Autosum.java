package com.soft1841.week3;

import java.util.Scanner;

public class Autosum {
    public static void main(String[] args) {
        int a;
        System.out.println("请输入一个数字");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        int sum;
        int b;
        int i;
        b =a;
        sum = a;
        for (i = 1; i<a; i++){
            b = b*10 + a;
            sum = sum +b;
        }
        System.out.println("结果是：" + sum);
    }
}
