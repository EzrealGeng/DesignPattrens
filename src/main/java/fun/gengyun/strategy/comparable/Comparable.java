package fun.gengyun.strategy.comparable;

public interface Comparable<T> {

    // 0 = 相等 负数 = 当前对象小于传进来的对象 正数 = 当前对象大于传进来的对象
    int compareTo(T t);
}
