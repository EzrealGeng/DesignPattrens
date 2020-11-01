package fun.gengyun.factory.abstractfactory;
/**
 * 抽象工厂 --- 具体工厂
 * 抽象产品 --- 具体产品
 */
public class Main {

    public static void main(String[] args) {
        // 产品族 如果需要魔法世界的产品 AbstractFactory factory = new MagicFactory();
        AbstractFactory factory = new ModernFactory();

        Food food = factory.createFood();
        Vehicle vehicle = factory.createVehicle();
        Weapon weapon = factory.createWeapon();

    }
}
