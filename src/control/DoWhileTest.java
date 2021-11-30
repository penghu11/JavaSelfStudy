package control;

import org.junit.Test;

public class DoWhileTest {

    @Test
    public void dowhile(){
        int m = 10;

        while(m > 10){
            System.out.println("我是while的执行！");
            m--;
        }

        do {
            System.out.println("我是do-while的执行！");
            m--;
        }while(m > 10);
    }


}
