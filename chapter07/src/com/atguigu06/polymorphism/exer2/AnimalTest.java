package com.atguigu06.polymorphism.exer2;

/**
 * ClassName: AnimalTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:39
 * @Version 1.0
 */
public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();

//        test.adopt(new Dog());
//        test.adopt(new Cat());
//        test.adopt(new Dogson());


        // |----> Animal
        //     |----> Dog
        //         |----> Dogson
        Animal animal = new Dogson();//多态
        Dog dog = (Dog) animal;//相当于Dog dog = new Dogson()，此时还是个多态，编译看左运行看右，虚方法调用的是Dogson类的方法
        Dogson dogson = (Dogson) dog;//相当于Dogson dogson = new Dogson()，此时没有多态
//        dog.watchDoor();
//        dogson.watchDoor();



    }

    public void adopt(Animal animal){ //Animal animal = new Dog()
        animal.eat();
        animal.jump();

        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchDoor();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }
        if(animal instanceof Dogson){
            Dog dog = (Dogson)animal;
            dog.watchDoor();
        }

    }

//    public void adopt(Dog dog){
//        dog.eat();
//        dog.jump();
//
//    }
//
//    public void adopt(Cat cat){
//        cat.eat();
//        cat.jump();
//
//    }

    //。。。。

}

class Animal{

//    public void watchDoor(){
//        System.out.println("xxx能看家");
//    }
    public void eat(){
        System.out.println("动物进食");
    }

    public void jump(){
        System.out.println("动物跳");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void jump(){
        System.out.println("狗急跳墙");
    }

    public void watchDoor(){
        System.out.println("狗能看家");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void jump(){
        System.out.println("猫跳~~");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Dogson extends Dog {
    public void eat() {
        System.out.println("狗儿子吃骨头");
    }

    public void jump() {
        System.out.println("狗儿子急跳墙");
    }

    public void watchDoor() {
        System.out.println("狗儿子能看家");
    }

}

