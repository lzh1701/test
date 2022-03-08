package com.richdog.struct;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class IfDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩：" );

       double score = scanner.nextDouble();

        if(score==100){
            System.out.println("恭喜满分");
        } else if (score<100 && score>=90){
            System.out.println("A");
        } else if (score<100 && score>=80){
            System.out.println("B");
        } else if (score<100 && score>=70){
            System.out.println("C");
        } else if (score<100 && score>=60) {
            System.out.println("D");
        }else if (score<60 && score>=0){
            System.out.println("不及格");
        }else {
            System.out.println("成绩不合法");
        }

        scanner.close();
    }
}
