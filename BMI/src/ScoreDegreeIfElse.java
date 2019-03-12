import java.util.Scanner;

public class ScoreDegreeIfElse {
    public static void main(String[] args) {
        int score;
        String degree;
        System.out.println("请输入你的成绩");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
        if (score>=0 && score<=100){
            if (score<60){
                degree = "不及格";
            }else  if (score>=60 && score<70){
                degree = "及格";
            }else  if (score>=70 && score<80){
                degree = "中等";
            }else  if (score>=80 && score<90){
                degree = "良好";
            }else  {
                degree = "优秀";
            }
            System.out.println("你的成绩等级为：" + degree);
        }else  {
            System.out.println("成绩范围不合法");
        }

    }
}
