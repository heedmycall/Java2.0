package yibin.demo01;

/**
 * @author Wyb31
 */
public class Homework01 {
    //    编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5。
    public static long a(int n){
        if(n == 0){
            return 1;
        }else{
            return n * a(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(a(n));
    }
}
