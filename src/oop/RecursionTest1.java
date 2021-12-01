package oop;

import org.junit.Test;


public class RecursionTest1 {

    @Test
    public void sum(){
        RecursionTest1 test = new RecursionTest1();
        //return test.f(10);
        System.out.println(test.f(10));
        System.out.println("兔子数列10个月的值是" + test.f2(10));

    }

    // 已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),

    public int f (int num){
        if(num == 0){
            return 1;
        } else if( num == 1)
            return 4;
        else
            return 2 * f(num -1) + f(num -2);
    }

    /* 输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
     * 1  1  2  3  5  8  13  21  34  55
     * 规律：一个数等于前两个数之和
     * 要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来
     */

      public int f2(int num){
          if(num == 1 || num == 2){
              return 1;
          }else{
              return f2(num -1) + f2(num -2);
          }
      }



}
