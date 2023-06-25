/**
 * ClassName: Account
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Emoaya
 * @Create 2023/4/14 15:51
 * @Version 1.0
 */
public class Account {

    //声明属性
    private double balance;

    //声明构造器
    public Account(double balance){
        this.balance = balance;
    }

    //声明方法
    //得到存款
    public double getBalance(){
        return balance;
    }

    //存钱
    public void deposit(double amount){
        if(amount >= 0){
            balance += amount;
            System.out.println("成功存入" + amount);
        }else{
            System.out.println("输入有误，请重新输入！");
        }
    }

    //取钱
    public void withdraw(double amount){
        if(amount >= 0 && balance - amount >= 0){
            balance -= amount;
            System.out.println("成功取出" + amount);
        }else{
            System.out.println("输入有误，请重新输入！");
        }
    }

}
