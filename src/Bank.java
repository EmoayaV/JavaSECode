/**
 * ClassName: Bank
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Emoaya
 * @Create 2023/4/14 15:55
 * @Version 1.0
 */
public class Bank {

    //声明属性
    private Customer[] customers;
    private int numberOfCustomer = 0;

    //声明构造器
    public Bank(){
        customers = new Customer[10]; //初始化对象数组
    }

    //声明方法
    /**
     * addCustomer 方法必须依照参数（姓，名）构造一个新的 Customer对象，然后把它放到 customer 数组中。
     * 还必须把 numberOfCustomer 属性的值加 1。
     * @param f 姓
     * @param l 名
     */
    public void addCustomer(String f, String l){

        Customer customersObject = new Customer(f, l);
//        customers[numberOfCustomer] = customersObject;
//        numberOfCustomer++;
//        等价于
        customers[numberOfCustomer++] = customersObject;
    }

    /**
     * 方法返回 numberofCustomers属性值
     * @return
     */
    public int getNumOfCustomer(){
        return numberOfCustomer;
    }

    /**
     * 方法返回与给出的index参数相关的客户
     * @param index
     * @return
     */
    public Customer getCustomer (int index){
        if(index < 0 || index >= numberOfCustomer){
            return null;
        }

        return customers[index];

    }

}
