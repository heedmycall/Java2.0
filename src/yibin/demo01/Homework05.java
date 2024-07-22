package yibin.demo01;

/**
 * @author Wyb31
 */
public class Homework05 {
    //    编写一个方法abs( )，既可以对整数进行绝对值获取，又可以对小数进行绝对值的获取
    public static double abs(double a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        double a = -3.14253636;
        System.out.println("绝对值为：" + abs(a));
    }
}
