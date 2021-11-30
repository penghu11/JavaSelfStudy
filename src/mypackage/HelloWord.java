package mypackage;

public class HelloWord {
    public static void main (String[] args){

        System.out.println("hello world");
        int a1 = 10;
        System.out.println("5+5=" +a1);  //5+5=10
        System.out.println(3+4 + "5+5="); //75+5=
        System.out.println(5%-2); // 1
        System.out.println(-5%2); // -1
        System.out.println(-5%-2); //-1

        //注意点：
        short s1 = 32763;
        //s1 = s1 + 1;	//编译失败
        // s1 = (short)(s1 + 1);	//正确的
        s1++;	//自增1不会改变本身变量的数据类型，如果超出类型表示的范围，则数据会出问题
        System.out.println(s1);
        // 如果超出类型表示的范围，则数据会出问题
        byte bb1 = 127;  //byte 表示范围：-128 ～ 127
        bb1++;
        System.out.println("bb1 = " + bb1); // -128

        short s2 = 10;
        //s1 = s1 + 2;	//编译失败
        s1 += 2;	//结论：不会改变变量本身的数据类型  虽然表示的含义是一样的，但是这个能编译通过
        System.out.println(s1);

        //练习2：
        int m = 2;
        int n1 = 3;
        n1 *= m++;
        System.out.println("m=" + m);	//3
        System.out.println("n1=" + n1);	//6

        //练习3：
        int n = 10;
        n += (n++) + (++n); //10 +10 + 12
        System.out.println(n);	//32

    }
}
