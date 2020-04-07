package kim.hsl.design.facade;

public class Main {
    public static void main(String[] args) {
        Goods goods = new Goods("肥皂");
        BuyFacade buyFacade = new BuyFacade();
        buyFacade.buyGoods(goods);
    }
}