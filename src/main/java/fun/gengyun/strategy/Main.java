package fun.gengyun.strategy;


import java.util.Arrays;

/**
 * 策略模式 比comparable接口更灵活， 比较策略自己决定
 */
public class Main {

    public static void main(String[] args) {
        Cat[] a = { new Cat(3,5), new Cat(1, 1), new Cat(5, 3)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(a, new CatHeightStrategy());
        // sorter.sort(a, new CatWeightStrategy());
        System.out.println(Arrays.toString(a));
    }
}
