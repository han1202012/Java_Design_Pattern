package kim.hsl.design.adapter.classadapter;

/**
 * 适配器类
 *
 * 适配器类 继承了 被适配者 类, 目的是为了访问其 adapteeFunction 函数
 * 同时其实现了 TargetInterface 接口 , 在 重写的 userCall 方法中 ,
 * 调用 Adaptee 父类的 adapteeFunction 方法 , 将实际的操作委托给了父类方法
 */
public class Adapter extends Adaptee implements TargetInterface {
    @Override
    public void userCall() {
        //将父类 Adaptee 的 request 方法适配给了 TargetInterface 接口
        super.adapteeFunction();
    }
}
