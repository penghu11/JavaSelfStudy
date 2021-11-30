package control;
/*
*编写程序从1循环到150，并在每行打印一个值，
另外在每个3的倍数行上打印出“foo”,
在每个5的倍数行上打印“biz”,
在每个7的倍数行上打印输出“baz”。
*
*
* while 循环：
* ①初始化部分
while(②循环条件部分)｛
    ③循环体部分;
    ④迭代部分;
}
*
*
* do-while循环结构的使用
一、循环结构的四个要素
① 初始化条件
② 循环条件 --->是boolean类型
③ 循环体
④ 迭代条件

二、do-while循环的结构
①
do{
	③;
	④;
}while(②);
*
* */
public class ForTest {
    public static void main(String[] a){
        int i ;
        int sum = 0;
        for (i = 0;i < 20;i++){
            sum += i;
            System.out.println(i);
            if(i % 3 == 0){
                System.out.println("foo");
            }
            if(i % 5 == 0){
                System.out.println("biz");
            }
            if(i % 7 == 0){
                System.out.println("baz");
            }

            System.out.println(" ");
        }
        System.out.println("总和是：" + sum);

        // int d = maxyuenumber(6,3);
        maxyuenumber(6,3); //调用最大公约数方法
        mingongbeinumber(3,5);

    }

    //求最大公约数
    //public static int maxyuenumber(int m, int n) {

    public static void maxyuenumber(int m, int n) {
        int max = m > n ? m :n;
        int min = m > n ? n:m;
        int i;
        for(i = min;i>1;i--){
            if(max % i == 0 && min % i == 0){
                System.out.println(max +"和"+ min +"的最大公约数是" + i);
                break;
            }
        }
        //return i;
    }

    public static void mingongbeinumber(int m,int n){
        int max = m > n ? m : n;
        int min = m > n ? n : m;
        int i;
        for(i =max;i <=max *min; i++){
            if(i % max ==0 && i % min == 0){
                System.out.println(max +"和"+ min +"的最小公倍数是" + i);
                break;
            }
        }

    }

}
