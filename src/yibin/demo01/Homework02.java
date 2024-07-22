package yibin.demo01;

/**
 * @author Wyb31
 */
public class Homework02 {
    //    编写一个方法，判断该年份是平年还是闰年。
    public static String leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return "是闰年";
        } else {
            return "不是闰年";
        }
    }

    public static void main(String[] args) {
        int year = 2024;
        System.out.println(leapYear(year));
    }
}
