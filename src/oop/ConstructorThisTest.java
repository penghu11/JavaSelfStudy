package oop;

import mypackage.Person;
import org.junit.Test;

// JAVA this关键字的使用

public class ConstructorThisTest {
  @Test
    public void Constructor_this_test(){
      ConstructorThis con = new ConstructorThis();  //会打印 人吃饭/ 学习/ Person 初始化时，需要考虑如下的 1,2,3,4...(共 40 行代码)
      String s = con.toString();
      System.out.println(s); //打印con的地址
      con.eat();
      con.setAge(7);
      System.out.println(con.getAge());
      con.getName();
      con.setName("tom");
      System.out.println(con.getName());

  }

}


class ConstructorThis{

    private String name;
    private int age;

    public ConstructorThis(){
        this.eat();
        String info = "Person 初始化时，需要考虑如下的 1,2,3,4...(共 40 行代码)";
        System.out.println(info);
    }

    public ConstructorThis(String name){
        this();
        this.name = name;
    }

    public ConstructorThis(int age){
        this();
        this.age = age;
    }

    public ConstructorThis(String name,int age){
        this(age);	//调用构造器的一种方式
        this.name = name;
//		this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void eat(){
        System.out.println("人吃饭");
        this.study();
    }

    public void study(){
        System.out.println("学习");
    }

}