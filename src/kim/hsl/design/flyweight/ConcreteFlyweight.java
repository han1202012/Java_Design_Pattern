package kim.hsl.design.flyweight;

/**
 * 具体的享元角色
 * 注意要实现 抽象方法 , 覆盖其非默认的构造函数
 */
public class ConcreteFlyweight extends AbstractFlyweight {
    public ConcreteFlyweight(String externalState) {
        super(externalState);
    }
    @Override
    void action() {
        System.out.println("享元对象行为 , 外部状态 : " + externalState);
    }
}