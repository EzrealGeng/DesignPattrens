package fun.gengyun.singleton;

/**
 * 跟01一个意思
 */
public class Manager02 {

    private static final Manager02 INSTANCE;

    static {
        INSTANCE = new Manager02();
    }

    private Manager02() {};

    public static Manager02 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Manager02 m1 = Manager02.getInstance();
        Manager02 m2 = Manager02.getInstance();

        // 比较m1和m2的引用地址是否相等
        System.out.println(m1 == m2);
    }
}
