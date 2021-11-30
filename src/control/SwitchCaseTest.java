package control;

import java.util.Scanner;

/*
分支结构之二：switch-case

1.格式
    switch(表达式){
    case 常量1:
    	执行语句1;
    	//break;
    case 常量2:
    	执行语句2;
    	//break;

    ...

    default:
    	执行语句n:
    	//break;
    }

2.说明:
    ① 根据switch表达式中的值，依次匹配各个case中的常量。一旦匹配成功，进入相应case结构中，执行相关语句。
      当调用完执行语句后，则仍然继续向下执行其他case语句，直到遇到break关键字或末尾结束为止。
    ② break, 可以使用switch-case结构中，表示一旦执行到此关键字，就跳出switch-case结构。
    ③ switch结构中的表达式，只能是如下的六种数据类型之一：byte、short、char、int、枚举类型(JDK5.0)、String类型(JDK7.0)
    ④ case 之后之能声明常量。不能声明范围。
    ⑤ break关键字是可选的。
    ⑥ default：相当于if-else结构中的else。
			default 结构是可选的，而且位置是灵活的。

switch-case : 一旦匹配一个成功，就会一直往下执行(没有break的情况)
*
*
使用switch 把小写类型的char型转为大写。只转换a, b, c, d, e. 其它的输出“other”。
提示：String word = scan.next();  char c = word.charAt(0); switch(c){}
* */
public class SwitchCaseTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String cha = scan.next();
        String b = "wordfs";
        System.out.println(b.charAt(0)); //取字符串的第一个字符
        char c = cha.charAt(0);
        switch (c){
            case 'a':
               System.out.println("A");
               break;
            case 'b':
                System.out.println("B");
                break;
            case ('c') :
                System.out.println("C");
                break;
            default:
                System.out.println("请");
        }
    }
}
