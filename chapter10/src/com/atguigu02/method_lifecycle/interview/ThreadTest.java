package com.atguigu02.method_lifecycle.interview;

/*
关于Thread.sleep()方法的一个面试题：如下的代码中sleep()执行后，到底是哪个线程进入阻塞状态了呢？
 */
public class ThreadTest {
    public static void main(String[] args) {
        // 创建线程对象
        MyThread t = new MyThread();
        t.setName("线程1");
        t.start();

        // 调用sleep方法
        try {
            t.sleep(1000 * 5);//sleep(long millis):静态方法，调用时，可以使得当前线程睡眠指定的毫秒数，
                                    //首先这里使用MyThread继承Thread实现了线程，如果用MyThread的对象调用sleep方法，在子类没有重写sleep方法的情况下，
                                    //就会调用父类Thread中的sleep静态方法，所以说 t.sleep(5000)等价于Thread.sleep(5000)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 5秒之后这里才会执行。
        System.out.println("hello World!");
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
