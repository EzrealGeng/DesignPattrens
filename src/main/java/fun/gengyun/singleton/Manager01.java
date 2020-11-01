package fun.gengyun.singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 */
public class Manager01 {

    private static final Manager01 INSTANCE = new Manager01();

    private Manager01() {};

    public static Manager01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Manager01 m1 = Manager01.getInstance();
        Manager01 m2 = Manager01.getInstance();

        // 比较m1和m2的引用地址是否相等
        System.out.println(m1 == m2);
    }
}
