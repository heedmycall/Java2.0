package yibin.demo01;

import java.util.Arrays;

/**
 * @author Wyb31
 */
public class Test {
//      //有参
//    public static double circle(double r) {
//        return Math.PI * r * 2;
//    }
//    public static void main(String[] args) {
//        System.out.println("圆的周长: " + circle(2));
//    }

//    //无参
//    public static double C(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入半径：");
//        double r = sc.nextDouble();
//        return Math.PI * r * 2;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("周长为:"+C());
//    }

//    public static void C(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入半径：");
//        double r = sc.nextDouble();
//    }

//=================================四级项目=============================================
//    编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5。
//    public static long A(int n){
//        if(n == 0){
//            return 1;
//        }else{
//            return n * A(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        int n = 4;
//        System.out.println(A(n));
//    }

//    编写一个方法，判断该年份是平年还是闰年。
//    public static String leapYear(int year) {
//        if(year % 4 ==0 && year % 100 != 0 || year % 400 == 0) {
//            return "是闰年";
//        }else {
//            return "不是闰年";
//        }
//    }
//
//    public static void main(String[] args) {
//        int year = 2024;
//        System.out.println(leapYear(year));
//    }

//    编写一个方法，输出大于200的最小的质数。
//    public static boolean isPrime(int n) {
//        if(n <= 1){
//            return false;
//        }
//        for(int i = 2; i <= Math.sqrt(n);i++){
//            if(n % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static int m(){
//        int n = 201;
//        while(!isPrime(n)){
//            n++;
//        }
//        return n;
//    }
//
//    public static void main(String[] args) {
//        int result = m();
//        System.out.println("大于200的最小的质数是："+result);
//    }


//    写一个方法，功能：定义一个一维的int 数组，长度任意,然后将它们按从小到大的顺序输出（使用冒泡排序）。
//    public static String sorting(int[] arr){
//        for(int i = 0; i < arr.length; i++){
//            for(int j=i+1; j <arr.length - 1; j++){
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        return Arrays.toString(arr);
//    }
//    public static void main(String[] args) {
//        int[] arr = {2,5,1,10,99};
//        System.out.println("顺序位："+sorting(arr));
//    }

//    编写一个方法abs( )，既可以对整数进行绝对值获取，又可以对小数进行绝对值的获取
//    public static double abs(double a){
//        if(a<0){
//            return -a;
//        }else {
//            return a;
//        }
//    }
//
//    public static void main(String[] args) {
//        double a = -3.14253636;
//        System.out.println("绝对值为："+abs(a));
//    }
//=================================四级项目=============================================
//冒泡排序
    public static void main(String[] args) {
        int[] arr = {8,6,9,12,5555,35,71,2};
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr.length - 1- i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
