package kim.hsl.design.adapter.classadapter;

/**
 * 适配器类
 * 适配器类继承了 被适配者 Adaptee
 * 同时又实现了目标接口 Target
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        //将父类 Adaptee 的 request 方法适配给了 Target 接口
        super.adapteeRequest();
    }
}
