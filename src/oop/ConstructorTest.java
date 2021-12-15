package oop;

import org.junit.Test;

//构造器知识学习
public class ConstructorTest {
    @Test
    public void con (){
        Constructor constructor = new Constructor(); //这个会调用空参构造器
        Constructor constructor1 = new Constructor(5); //调用一个参数的构造器，初始化年龄为 5
        System.out.println(constructor1.age); //5

        Constructor constructor2 = new Constructor("tom",5,4.5); //调用构造器对对象进行初始化
        System.out.println(constructor2); //打印的地址
    }
}


class Constructor{

    private  String name;
    public int age;

    private int num;

    //空参构造器
     Constructor (){
        System.out.println("这是一个空参构造器");
    }

    public Constructor (int age){
           this.age =age;
           System.out.println("这是一个参数的构造器，用来初始化年龄");

    }

    public Constructor (int age,String name){
        this.age =age;
        this.name = name;
        System.out.println("这是两个参数的构造器，用来初始化年龄和名字");
    }

    public Constructor (String n,int a, double b){
         name = n;
         age = a;
         num = (int) b;
    }

}
