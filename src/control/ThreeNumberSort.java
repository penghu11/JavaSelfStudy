package control;

import com.sun.codemodel.internal.util.UnicodeEscapeWriter;

import java.util.Scanner;

public class ThreeNumberSort {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("请输入第一个参数");
       int num1 = scan.nextInt();
       // Scanner sca = new Scanner(System.in);
       System.out.println("请输入第二个参数");
       int num2 = scan.nextInt();
       System.out.println("请输入第三个参数");
       int num3 = scan.nextInt();

       if(num1 >= num2){
           if(num3 >= num1){
               System.out.println(num2 + ">>" + num1 + ">>" + num3 +"");
           }else if(num3 >= num2) {
               System.out.println(num2 + ">>" + num3 + ">>" + num1 +"");
           }else{
               System.out.println(num3 + ">>" + num2 + ">>" + num1 +"");
           }
       }else {
           if(num3 >= num2){
               System.out.println(num1 + ">>" + num2 + ">>" + num3);
           }else if(num3 >= num1 ){
               System.out.println(num1 + ">>" + num3 + ">>" + num2);
           }else{
               System.out.println(num3 + ">>" + num1 + ">>" + num2);
           }
       }

       }
    }
