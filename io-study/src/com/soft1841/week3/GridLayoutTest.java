package com.soft1841.week3;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import javax.swing.*;
import java.awt.*;

/**
 * 网格布局实例
 * created by 国庆
 * 2019.03.27
 */

public class GridLayoutTest extends JFrame {
    // 定义一个面板数组
    private JPanel[] panels;
    private GridLayoutTest(){
        init();
        setTitle("GridLayoutTest网格布局管理器");
        // 界面启最大化
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init() {
        // 设置容器背景颜色
        getContentPane().setBackground( new Color(255,255,255));
        // 定义三行三列九宫格。放置9个面板
        GridLayout gridLayout = new GridLayout(3,3,50,30);
        setLayout(gridLayout);
        // 创建面板数组
        panels = new JPanel[9];
        // 循环创建每个面板对象
        for (int i= 0; i < 9; i++){
            panels[i] = new JPanel();
            // 面板加上边框
            panels[i].setBorder(BorderFactory.createTitledBorder("面板" + (i + 1)));
            // 面板依次加入网格布局管理器，变成九宫格
            add(panels[i]);

        }
        // 设置第一个面板背景色，其布局方式为FlowLayout居中对齐
        panels[0].setBackground(new Color(255,240,245));
        // 在第一个面板内加入五个按钮
        for (int i = 0; i < 5; i++){
            panels[0].add(new JButton("yes"));
        }
        // 设置第二个面板为BorderLayout边界布局，设置背景色
        panels[1].setLayout(new BorderLayout(20,20));
        panels[1].setBackground(new Color(255,192,203));
         // 五个方向加入按钮
        panels[1].add(new JButton("金"),BorderLayout.NORTH);
        panels[1].add(new JButton("土"),BorderLayout.SOUTH);
        panels[1].add(new JButton("火"),BorderLayout.EAST);
        panels[1].add(new JButton("木"),BorderLayout.WEST);
        panels[1].add(new JButton("水"),BorderLayout.CENTER);
         // 设置第三个面板为GridLayout网格布局，设置背景色
        panels[2].setLayout(new GridLayout(3,3,10,10));
        panels[2].setBackground(new Color(238,130,238));
        // 依次添加九个按钮
        for (int i = 0 ; i < 6; i++){
            panels[2].add(new JButton(String.valueOf(i + 1)));
        }
        // 第四个面板
        panels[3].setBackground(new Color(123,145,227));
        for (int i = 0; i < 3; i++){
            panels[3].add(new JButton("java"));
        }
        //第五个面板
        panels[4].setLayout(new GridLayout(3,3,10,10));
        panels[4].setBackground(new Color(0,191,255));
        for (int i = 2; i<9; i++){
            panels[4].add(new JButton(String.valueOf(i + 2)));
        }
        //第六个面板
        panels[5].setLayout(new GridLayout(1,1,5,5));
        panels[5].setBackground(new Color(0,255,255));
        for (int i = 0; i<5; i++){
            panels[5].add(new JButton(String.valueOf(i + 1)));
        }

        //第七个面板
        panels[6].setLayout(new BorderLayout(10,5));
        panels[6].setBackground(new Color(240,230,170));
        // 五个方向加入按钮
        panels[6].add(new JButton("北"),BorderLayout.NORTH);
        panels[6].add(new JButton("南"),BorderLayout.SOUTH);
        panels[6].add(new JButton("东"),BorderLayout.EAST);
        panels[6].add(new JButton("西"),BorderLayout.WEST);
        panels[6].add(new JButton("中"),BorderLayout.CENTER);

        //第八个面板

        panels[7].setLayout(new GridLayout(3,5,0,10));
        panels[7].setBackground(new Color(214,18,49));




       //第九个面板
        panels[8].setBackground(new Color(41,204,175));

        for (int i = 0; i < 6; i++){
            panels[8].add(new JButton("no"));

        }


    }

    public static void main(String[] args) {
        // 用系统样式替代String默认样式
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception e){
            e.printStackTrace();
        }
        new GridLayoutTest();
    }
}
