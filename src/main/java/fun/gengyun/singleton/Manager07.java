package fun.gengyun.singleton;

/**
 * 静态内部类的方式
 * JVM保证线程安全
 * 加载外部类时 不会加载内部类 这样可以实现懒加载
 */
public class Manager07 {
    private Manager07() {};

    public static class Manager07Holder {
        private static final Manager07 INSTANCE = new Manager07();
    }

    public static Manager07 getInstance(){
        return Manager07Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Manager07.getInstance().hashCode());
            }).start();
        }
    }
}
