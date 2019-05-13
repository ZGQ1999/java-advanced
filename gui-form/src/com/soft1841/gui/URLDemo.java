package com.soft1841.gui;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/search?q=%E8%93%9D%E5%A2%A8%E4%BA%91&oq=%E8%93%9D%E5%A2%A8%E4%BA%91+&aqs=chrome..69i57j69i61l3j0l2.20705j0j1&sourceid=chrome&ie=UTF-8");
            System.out.println("URL 为："+ url.toString());
            System.out.println("协议为：" +url.getProtocol());
            System.out.println("验证信息为："+ url.getAuthority());
            System.out.println("文件名及请求参数为：" + url.getFile());
            System.out.println("主机名：" + url.getHost());
            System.out.println("路径：" +url.getPath());
            System.out.println("端口为：" +url.getPort());
            System.out.println("默认端口为：" +url.getDefaultPort());
            System.out.println("请求参数为：" + url.getQuery());
            System.out.println("定位位置为：" + url.getRef());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
