package fun.gengyun.singleton;


/**
 * 懒汉式 lazy loading
 * 虽然达到了按需初始化的目的，但带来了线程不安全的问题
 * 通过synchronized来解决 但却会降低效率
 */
public class Manager06 {

    // volatile不加 指令重排  会有问题
    private static volatile Manager06 INSTANCE;

    private Manager06() {};

    public static Manager06 getInstance() {
        if(INSTANCE == null) {
            // 双重检查
            synchronized(Manager06.class) {
                if(INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Manager06();
                }

            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Manager06.getInstance().hashCode());
            }).start();
        }
    }
}
