package kim.hsl.design.adapter.objectdapter;

/**
 * 适配器类
 *
 * 适配器类 维护了一个 被适配者的对象 Adaptee 成员变量
 * 同时又实现了目标接口 TargetInterface
 * 当用户调用 TargetInterface 接口的 userCall 方法时
 * 将实际的操作委托给 Adaptee 接口的 adapteeFunction 方法
 */
public class Adapter implements TargetInterface {

    //通过维护成员变量的方式 , 将 TargetInterface 接口的 request 方法
    // 委托给 Adaptee 接口的 adapteeRequest 方法
    private Adaptee adaptee = new Adaptee();

    @Override
    public void userCall() {
        //将父类 Adaptee 的 request 方法适配给了 TargetInterface 接口
        adaptee.adapteeFunction();
    }
}