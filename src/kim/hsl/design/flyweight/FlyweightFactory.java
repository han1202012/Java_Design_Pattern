package kim.hsl.design.flyweight;

import java.util.HashMap;

/**
 * 享元工厂
 * 维护对象池
 */
public class FlyweightFactory {
    /**
     * 对象池
     * 使用对象时, 从对象池中查找
     * 如果找到直接取出
     * 如果没有找到, 创建一个新对象, 放入对象池中, 然后返回该对象
     * 键 : 外部状态 值 : 享元对象
     */
    private static final HashMap<String, AbstractFlyweight> OBJECT_POOL = new HashMap<String, AbstractFlyweight>();
    public static AbstractFlyweight getObject(String externalState){
        //从对象池中获取对象
        ConcreteFlyweight object = (ConcreteFlyweight) OBJECT_POOL.get(externalState);
        //如果对象池中没有该对象
        if(object == null){
            object = new ConcreteFlyweight(externalState);
            OBJECT_POOL.put(externalState, object);
            System.out.println("创建新对象 外部状态 值 : " + externalState + " , 并放入对象池");
        }else{
            System.out.println("获取对象池中已有的对象 , 外部状态 值 : " + externalState);
        }
        return object;
    }
}