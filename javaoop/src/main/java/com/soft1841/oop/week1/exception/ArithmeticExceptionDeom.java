package com.soft1841.oop.week1.exception;

public class ArithmeticExceptionDeom {
    public static void main(String[] args) {
        int n = 3;
        try {
            System.out.println(n/0);
        }catch (ArithmeticException e) {
            //处理异常
            System.err.println("除数不能为0！！");
        }

    }
}
