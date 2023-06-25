/**
 * ClassName: Customer
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Emoaya
 * @Create 2023/4/14 16:04
 * @Version 1.0
 */
public class Customer {
    //声明属性
    private String firstName;
    private String lastName;
    private Account account;

    //声明构造器
    public Customer(){


    }
    public Customer(String f, String l){
        firstName = f;
        lastName = l;
    }

    //声明方法
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Account getAccount(){
        return account;
    }
    public void setAccount(Account acct){
        account = acct;
    }

}
