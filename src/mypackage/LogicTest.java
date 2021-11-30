package mypackage;

/*
       “&”和“&&”的区别：
           单&时，左边无论真假，右边都进行运算；
           双&时，如果左边为真，右边参与运算，如果左边为假，那么右边不参与运算。

       “|”和“||”的区别：
           ||表示：当左边为真，右边不参与运算。

       异或(^)与或( | )的区别：
           是：当左右都为true时，结果为false。理解：异或，追求的是“异”!
       */
public class LogicTest {
    public static void main (String [] args ){
        //区分& 与 &&
        //相同点1：& 与 && 的运算结果都相同
        //相同点2：当符号左边是true时，二者都会执行符号右边的运算
        //不同点：当符号左边是false时，&继续执行符号
        //开发中，推荐使用&&
        boolean b1 = false;
        int num1 = 10;
        if(b1 & (num1++ > 0)){
            System.out.println("我现在在南京");
        }else{
            System.out.println("我现在在北京");
        }
        System.out.println("num1 = " + num1); //11

        boolean b2 = false;
        int num2 = 10;
        if(b2 && (num2++ > 0)){
            System.out.println("我现在在南京");
        }else{
            System.out.println("我现在在北京");
        }
        System.out.println("num2 = " + num2); //10

//区分：| 与 ||
        //相同点1：| 与 || 的运算结果都相同
        //相同点2：当符号左边是false时，二者都会执行符号右边的运算
        //不同点3：当符号左边是true时，|继续执行符号右边的运算，而||不再执行符号右边的运算
        //开发中，推荐使用||
        boolean b3 = true;
        int num3 = 10;
        if(b3 | (num3++ > 0)){  // 不管左边是否为真，右边都要执行
            System.out.println("我现在在南京");
        }else{
            System.out.println("我现在在北京");
        }
        System.out.println("num3 = " + num3); // 11

        boolean b4 = true;
        int num4 = 10;
        if(b4 || (num4++ > 0)){  // 只要左边为真，就不执行右边
            System.out.println("我现在在南京");
        }else{
            System.out.println("我现在在北京");
        }
        System.out.println("num4 = " + num4); //10


        boolean x = true;
        boolean y = false;
        short z = 42;
        //if(y == true)
        if((z++==42)&&(y=true))z++;  // z = 44
        if((x=false)||(++z==45)) z++;
        System.out.println("z=" + z);	//46


    }
}
