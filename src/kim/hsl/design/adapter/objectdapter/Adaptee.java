package kim.hsl.design.adapter.objectdapter;

/**
 * 被适配者
 * 这是被调用的现有类 , 但是不能使用 adapteeRequest 方法
 * 要使用用户 Target 接口的 request 方法
 */
public class Adaptee {
    public void adapteeRequest(){
        System.out.println("对象适配器测试 : 被适配者方法");
    }
}
