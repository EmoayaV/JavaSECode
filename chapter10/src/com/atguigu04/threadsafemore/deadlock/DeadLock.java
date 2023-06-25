package com.atguigu04.threadsafemore.deadlock;

class A {
	public synchronized void foo(B b) {//this = A的对象a，锁是a
		System.out.println("当前线程名: " + Thread.currentThread().getName()
				+ " 进入了A实例的foo方法"); // ①
		try {
			Thread.sleep(200);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("当前线程名: " + Thread.currentThread().getName()
				+ " 企图调用B实例的last方法"); // ③
		b.last();
	}
	public synchronized void last() {//this = A的对象a，锁是a
		System.out.println("进入了A类的last方法内部");
	}
}
class B {
	public synchronized void bar(A a) {//this = B的对象b，锁是b
		System.out.println("当前线程名: " + Thread.currentThread().getName()
				+ " 进入了B实例的bar方法"); // ②
		try {
			Thread.sleep(200);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("当前线程名: " + Thread.currentThread().getName()
				+ " 企图调用A实例的last方法"); // ④
		a.last();
	}
	public synchronized void last() {//this = B的对象b，锁是b
		System.out.println("进入了B类的last方法内部");
	}
}

public class DeadLock implements Runnable {
	A a = new A();
	B b = new B();
	public void init() {
		Thread.currentThread().setName("主线程");
		// 调用a对象的foo方法
		a.foo(b);//调用foo方法握着a的锁，同时foo方法里面有调用了a.last方法，这个方法用了synchronized修饰，要握着b的锁。
		System.out.println("进入了主线程之后");
	}
	public void run() {
		Thread.currentThread().setName("副线程");
		// 调用b对象的bar方法
		b.bar(a);//调用bar方法握着b的锁，同时bar方法里面有调用了b.last方法，这个方法用了synchronized修饰，要握着a的锁。
		System.out.println("进入了副线程之后");
	}
	public static void main(String[] args) {
		DeadLock dl = new DeadLock();
		new Thread(dl).start();
		dl.init();
	}
}
