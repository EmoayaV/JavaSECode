package com.atguigu01.collection;

import org.junit.Test;

/**
 * ClassName: PersonTest
 * Package: com.atguigu01.collection
 * Description:
 *
 * @Author Emoaya
 * @Create 2023/5/17 20:25
 * @Version 1.0
 */
public class PersonTest {
    @Test
    public void test(){
        Person p1 = new Person("lll", 66);
        Person p2 = new Person("xxx", 77);
        Person p3 = new Person("yyy", 88);
//        Person[] arr =  new Person[]{p1, p2, p3};
        Person[] arr =  {p1, p2, p3};
        System.out.println(arr);
        System.out.println(arr[0]);
    }
}
