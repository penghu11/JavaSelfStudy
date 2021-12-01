package oop;

import org.junit.Test;

public class EncapsulationTest {

    @Test
    public void Legs(){
        Encapsulation en = new Encapsulation();
        en.Legs(2);
        en.age = 1;
        // en.legs = 6; 如果legs声明为private 则用这种方法不能设置值，为了解决这个问题，类中提供公共的set/get 方法。
        en.setName("小小");
        System.out.println(en.getName());
    }


}


class  Encapsulation {
    String name;
    public  int age = 0 ;
    private  int legs;
    private String color ;
     @Test
     public void Legs(int leg){
        if(leg == 1 || leg % 2 != 0){
            legs = 1;
        } else {
            legs =0;
        }
        System.out.println(legs);
    }

    public void setName(String nam){
         // this.name = name;
         name = nam;

    }

    public String getName(){
         return name;
    }


}