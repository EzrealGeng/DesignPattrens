package fun.gengyun.strategy.comparable;

public class Cat implements Comparable<Cat>{

    private int weight;

    private int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        // cat比较大小的功能 想要灵活指定
        // 对修改关闭，对扩展开放
        return this.height - cat.weight;
    }
}
