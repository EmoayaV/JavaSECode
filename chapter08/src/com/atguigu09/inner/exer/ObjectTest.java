package com.atguigu09.inner.exer;

/**
 * ClassName: ObjectTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:23
 * @Version 1.0
 */
public class ObjectTest {
    public static void main(String[] args) {
//        SubObject sub1 = new SubObject();
//        sub1.test();

        //编写一个匿名内部类，它继承Object，并在匿名内部类中，声明一个方法public void test()打印尚硅谷。
        //方式1
        new Object(){
            public void test(){
                System.out.println("尚硅谷");
            }
        }.test();


    }
}

//class SubObject extends Object{
//    public void test(){
//        System.out.println("尚硅谷");
//    }
//}
