package kim.hsl.design.adapter.demo;

/**
 * 被适配者
 * 代表 220V 电压
 */
public class HomePower220V {
    public int power220V(){
        System.out.println("输出 220V 电压");
        return 220;
    }
}