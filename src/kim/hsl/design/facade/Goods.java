package kim.hsl.design.facade;

/**
 * 商品
 */
public class Goods {
    private String name;
    public Goods(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                '}';
    }
}