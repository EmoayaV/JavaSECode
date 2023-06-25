/**
 * ClassName: Student
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Emoaya
 * @Create 2023/4/16 13:10
 * @Version 1.0
 */

public class Student {
    private String name;
    private int age;

    // 无参构造
    public Student() {
//        this("",18);//调用本类有参构造器
    }

    // 有参构造
    public Student(String name) {
        this();//调用本类无参构造器
        this.name = name;
    }
//     有参构造
    public Student(String name,int age){
        this(name);//调用本类中有一个String参数的构造器
        this.age = age;
    }

//    public Student(String name,int age){
//        this("Tom");//调用本类中有一个String参数的构造器，并赋值
//                          //此时Student student = new Student("rose", 18);中，成员变量name仍然为"Tom"
//        this.age = age;
//    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo(){
        return "姓名：" + name +"，年龄：" + age;
    }
}