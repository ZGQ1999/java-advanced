import java.util.Scanner;

public class Granary {
    public static void main(String[] args) {
        double hight = 3;
        double radius = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入高度");
        hight=scanner.nextDouble();
        System.out.println("请输入半径");
        radius=scanner.nextDouble();
        final double PI = 3.1415926;
        double volume = PI*radius*radius*hight;
        System.out.println(volume);

    }
}
