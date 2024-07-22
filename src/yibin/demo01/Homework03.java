package yibin.demo01;

/**
 * @author Wyb31
 */
public class Homework03 {
    //    编写一个方法，输出大于200的最小的质数。
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int m() {
        int n = 201;
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }

    public static void main(String[] args) {
        int result = m();
        System.out.println("大于200的最小的质数是：" + result);
    }

}
