package com.atguigu01.string.exer1;

import org.junit.Test;

//考查：方法参数的值传递机制、String的不可变性
public class StringTest {

	String str = "good";
	char[] ch = { 't', 'e', 's', 't' };

	public void change(String str, char[] ch) { //两个都是引用数据类型奥
		str = "test ok";
		System.out.println(str);
		System.out.println(str == this.str);
		ch[0] = 'b';
	}

	public static void main(String[] args) {
		StringTest ex = new StringTest();
		ex.change(ex.str, ex.ch);
		System.out.println(ex.str); //good
		System.out.println(ex.ch); //best
	}

	@Test
	public void test1(){
		String str1 = "okko";
		str1 = "kkoo";
		System.out.println(str1);

	}


}


