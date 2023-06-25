package exer3;

/**
 * ClassName: VehicleTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:21
 * @Version 1.0
 */
public class VehicleTest {
    public static void main(String[] args) {

        Developer developer = new Developer();

        //创建三个交通工具，保存在数组中
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("捷安特","骚红色");
        vehicles[1] = new ElectricVehicle("雅迪","天蓝色");
        vehicles[2] = new Car("奔驰","黑色","沪Au888");

        for (int i = 0;i < vehicles.length;i++){
            developer.takingVehicle(vehicles[i]);

            if(vehicles[i] instanceof IPower){  // 注释：接口的实现类算作是接口的一个实例，就是说只要类A是接口A的实现类，那么 类A instanceof 接口A == true
                                                // vehicles[0] instanceof IPower == false vehicles[0]不是IPower的实现类
                                                // vehicles[1] instanceof IPower == true vehicles[1]是IPower的实现类
                                                // vehicles[1] instanceof IPower == true vehicles[1]是IPower的实现类

                ((IPower) vehicles[i]).power(); // 原本是：
                                                // Vehicle vehicles[0] = new Bicycle("捷安特","骚红色");
                                                // Vehicle vehicles[1] = new ElectricVehicle("雅迪","天蓝色");
                                                // Vehicle vehicles[2] = new Car("奔驰","黑色","沪Au888");
                                                // 强转后变为：
                                                // IPower vehicles[0] = new Bicycle("捷安特","骚红色");
                                                // IPower vehicles[1] = new ElectricVehicle("雅迪","天蓝色");
                                                // IPower vehicles[2] = new Car("奔驰","黑色","沪Au888");
                                                // 接口的多态性，编译看左边，执行看右边，vehicles[1]只能调用在ElectricVehicle()类中，重写IPower抽象类的方法，是虚方法调用
                                                // (多态使用)在进行虚方法调用时，其实可以把IPower接口看作是ElectricVehicle类的“父类”()
                                                // 如果不强转，使用类的多态性，那么Vehicle类中没有.power()方法，那么即使子类vehicles[1]有.power方法也无法调用，
                                                // 相反如果使用接口的多态性，那么IPower接口中有.power()方法，那么其实现类vehicles[1]就可以调.power方法。
            }

        }






    }
}
