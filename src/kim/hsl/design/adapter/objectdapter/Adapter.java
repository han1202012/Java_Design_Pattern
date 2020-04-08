package kim.hsl.design.adapter.objectdapter;

/**
 * 适配器类
 * 适配器类 维护了一个 被适配者的对象 Adaptee 成员变量
 * 同时又实现了目标接口 Target
 * 当用户调用 Target 接口的 request 方法时
 * 将实际的操作委托给 Adaptee 接口的 adapteeRequest 方法
 */
public class Adapter implements Target {

    //通过维护成员变量的方式 , 将 Target 接口的 request 方法
    // 委托给 Adaptee 接口的 adapteeRequest 方法
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //将父类 Adaptee 的 request 方法适配给了 Target 接口
        adaptee.adapteeRequest();
    }
}
