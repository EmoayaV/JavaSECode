/**
 * ClassName: BankTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Emoaya
 * @Create 2023/4/14 16:39
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args){
        Bank bank = new Bank();
        bank.addCustomer("l", "xy");
        bank.addCustomer("l", "xx");

//        int numOfCustomer = bank.getNumOfCustomer();
//        System.out.println(numOfCustomer);
        System.out.println(bank.getNumOfCustomer());

        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().withdraw(100);

//        double balance = bank.getCustomer(0).getAccount().getBalance();
//        System.out.println(balance);
        System.out.println(bank.getCustomer(0).getAccount().getBalance());

    }
}
