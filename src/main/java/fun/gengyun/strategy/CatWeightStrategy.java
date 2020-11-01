package fun.gengyun.strategy;

// Cat体重
public class CatWeightStrategy implements Strategy<Cat>{

    @Override
    public int compare(Cat t1, Cat t2) {
        return t1.getWeight() - t2.getWeight();
    }
}
