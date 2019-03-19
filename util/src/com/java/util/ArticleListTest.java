package com.java.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * created by 国庆
 * 2019.03.18
 */

public class ArticleListTest {
    public static void main(String[] args) throws ParseException {
        java.util.Date date = new java.util.Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println("ID       标题                作者      时间");

        List<Article> artclelist = new ArrayList<>();
        artclelist.add(new Article(1,"听我说，朋友，希望是件危险的事","  肖申克",sdf.parse("2019-02-20 04:30:40")));
        artclelist.add(new Article(2,"一开始你恨他，然后你对他就习惯了","  海伍德",sdf.parse("2019-02-28 08:20:50 ")));
        artclelist.add(new Article(3,"就在那一刹那，鲨宝监狱的每一个人都感到了自由","  山姆",sdf.parse("  2019-03-18 21:50:50")));


        Iterator<Article> iterator = artclelist.iterator();
        while (iterator.hasNext()){
            Article article = iterator.next();
            String result;
            result = timeCal(sdf.format(article.getWriteTime()));
            System.out.println(article.getId()+"  "+article.getTitle().substring(0,10)+"....."+
                    article.getAuthor()+"  "+ result );
        }
    }
    private static String timeCal(String time) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date d1;
        long diff = 0;
        try {
            d1 = format.parse(time);
            java.util.Date now = new Date();
            diff = now.getTime() - d1.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long seconds = diff / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        if (seconds < 60) {
            return "刚刚";
        } else if (minutes < 60) {
            return minutes + "分钟前";
        } else if (hours < 24) {
            return hours + "小时前";
        } else {
            return days + "天前";
        }
    }
}
