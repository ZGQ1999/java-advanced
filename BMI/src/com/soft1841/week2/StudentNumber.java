package com.soft1841.week2;

public class StudentNumber {
    public static void main(String[] args) throws InterruptedException {
        int i = 01;
        while (i <= 40) {
            if (i < 10) {
                System.out.println("180234330" + i);
            }
            if (i >= 10) {
                System.out.println("18023433" + i);
            }
            Thread.sleep(1000);
            i++;

        }

        }

    }
