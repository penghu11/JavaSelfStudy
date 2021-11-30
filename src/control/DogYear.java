package control;

import java.util.Scanner;

/*
* 我家的狗5岁了，5岁的狗相当于人类多大呢？
其实，狗的前两年每一年相当于人类的10.5岁，之后每增加一年就增加四岁。
那么5岁的狗相当于人类多少年龄呢？应该是：10.5 + 10.5 + 4 + 4 + 4 = 33岁。
如果用户输入负数，请显示一个提示信息。
*
* */
public class DogYear {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     System.out.println("请输入狗年龄...");
     int year = scan.nextInt();
     double age = 0;
     if(year < 0){
         System.out.println("请输入狗年龄大于0");
     }else if(year < 2 ){
         age = 10.5 * year;
        }else{
         age = 10.5*2 + (year -2) * 4;
     }
        System.out.println(year + "岁狗相当于人类的年龄是"+ age);
    }
}
