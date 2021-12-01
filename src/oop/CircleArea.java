package oop;

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

    public double findArea(double r){

        double area = Math.PI * r *r;
        return area;
    }

    public double findArea1(Double r) {
        double area = 3.14 * r * r;
        return area;
    }
}
