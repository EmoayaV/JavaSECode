package com.atguigu01.collection;

import java.util.Objects;

/**
 * ClassName: Person
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:30
 * @Version 1.0
 */
public class Person {
    String name;
    int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Person equals()...");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }


    public static void main(String[] args){
        Person p1 = new Person("lll", 66);
        Person p2 = new Person("xxx", 77);
        Person p3 = new Person("yyy", 88);
//        Person[] arr =  new Person[]{p1, p2, p3};
        Person[] arr =  {p1, p2, p3};
        System.out.println(arr);
        System.out.println(arr[0]);
    }


}



