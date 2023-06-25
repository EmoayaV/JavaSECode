package com.atguigu04._throw;

/**
 * ClassName: ThrowTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:27
 * @Version 1.0
 */
public class ThrowTest {
    public static void main(String[] args) {
        Student s1 = new Student();

////        s1.regist(10);
//        s1.regist(-10);
//        System.out.println(s1);

        try{
//            s1.regist(10);
            s1.regist(-10);
            System.out.println(s1);
        }catch(Exception e){
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }



    }
}

class Student {
    int id;

//    public void regist(int id){
//        if(id > 0){
//            this.id = id;
//        }else{
////            System.out.println("输入的id非法");
////            手动抛出异常类的对象
//            throw new RuntimeException("输入的id非法");//手动抛出运行时异常，不用去处理，即不用throws和trycatchfinally的操作
//
//        }
//    }

    public void regist(int id) throws Exception { //手动抛出的异常是Exception的子类，这里体现了多态
        if (id > 0) {
            this.id = id;
        } else {
//            System.out.println("输入的id非法");
            //手动抛出异常类的对象
//            throw new RuntimeException("输入的id非法");

//            throw new Exception("输入的id非法");

//            throw new String("输入的id非法"); //报错
            throw new BelowZeroException("输入的id非法");

//            System.out.println("有异常则以下代码不执行，包括本打印信息");//报错
        }
        System.out.println("有异常则以下代码不执行，包括本打印信息");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
