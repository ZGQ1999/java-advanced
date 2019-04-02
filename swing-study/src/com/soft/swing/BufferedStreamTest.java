package com.soft.swing;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
    public static void main(String args[]) {
        // 定义字符串数组
        String content[] = { "莫听竹林打叶声", "何妨吟啸且徐行。", "竹杖芒鞋轻胜马，", "谁怕，一蓑烟雨任平生。" };
        // 创建文件对象
        File file = new File("D://word.txt");
        // 创建FileOutputStream对象
        FileOutputStream fos = null;
        // 创建BufferedOutputStream对象
        BufferedOutputStream bos = null;
        // 创建FileInputStream对象
        FileInputStream fis = null;
        // 创建BufferedInputStream对象
        BufferedInputStream bis = null;
        try {
            // 实例化FileOutputStream对象
            fos = new FileOutputStream(file);
            // 实例化BufferedOutputStream对象
            bos = new BufferedOutputStream(fos);
            // 创建可以容纳1024个字节数的缓冲区
            byte[] bContent = new byte[1024];
            // 循环遍历数组
            for (int k = 0; k < content.length; k++) {
                // 将遍历到的数组内容转换为字节数组
                bContent = content[k].getBytes();
                // 将字节数组内容写入文件
                bos.write(bContent);
            }
            System.out.println("写入成功！\n");
            // 处理异常
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 将BufferedOutputStream流关闭
                bos.close();
                // 将FileOutputStream流关闭
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            // 实例化FileInputStream对象
            fis = new FileInputStream(file);
            // 实例化BufferedInputStream对象
            bis = new BufferedInputStream(fis);
            // 创建byte数组，用来存储读取到的内容
            byte[] bContent = new byte[1024];
            // 从文件中读取信息，并存入字节数组中
            int len = bis.read(bContent);
            // 输出文件数据
            System.out.println("文件中的信息是：" + new String(bContent, 0, len));
        } catch (IOException e) { // 处理异常
            e.printStackTrace();
        } finally {
            try {
                // 将BufferedInputStream流关闭
                bis.close();
                // 将FileInputStream流关闭
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}