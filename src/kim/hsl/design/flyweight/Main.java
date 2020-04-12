package kim.hsl.design.flyweight;

public class Main {
    /**
     * 注意 : 享元对象使用时, 创建的是抽象的享元类
     * @param args
     */
    public static void main(String[] args) {
        //外部状态值为 "tom" , 对象池中没有该对象, 创建后放入对象池, 然后从对象池中取出使用
        AbstractFlyweight tom = FlyweightFactory.getObject("tom");
        tom.action();

        //外部状态值为 "tom" 的对象之前已经创建过, 直接从对象池中取出使用
        AbstractFlyweight tom2 = FlyweightFactory.getObject("tom");
        tom2.action();

        //外部状态值为 "Jerry" , 对象池中没有该对象, 创建后放入对象池, 然后从对象池中取出使用
        AbstractFlyweight jerry = FlyweightFactory.getObject("Jerry");
        jerry.action();
    }
}