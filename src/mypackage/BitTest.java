package mypackage;
/*
* 位运算练习
*
*
运算符之六：三元运算符
1.结构：(条件表达式)？表达式1 : 表达式2
2. 说明
    ① 条件表达式的结果为boolean类型
    ② 根据条件表达式真或假，决定执行表达式1，还是表达式2.
      如果表达式为true,则执行表达式1
      如果表达式为false,则执行表达式2
    ③ 表达式1 和表达式2要求是一致的。
    ④ 三元运算符是可以嵌套的
3. 凡是可以使用三元运算的地方，都是可以改写if-else。
   反之，则不一定成立！！！

    if-else使用说明：

    条件表达式必须是布尔表达式（关系表达式或逻辑表达式）、布尔变量；
    语句块只有一条执行语句时，一对{}可以省略，但建议保留；
    if-else语句结构，根据需要可以嵌套使用；
    当if-else结构是“多选一”时，最后的else是可选的，根据需要可以省略；
    当多个条件是“互斥”关系时，条件判断语句及执行语句间顺序无所谓当多个条件是“包含”关系时，“小上大下/ 子上父下”。
说明：
1.else结构是可选的。
2.针对于条件表达式：
	① 如果多个条件表达式之间的关系是“互斥”关系(或没有交集的关系),哪个判断和执行语句声明在上面还是下面，无所谓；
	② 如果多个条件表达式之间是有交集的关系，需要根据实际情况，需要考虑实际情况，考虑清楚应该将哪个结构声明在上面。
	③ 如果多个条件表达式之间有包含的关系，通常情况下，需要将范围小的声明在范围大的上面。否则，范围小的就没机会运行。
* */
public class BitTest {
    public  static void main (String[] args){
        int i = 21;
//		i = -21;
        System.out.println("i << 2 :" + (i << 2));
        System.out.println("i << 3 :" + (i << 3));
        System.out.println("i << 20 :" + (i << 20));
        System.out.println("i << 27 :" + (i << 27));
        int m = 12;
        int n = 5;
        System.out.println("m & n :" + (m & n));
        System.out.println("m | n :" + (m | n));
        System.out.println("m ^ n :" + (m ^ n));
        //练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;

        //方式一：
        //	int tent = num1;
        //	num1 = num2;
        //	num2 = tent;

        //方式二：
        //好处：不用定义临时变量
        //弊端：①相加可能超出存储范围 ② 有局限性：只适用于数值类型
//		num1 = num1 + num2;
//		num2 = num1 - num2;
//		num1 = num1 - num2;

        //方式三：使用位运算  注意思想！！！
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("num1 = " + num1 + ",num2 = " + num2);
    }
}



