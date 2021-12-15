package oop;

public interface InterfaceTest {

    //全局变量
    public final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;//省略了 public static final

    //抽象方法
    public abstract void fly();
    void stop();//省略了 public abstract
    public abstract int  Flayable(); //省略了 public abstract

    // InterfaceTest intface = new InterfaceTest(); //不能实例化，若想实例化必须要重写接口中的方法

    InterfaceTest intface = new InterfaceTest(){
        @Override
        public void fly() {

        }

        @Override
        public void stop() {

        }

        @Override
        public int Flayable() {
            return 0;
        }
    };

    public static interface Woman {
        //System.out.println();
        void eat();
    }

    public static interface Man {
        void eat();

        //System.out.println();
        void work();
    }

    class worker implements Woman,Man{  //实现两个接口，如果worker类不是abstract的，就要把两个接口中的抽象方法全部实现。


        @Override
        public void eat() {

        }

        @Override
        public void work() {

        }
    }


    abstract class worker1 implements Woman, Man{ //实现两个接口，worker类是abstract的，不需要把两个接口中的抽象方法全部实现。

        @Override
        public void work() {

        }
    }


    interface AA{
        void method1();
    }

    interface BB{
        void method2();
    }

    interface CC extends AA,BB{

    }

    class Bullet extends Object implements Woman,CC {

        @Override
        public void eat() {

        }

        @Override
        public void method1() {

        }

        @Override
        public void method2() {

        }
    };

}
