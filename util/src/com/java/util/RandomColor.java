package com.java.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

public class RandomColor {
    public static void main(String[] args)throws IOException {
        Random random = new Random();
        int redRandom = random.nextInt(256);
        int greenRandom = random.nextInt(256);
        int blueRandom = random.nextInt(256);
        //开始用随机数绘制图片
        //生成在图片缓冲区生成一个图片对象，指定图片大小和类型
        BufferedImage bufferedImage=new BufferedImage(120,40,BufferedImage.TYPE_INT_BGR);
        //获取画笔
        Graphics g=bufferedImage.getGraphics();
        //设置字体
        Font font=new Font("微软雅黑",Font.BOLD,16);
        g.setFont(font);
        //设置画笔颜色
        Color color=new Color(redRandom,greenRandom,blueRandom);
        g.setColor(color);
        //绘制,充满图片缓冲区
        g.fillRect(0,0,120,40);
        //绘制文字




        g.setColor(Color.black);
        g.drawString("验证码",40,15);
        //要输出图片
        //指定文件，获取输出流
        File file=new File("D:/code.jpg");
        //获取字节输出流
        OutputStream outputStream=new FileOutputStream(file);
        //将图片从缓冲区通过字节流写到文件
        ImageIO.write(bufferedImage,"jpg",outputStream);
        //及时关闭这个输出流
        outputStream.close();
    }
}
