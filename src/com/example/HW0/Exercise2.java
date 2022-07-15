package com.example.HW0;

/**
 * @author Aspartame
 * @version 1.0
 * @date 2022/7/13 13:50
 * @e-mail 1135975764@qq.com
 */
public class Exercise2 {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int max=0;
        for (int i=1;i<m.length;i++){
            if(m[i]>m[i-1]){
                 max=m[i];//当当前值大于上一个值，重新为 max 赋值
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}