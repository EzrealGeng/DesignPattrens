package fun.gengyun.strategy;

// 猫比较器
public interface Strategy<T> {

    int compare(T t1, T t2);
}
