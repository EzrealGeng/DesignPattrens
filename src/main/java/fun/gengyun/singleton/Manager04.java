package fun.gengyun.singleton;

/**
 * 懒汉式 lazy loading
 * 虽然达到了按需初始化的目的，但带来了线程不安全的问题
 * 通过synchronized来解决 但却会降低效率
 */
public class Manager04 {

    private static Manager04 INSTANCE;

    private Manager04() {};

    public static synchronized Manager04 getInstance() {
        if(INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Manager04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Manager04.getInstance().hashCode());
            }).start();
        }
    }
}
