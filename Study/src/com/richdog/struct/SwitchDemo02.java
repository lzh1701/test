package com.richdog.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
         String name = "richdog";

         switch (name){
             case "lzh":
                 System.out.println("lzh");
                 break;
             case "richdog":
                 System.out.println("richdog");
                 break;
             default:
                 System.out.println("404 not found");


         }
    }
}
