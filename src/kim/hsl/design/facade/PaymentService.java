package kim.hsl.design.facade;

/**
 * 支付子系统
 * 支付成功返回 true
 */
public class PaymentService {
    public boolean pay(Goods goods){
        System.out.println("使用银联支付");
        return true;
    }
}