package kim.hsl.design.adapter.objectdapter;

public class Main {
    public static void main(String[] args) {
        //用户创建的类时 目标接口 类型对象
        //但创建对象时 , 创建的是适配器对象
        //适配器对象 实现了 TargetInterface 接口 , Adapter 是 Target 子类
        //适配器中重写的 userCall 方法实际上委托给了 Adaptee 被适配者对象 成员
        TargetInterface target = new Adapter();
        target.userCall();
    }
}