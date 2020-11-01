package fun.gengyun.strategy.comparable;

import java.util.Arrays;

/**
 * 如果有时候按cat的体重排序 有时候按照cat的身高排序 怎么处理？
 */
public class Main {

    public static void main(String[] args) {
        Cat[] a = { new Cat(3,5), new Cat(1, 1), new Cat(5, 3)};
        Sorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
