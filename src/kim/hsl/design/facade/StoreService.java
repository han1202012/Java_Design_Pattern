package kim.hsl.design.facade;

/**
 * 仓库子系统
 * 查询是否有库存
 */
public class StoreService {
    public boolean isStokeAvailable(Goods goods){
        System.out.println("校验是否有库存 : " + goods.toString() + " 有库存");
        return true;
    }
}