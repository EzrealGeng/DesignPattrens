package fun.gengyun.strategy;

// Cat身高
public class CatHeightStrategy implements Strategy<Cat> {

    @Override
    public int compare(Cat t1, Cat t2) {
        return t1.getHeight() - t2.getHeight();
    }
}
