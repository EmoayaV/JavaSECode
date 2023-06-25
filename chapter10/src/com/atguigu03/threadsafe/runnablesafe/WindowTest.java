package com.atguigu03.threadsafe.runnablesafe;

/**
 * ClassName: WindowTest
 * Description:
 * 使用实现Runnable接口的方式，实现卖票。--->存在线程安全问题的。
 * 使用同步代码块解决上述卖票中的线程安全问题。
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:19
 * @Version 1.0
 */

class SaleTicket implements Runnable {
    int ticket = 1000;
    Object obj = new Object();
    Dog dog = new Dog();

    @Override
    public void run() {
//        synchronized (this) {//不符合实际，这样做就会让一个线程一直执行这个循环，直到程序结束
            while (true) {

//                try {
//                    Thread.sleep(5);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

//            synchronized (obj){ //obj:是唯一的？yes，同步监视器这里需要传入一个对象，这个对象必须是唯一的，就是说在整个线程操作的过程中，只能有一个obj对象
//            synchronized (dog){ //dog:是唯一的？yes
            synchronized (this){ //this:是唯一的？yes，就是题目中的s，

                if (ticket > 0) {

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;

                } else {
                    break;
                }
            }


        }

    }
}

public class WindowTest {
    public static void main(String[] args) {

        SaleTicket s = new SaleTicket();

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();


    }
}

class Dog {

}
