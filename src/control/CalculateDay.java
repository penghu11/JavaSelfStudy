package control;
/*
*编写程序：从键盘上输入2020年的“month”和“day”，
要求通过程序输出输入的日期为2019年的第几天。
*
* */


import java.util.Scanner;

public class CalculateDay {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scan.nextInt();
        System.out.println("请输入日期");
        int day = scan.nextInt();
        int sumDays = 0;
        switch(month){
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 29;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }
        System.out.println("2019年" + month +"月" + day +"号是当年的第" + sumDays +"天");
    }
}
