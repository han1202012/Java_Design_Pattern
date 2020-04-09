package kim.hsl.design.adapter.objectdapter;

/**
 * 目标接口
 * 用户调用的是该接口的 userCall 方法
 *
 * 注意 : 适配器需要实现目标接口
 */
public interface TargetInterface {
    //用户调用的方法
    void userCall();
}