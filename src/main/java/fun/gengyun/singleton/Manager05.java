package fun.gengyun.singleton;

/**
 * 懒汉式 lazy loading
 * 虽然达到了按需初始化的目的，但带来了线程不安全的问题
 * 通过synchronized来解决 但却会降低效率
 */
public class Manager05 {
    private static Manager05 INSTANCE;

    private Manager05() {};

    public static Manager05 getInstance() {
        if(INSTANCE == null) {
            // 试图通过减小同步代码块的方式提交效率，然后不可行
            synchronized(Manager05.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Manager05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Manager05.getInstance().hashCode());
            }).start();
        }
    }
}
