package kim.hsl.design.adapter.demo;

/**
 * 适配器
 * 输入 220V 电压, 输出 5V 电压
 */
public class Adapter implements PhoneCharge {
    private HomePower220V ac220V = new HomePower220V();
    @Override
    public int power5V() {
        int input = ac220V.power220V();
        //将 220 V 处理成 5V
        System.out.println("220V 转为 5V 电压");
        return 5;
    }
}