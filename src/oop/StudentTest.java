package oop;
/*
* 对象数组题目：定义类student，包含三个属性：
 * 学号number(int)，年级state(int)，成绩score(int)。
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：  1) 生成随机数：math.random()，返回值类型double;
 * 		2) 四舍五入取整：math.round(double d)，返回值类型long。
   https://blog.csdn.net/porkbird/article/details/113694493
*
*
*
* */


public class StudentTest {
    public static void main (String[] args){
        Student []stu = new Student[20];

        //给20个学生初始化
        for(int i = 0;i < stu.length; i++){

            stu[i] = new Student(); // 注意要有这句赋值语句
            stu[i].number = i+1;
            //年级:[1,6]
            stu[i].state = (int) (Math.random() * (6 - 1 + 1)+1);
            //成绩:[0,100]
            stu[i].score = (int) (Math.random() * (100 -0 +1));
        }

        //问题一
        for(int i = 0; i < stu.length; i++){
            if(stu[i].state == 3){
                stu[i].info();
            }
        }

        for(int i = 0; i < stu.length; i++){
                stu[i].info();
        }

        //问题二 使用冒泡排序按学生成绩排序，
        for(int i = 0; i < stu.length -1; i++){
            for( int j = 0;j < stu.length -1 -i; j++){
                if(stu[j].score > stu[j+1].score) {
                    Student temp = stu[j];
                    stu[j] = stu[j + 1];
                    stu[j + 1] = temp;
                }
            }
        }

        //遍历学生数组
        for(int i = 0;i < stu.length;i++){
            System.out.println(stu[i].info());
        }
    }

}

class Student{

    int number = 0;
    public int state;
    int score;

    public String info(){

       return "学生号码：" + number + "是"  + state + "年纪学生," + "分数是" + score;

    }




}

