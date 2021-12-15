package oop;

public class PersonTest {



}



class Person {
    protected String name;
    protected int age;
    private int age1;
    protected String sex;

    //Person(String name){
    //    System.out.println("Person Constrctor-----" + name);
    //}
    Person(){
        System.out.println("Person Constrctor-----");
    }
    // System.out.println(age);

    public void display(){
        System.out.println("Play Person...");
    }

    static void display(Person person){
        person.display();
    }
}

class Husband extends Person{

    Husband(){
        // super();
        // super("chenssy");
        System.out.println("Husband Constructor...");
    }

    public static void main(String[] args) {
        Husband husband  = new Husband();
        Person person = new Husband();
        Person.display(husband); //类直接调用静态方法，是因为静态方法随着类的加载而加载
        person.display(husband); //对象调用静态方法
    }
}
