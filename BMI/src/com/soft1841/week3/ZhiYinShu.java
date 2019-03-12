package com.soft1841.week3;

import java.util.Scanner;


public class ZhiYinShu {
    public static void main(String[] args) {
        System.out.println("请输入一个数字");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        //不换行输出数字
        System.out.print(i + "=");
        for (int j = 2; j <= i; j++) {
            //如果输入的数字被整除，证明这个过程结束
            while (i != j)
            {
                if (i % j == 0) {
                    System.out.print(j + "*");
                    i = i / j;
                } else
                    break;
                }
            }
            System.out.println(i);
        }
    }
