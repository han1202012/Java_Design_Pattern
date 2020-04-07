package kim.hsl.design.facade;

/**
 * 用户购买的统一接口
 * 用户只需要与该类进行交互
 * 该类统一处理 仓储 支付 物流 等购买流程
 */
public class BuyFacade {
    private LogisticsService logisticsService;
    private PaymentService paymentService;
    private StoreService storeService;

    public BuyFacade() {
        storeService = new StoreService();
        paymentService = new PaymentService();
        logisticsService = new LogisticsService();
    }

    /**
     * 外观类提供的访问内部三个子系统的接口
     * 客户端只需要调用该方法 , 即可完整商品购买流程
     * @param goods
     */
    public void buyGoods(Goods goods){
        if(storeService.isStokeAvailable(goods)){
            if(paymentService.pay(goods)){
                logisticsService.logistics(goods);
            }
        }
    }
}