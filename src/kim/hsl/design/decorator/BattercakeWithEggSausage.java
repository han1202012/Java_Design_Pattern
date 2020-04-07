package kim.hsl.design.decorator;

public class BattercakeWithEggSausage extends BattercakeWithEgg {

    @Override
    public String getDecorate() {
        return super.getDecorate() + " 加香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
