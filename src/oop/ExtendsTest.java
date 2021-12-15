package oop;

/*
父类有的，子类可以直接拿过来用
子类可以重写父类的方法
调用父类的属性和方法用 super
*
*
*
*
* */

// import com.sun.deploy.util.ArrayUtil;

import sun.security.util.ArrayUtil;

//继承的测试 + 方法的重写练习
public class ExtendsTest {

public static void main(String args[]){

    // SuperPerson superMan = new SuperPerson(); //可以调用父类的空参构造器
    SuperPerson superMan1 = new SuperPerson("tom", 18, "China");
    SuperMan superMan2 = new SuperMan(); //会调用父类的空参构造器
    SuperMan superMan = new SuperMan("tom","CHN",17,"high");
    superMan.setAge(14); //子类对象直接调用父类的方法
    superMan.equals(superMan);
    System.out.println(superMan.equals(superMan));//true
    System.out.println(superMan.getAge());
    System.out.println(SuperMan.score); //子类直接调用父类的静态属性

}




}

class SuperPerson{

    private String name; //名字
    private int age; //年龄
    private String nation; //国家
    protected static int score = 90; //静态的属性是类所有的，所有的该类对象共享这一个值

   public SuperPerson(){
       System.out.println("父类的空参构造器");
   }

   public SuperPerson(String name, int age, String nation){
       // this(); //调用空参构造器
       this.age = age;
       this.name = name;
       this.nation = nation;
       this.getClass();
       System.out.println(this.getClass());
   }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNation() {
        return nation;
    }

    public void eat(){
       System.out.println("调用父类吃方法");
    }

    public void sleep(){
       System.out.println("父类不睡觉");
    }
}

class SuperMan extends SuperPerson{

    String major;

     public SuperMan (){
        // super(); //调用父类的空参构造器
    }

    public SuperMan(String name,String nation,int age,String m){

         // super(name,nation,age); //会报错
        super(name,age,nation);
        this.major = m;
    }

    @Override
    public void eat(){ //重写父类的eat方法
         System.out.println("子类要吃饭");
         sleep(); //调用父类的方法
         setAge(30); //一个类中方法可以互相调用
         super.getAge();
        System.out.println(getAge());
    }

}
