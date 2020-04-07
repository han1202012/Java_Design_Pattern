package kim.hsl.design.facade;

/**
 * 物流子系统
 * 进入发货流程 , 返回物流编号
 */
public class LogisticsService {
    public String logistics(Goods goods){
        String logisticsNo = "31415926";
        System.out.println(goods + " 进入物流系统 , 运单号为 " + logisticsNo);
        return logisticsNo;
    }
}