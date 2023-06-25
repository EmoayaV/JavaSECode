/**
 * ClassName: LeafTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Emoaya
 * @Create 2023/4/22 14:19
 * @Version 1.0
 */
class Root{
    static{
        System.out.println("Root的静态初始化块");
    }
    {
        System.out.println("Root的普通初始化块");
    }
    public Root(){
        super();
        System.out.println("Root的无参数的构造器");
    }
}
class Mid extends Root{
    static{
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化块");
    }
    public Mid(){
        super();
        System.out.println("Mid的无参数的构造器");
    }
    public Mid(String msg){
        //通过this调用同一类中重载的构造器
        this();
        System.out.println("Mid的带参数构造器，其参数值："
                + msg);
    }
}
class Leaf extends Mid{
    static{
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }
    public Leaf(){
        //通过super调用父类中有一个字符串参数的构造器
        super("尚硅谷");
        System.out.println("Leaf的构造器");
    }
}
public class LeafTest{
    public static void main(String[] args){
        new Leaf();
//		System.out.println();
//		new Leaf();
    }
}

//实例化对象时，加载的顺序：由父及子，静态先行
//- 先把类放在方法区，进行类的加载，一定先加载父类Object，再加载子类
//  - 加载类的时候执行(静态属性放在堆空间中的静态域) ①静态属性的默认初始化 ②静态属性显式初始化 或 静态代码块中初始化(主要看哪个写在前面) ③静态方法的加载
//- 把类加载完，再进行类的实例化
//  - 类的实例化时执行 ①实例变量默认初始化 ②实例变量显式初始化 或 非静态代码块中初始化(主要看哪个写在前面) ③构造器中初始化 ④有了对象以后，通过"对象.属性"或"对象.方法"的方法进行赋值

