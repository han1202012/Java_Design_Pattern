package kim.hsl.design.adapter.objectdapter;

/**
 * 具体的目标实现类
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("具体的目标方法");
    }
}
