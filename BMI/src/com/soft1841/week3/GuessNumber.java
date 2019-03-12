package com.soft1841.week3;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
       int answer = 68;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的猜测：");
        int guess;
        guess = scanner.nextInt();
        if (guess == answer){
            System.out.println("你猜对了");
        }
        while (guess != answer){
            if (guess < answer){
                System.out.println("你猜小了！请重新输入");
                guess = scanner.nextInt();
            }else {
                System.out.println("你猜大了！请重新输入");
                guess = scanner.nextInt();
            }
            if (guess == answer){
                System.out.println("caiduil");
            }
        }

    }
}
