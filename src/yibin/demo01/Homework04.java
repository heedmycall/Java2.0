package yibin.demo01;

import java.util.Arrays;

/**
 * @author Wyb31
 */
public class Homework04 {
    //    写一个方法，功能：定义一个一维的int 数组，长度任意,然后将它们按从小到大的顺序输出（使用冒泡排序）。
    public static String sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 10, 99};
        System.out.println("顺序位：" + sorting(arr));
    }
}
