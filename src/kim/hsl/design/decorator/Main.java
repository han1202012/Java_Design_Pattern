package kim.hsl.design.decorator;

public class Main {

    public static void main(String[] args) {
	    Battercake battercake = new Battercake();
	    System.out.println(battercake.getDecorate() + " , 价格 : " + battercake.cost());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDecorate() + " , 价格 : " + battercakeWithEgg.cost());

        BattercakeWithEggSausage battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDecorate() + " , 价格 : " + battercakeWithEggSausage.cost());

    }

}
