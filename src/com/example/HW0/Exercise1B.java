package com.example.HW0;

/**
 * @author Aspartame
 * @version 1.0
 * @date 2022/7/13 13:48
 * @e-mail 1135975764@qq.com
 * Creative Exercise 1b: DrawTriangle
 */
public class Exercise1B {
    public static void drawTriangle(int N){
        for(int i=0;i<N+1;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        drawTriangle(10);
    }

}
