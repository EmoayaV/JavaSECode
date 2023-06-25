package com.atguigu02.trycatchfinally.interview;

/**
 * @author shkstart
 * @create 21:38
 */
public class FinallyTest1 {
    public static void main(String[] args) {
        int result = test("abc");
        System.out.println(result);
    }

    public static int test(String str){
        try{
            Integer.parseInt(str);
            System.out.println("有异常则以下代码不执行(在try内)，包括本打印信息");
            return 1;//有异常不执行
        }catch(NumberFormatException e){
            e.printStackTrace();
            System.out.println("catch语句结束");
            return -1;
        }finally{
            System.out.println("finally语句结束");
        }
    }
}
