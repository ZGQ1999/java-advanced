package com.soft.swing;

import sun.java2d.opengl.WGLGraphicsConfig;

/**
 *created by 国庆
 * 2019.04.08
 */
public class RunnableTest extends Object implements Runnable {
    private int count = 10;
    @Override
    public void run() {
       while ((true)){
           //打印count变量
           System.out.print(count+" ");
           //使count变量自减，减为0时，终止循环
           if (--count==0){
               break;
           }
       }
    }
    public static void main(String[] args) {
      RunnableTest test = new RunnableTest();
      test.run();

    }
}
