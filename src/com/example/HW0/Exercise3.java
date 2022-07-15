package com.example.HW0;

/**
 * @author Aspartame
 * @version 1.0
 * @date 2022/7/13 13:55
 * @e-mail 1135975764@qq.com
 */
public class Exercise3 {
    /** Returns the maximum value from m using a for loop. */
    public static int forMax(int[] m) {
        int max=0;
        for(int i=1;i<m.length;i++){
            while(m[i]>m[i-1]){
                max=m[i];
                break;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(forMax(numbers));
    }
}