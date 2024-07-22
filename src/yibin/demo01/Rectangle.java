package yibin.demo01;

import java.util.Scanner;

/**
 * Created by 彬哥哥 on 2024/7/22.
 *
 * @author 王逸彬
 */


public class Rectangle {

    private static double width;
    private static double height;

    //    init 方法用于初始化 width 和 height 属性。
//    calculateArea 方法用于计算矩形的面积，并返回结果。
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public static double calculateArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入宽");
        double inputWidth = sc.nextDouble();
        System.out.println("请输入高");
        double inputHeight = sc.nextDouble();

        Rectangle rectangle = new Rectangle(inputWidth, inputHeight);
        System.out.println("面积为:" + rectangle.calculateArea());
    }
}
