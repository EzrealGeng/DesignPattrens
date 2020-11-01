package fun.gengyun.factory.factorymethod;

/**
 * 任何可以产生对象的方法或者类 都可以称之为工厂
 * 单例模式也是一种工厂
 * 为什么有了new之后 还要工厂？？
 *   1- 灵活控制生产过程
 *   2- 权限 、修饰 、 日志
 *
 *   工厂方法优点：产品的扩展比较方便
 *   抽象工厂的优点：产品族扩展比较方便，但是产品不好扩展
 */
public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.go();

        Plane plane = new Plane();
        plane.go();

        Moveable moveable = new Car();
        moveable.go();
    }
}
