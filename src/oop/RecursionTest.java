package oop;

import org.junit.Test;

public class RecursionTest {

    @Test
    public void test() {

        // 例1:计算1-100之间所有自然数的和
        // 方法1:
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        // 方法2:
        RecursionTest test = new RecursionTest();
        int sum1 = test.getSum(100);
        System.out.println("sum1 = " + sum1);
    }

    // 例1:计算1-n之间所有自然数的和
    public int getSum(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }

    // 例2:计算1-n之间所有自然数的乘积
    //归求阶乘(n!)的算法
    public int getSum1(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * getSum1(n - 1);
        }
    }

}
