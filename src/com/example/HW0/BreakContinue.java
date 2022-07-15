package com.example.HW0;

/**
 * @author Aspartame
 * @version 1.0
 * @date 2022/7/13 14:00
 * @e-mail 1135975764@qq.com
 */
public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
        for (int i=0;i<a.length;i++){
                    for(int j=1;j<n+1;j++){
                        if ((i+j)>a.length-1){
                            continue;
                        }else {
                            a[i]=a[i]+a[i+j];
                        }
                    }


        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}