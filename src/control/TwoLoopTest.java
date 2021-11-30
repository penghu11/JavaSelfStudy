package control;

import java.util.Scanner;

public class TwoLoopTest {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入想打印的三角形的行数。。。");
        int row = scan.nextInt();
        System.out.println("请输入想打印的三角形的列数。。。");
        int col = scan.nextInt();
        

        for(int i = 0;i < row; i ++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
