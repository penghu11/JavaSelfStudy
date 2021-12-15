package oop;

import org.junit.Test;

import java.util.Calendar;

/* https://blog.csdn.net/PorkBird/article/details/113694837
 * 写一个名为Account的类模拟账户。该类的属性和方法如下图所示。
 * 该类包括的属性：账号id，余额balance，年利率annualInterestRate；
 * 包含的方法：访问器方法（getter和setter方法），
 * 返回月利率的方法 getMonthlyInterest()，
 * 取款方法 withdraw()，存款方法 deposit()。
 *
 *
 /*
 * 创建Account类的一个子类CheckAccount代表可透支的账户，该账户中定义一个属性overdraft代表可透支限额。
 * 在CheckAccount类中重写withdraw方法，其算法如下：
 * 如果（取款金额<账户余额），
 * 可直接取款
 * 如果（取款金额>账户余额），
 * 计算需要透支的额度
 * 判断可透支额overdraft是否足够支付本次透支需要，如果可以
 * 		将账户余额修改为0，冲减可透支金额
 * 如果不可以
 * 		提示用户超过可透支额的限额

 * 写一个用户程序测试CheckAccount类。在用户程序中，
 * 创建一个账号为1122、余额为20000、年利率4.5%，
 * 可透支限额为5000元的CheckAccount对象。
 * 使用withdraw方法提款5000元，并打印账户余额和可透支额。
 * 再使用withdraw方法提款18000元，并打印账户余额和可透支额。
 * 再使用withdraw方法提款3000元，并打印账户余额和可透支额。
 *
 *
 */

class CheckAccountTest{
    public static  void main(String args[]){

        Account account = new Account(1122,20000,0.045);
        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);
        checkAccount.withdraw(20000);
        checkAccount.withdraw(18000);
        checkAccount.withdraw(3000);
    }


}




class Account {
    @Test
    public void test() {
        Calendar calendar = Calendar.getInstance();
        int month = (int) (calendar.get(Calendar.MONTH) + 1.0);//获取当前的月份
        System.out.println(month);
    }
    private  double id; //账号ID
    private  double balance; //余额
    private double annualInterestRate; //年利率

    public Account(){ //提供空参构造起

    }

    public Account(double id, double balance, double annualInterestRate){ //提供空参构造起
            this.id = id;
            this.balance= balance;
            this.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setannualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public double getannualInterestRate(){
        return annualInterestRate;
    }

    public double getMonthlyInterest(){

        return annualInterestRate/12;
    }

    public void  withdraw( double withdrawMoney){ //取款方法

        balance = balance - withdrawMoney;
        System.out.println("取钱是：" + withdrawMoney +"目前账户余额是" + balance);
    }

    public void deposit(double depositMoney){ //存钱方法

        balance = balance + depositMoney;
        System.out.println("存钱是：" + depositMoney +"目前账户余额是" + balance);
    }

}


class CheckAccount extends Account{
    double overdraft; //可透支限额

    public CheckAccount(double id, double balance, double annualInterestRate,double overdraft){
        super(id,balance,annualInterestRate);
        this.overdraft = overdraft;
    }

    public void setOverdraft(double overdraft){
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    @Override
    public void  withdraw( double withdrawMoney){
        if(withdrawMoney < getBalance()){
            System.out.println("可以取款" + withdrawMoney);
            //方式1
            // setBalance(getBalance() - withdrawMoney );
            //方式二
            super.withdraw(withdrawMoney);
        }else if (withdrawMoney <= this.overdraft + getBalance() ){ //透支取钱

            overdraft = overdraft-withdrawMoney + getBalance();
            System.out.println("本次取钱是:" + withdrawMoney + "目前账户余额是：" + getBalance()+"本次透支是："+ (withdrawMoney - getBalance()) );
            System.out.println("剩余可透支金额是：" + overdraft);
            super.setBalance(0);
            setOverdraft(overdraft);
        } else{
            System.out.println("本次取钱："+ withdrawMoney +"; 超过剩余可透支金额："+getOverdraft() +" 本次无法取钱！");
        }

    }

}
