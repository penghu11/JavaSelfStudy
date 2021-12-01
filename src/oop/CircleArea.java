package oop;
/*
面向对象上：
      https://blog.csdn.net/PorkBird/article/details/113694493

*/

public class CircleArea {
    public static void main(String [] args){

        Circle c = new Circle();
        double area = c.findArea(5.5);
        System.out.println(area);
        Circle c1 = new Circle();
        double area1 = c1.findArea(3.4);
        System.out.println(area);

    }

}



class Circle{

    public double radius;

    public double findArea(double r){

        double area = Math.PI * r *r;
        return area;
    }

    public double findArea1(Double r) {
        double area = 3.14 * r * r;
        return area;
    }

    //返回圆的面积
    public double findArea(){
        return radius * radius * Math.PI;
    }
}
