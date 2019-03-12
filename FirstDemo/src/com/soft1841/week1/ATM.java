package com.soft1841.week1;

public class ATM {
    public static void main(String[] args)throws Exception {
        System.out.println("欢迎光临南京银行ATM机");
        System.out.println("请插入你的银行卡");
        //休眠3秒
        Thread.sleep(3000);
        //初始化总金额
        int totol=1000
        System.out.println("取款界面");
        Scanner scanner=new Scanner(System.in);
        //输入了用户的取款数
        int input;
        System.out.println("请输入你要取的金额");
        input=scanner.nextInt();
        //处理数据，可以考虑余额不足的情况
        total=total-input;
        //输出结果
        System.out.println("你取了+input+"元“");
        System.out.println("当前余额为"+ total);

    }
}
