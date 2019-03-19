package com.java.util;

import java.util.ArrayList;
import java.util.List;

public class NBATopFive {

    private String name;
    private  String sobriquet;
    private  double goal;
    private double backboard;
    private  double assist;

    public NBATopFive (String name, String smallname, double goal, double blankgoal, double biggoal) {
        this.name = name;
        this.sobriquet = smallname;
        this.goal = goal;
        this.backboard = blankgoal;
        this.assist = biggoal;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getSmallname () {
        return sobriquet;
    }

    public void setSmallname (String smallname) {
        this.sobriquet = smallname;
    }

    public double getGoal () {
        return goal;
    }

    public void setGoal (double goal) {
        this.goal = goal;
    }

    public double getBlankgoal () {
        return backboard;
    }

    public void setBlankgoal (double blankgoal) {
        this.backboard = blankgoal;
    }

    public double getBiggoal () {
        return assist;
    }

    public void setBiggoal (double biggoal) {
        this.assist = biggoal;
    }

    @Override
    public String toString () {
        return "NBATopTen{" +
                "name='" + name + '\'' +
                ", smallname='" + sobriquet + '\'' +
                ", goal=" + goal +
                ", blankgoal=" + backboard +
                ", biggoal=" + assist +
                '}';
    }

    public static void main (String[] args) {
        // 使用add方法向集合list中添加元素
        List<NBATopFive> sportlist=new ArrayList<>();
        sportlist.add(new NBATopFive("乔丹","飞人/神",30.1,6.2,5.3));
        sportlist.add(new NBATopFive("邓肯","石佛",15.1,11.2,5.3));
        sportlist.add(new NBATopFive("贾巴尔","天钩",20.7,22.6,5.3));
        sportlist.add(new NBATopFive("奥尼尔","大鲨鱼",32.8,6.3,5.3));
        System.out.println("--------------NBA四大人物----------------");
        System.out.println("绰号      球员      得分      篮板      助攻");
        for (int i=0,length=sportlist.size();i<length;i++){
            System.out.println(sportlist.get(i).getName()+"     "+sportlist.get(i).getSmallname()+"     "+sportlist.get(i).getGoal()+"   "+sportlist.get(i).getBlankgoal()+"   "+sportlist.get(i).getBiggoal());
        }

    }
}
