package com.soft1841.week3;

public class WaterFlowerNumber {
    public static void main(String[] args) {
        //三位数的水仙花数，从100-999
        int i = 100;
        while (i < 999) {
            i++;
            int hundred = i / 100;
            int ten = i / 10 - hundred * 10;
            int digit = i % 10;
            if (hundred * hundred * hundred + ten * ten * ten + digit * digit * digit == i) {
                System.out.println("水仙花数为：" + i);
            }
        }
    }
}



