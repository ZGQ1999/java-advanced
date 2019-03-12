package com.soft1841.oop.week1.exam;

import java.util.Scanner;

public class NumberSplit {
    public static void main(String[] args) {
        System.out.print("请输入一串数字：");
        Scanner scanner =  new  Scanner(System.in);
        String nums = scanner.nextLine();
        StringBuffer str = new StringBuffer(nums);
        System.out.println("处理前的字符串：");
        System.out.print(str);

        for (int i = nums.length(); i>0; i = i-3) {
            if (i >3) {
                str.insert(i-3,"，");
            }
            System.out.println(str);

        }
    }
}
