package kim.hsl.design.decorator;

/**
 * 加鸡蛋的煎饼
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    public String getDecorate() {
        return super.getDecorate() + " 加鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
