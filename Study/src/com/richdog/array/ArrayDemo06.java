package com.richdog.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 9090, 31232, 443, 80};

        Arrays.sort(a);
       System.out.println(Arrays.toString(a));
        printArray(a);

        Arrays.fill(a,2,4,0);
        System.out.println(Arrays.toString(a));

    }

    public static void printArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if(i==a.length-1){
                System.out.println(a[i]+"]");
            }else{
                System.out.print(a[i] + ", ");
            }


        }
    }
}


