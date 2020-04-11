package kim.hsl.design.flyweight;

/**
 * 抽象的享元角色
 */
public abstract class AbstractFlyweight {
    /**
     * 内部状态
     */
    private String intrinsicState;

    /**
     * 外部状态
     * 注意使用 final 修饰只能 ① 马上初始化 ② 在构造函数中初始化
     * 没有其它的初始化途径
     */
    protected final String externalState;

    public AbstractFlyweight(String externalState) {
        this.externalState = externalState;
    }

    /**
     * 抽象的行为
     */
    abstract void action();

    /*
        下面是访问内部状态的 Getter 和 Setter 方法
     */
    public String getIntrinsicState() {
        return intrinsicState;
    }
    public void setIntrinsicState(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }
}
