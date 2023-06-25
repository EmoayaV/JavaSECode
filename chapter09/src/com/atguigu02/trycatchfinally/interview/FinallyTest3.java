package com.atguigu02.trycatchfinally.interview;

/**
 * @author shkstart
 * @create 21:43
 */
public class FinallyTest3 {
    public static void main(String[] args) {
        int result = test("a");
        System.out.println(result);
        //结果：> test结束
        //     > 0
    }

    public static int test(String str) {
        try {
            Integer.parseInt(str);
            return 1;
        } catch (NumberFormatException e) {
            return -1;
        } finally {
            System.out.println("test结束");
            return 0;
        }
    }
}
