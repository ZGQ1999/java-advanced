package com.soft1841.oop.week1.exception;

public class BoundsException {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try {
            for (int i = 0;i <arr.length; i++);
            System.out.print(arr[]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("下标越界了！！");
        }

    }
}
