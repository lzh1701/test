package com.richdog.array;

import java.util.Arrays;

public class ArrayDemo07 {
    public static void main(String[] args) {

        //冒泡排序
        //比较数组中，两个相邻元素，第一个大于第二个，交换位置
        //每一次比较都会产生出一个最大或最小的数字
        //下一轮循环少一次排序
        //依次循环，直到结束
        int[] a ={1,2,4,16,12,17777,1552,12652626,162,10,1,};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
    }
        public static int[] sort(int[] array){

        int temp = 0;
            for (int i = 0; i < array.length; i++) {

                boolean flag = false;
                //内层循环，比较判断两个数，如果第一个数，比第二个大，则交换位置
                for (int j = 0; j < array.length-1-i; j++) {
                    if(array[j+1]<array[j]){
                        temp = array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                        flag = true;
                    }
                }
                if(flag==false){
                    break;
                }
            }

            return array;
        }
    }
