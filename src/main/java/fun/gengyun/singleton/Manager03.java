package fun.gengyun.singleton;

/**
 * 懒汉式 lazy loading
 * 虽然达到了按需初始化的目的，但带来了线程不安全的问题
 */
public class Manager03 {

    private static Manager03 INSTANCE;

    private Manager03() {};

    public static Manager03 getInstance() {
        if(INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Manager03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Manager03.getInstance().hashCode());
            }).start();
        }
    }
}
