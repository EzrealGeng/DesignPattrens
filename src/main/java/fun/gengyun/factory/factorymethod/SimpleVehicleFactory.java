package fun.gengyun.factory.factorymethod;

/**
 * 简单工厂
 * 可扩展性不好
 */
public class SimpleVehicleFactory {

    public Car createCar() {
        // 前置处理
        return new Car();
    };

    public Plane createPlane() {
        // 前置处理
        return new Plane();
    };

}
