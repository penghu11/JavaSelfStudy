package oop;

import org.junit.Test;

public class PassObject {
    @Test
    public void test () {
        PassObject test = new PassObject();

        Circle c = new Circle();

        test.printAreas(c, 5);

        System.out.println("now radius is:" + c.radius);
    }


    public void printAreas(Circle c,int time){

        System.out.println("Radius\t\tAreas");  // \t 是制表符

        //设置圆的半径
        for(int i = 1;i <= time ;i++){
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }

        //重新赋值
        c.radius = time + 1;
    }
}
