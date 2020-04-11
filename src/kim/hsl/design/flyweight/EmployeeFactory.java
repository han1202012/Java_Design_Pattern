package kim.hsl.design.flyweight;

import java.util.HashMap;

public class EmployeeFactory {
    /**
     * 对象池
     * 使用对象时, 从对象池中查找
     * 如果找到直接取出
     * 如果没有找到, 创建一个新对象, 放入对象池中, 然后返回该对象
     */
    private static final HashMap<String, AbstractFlyweight> EMPLOYEE_MAP = new HashMap<String, AbstractFlyweight>();
    public static AbstractFlyweight getManager(String department){
        ConcreteFlyweight manager = (ConcreteFlyweight) EMPLOYEE_MAP.get(department);
        if(manager == null){
            manager = new ConcreteFlyweight(department);
            EMPLOYEE_MAP.put(department, manager);
            System.out.println("创建部门经理 : " + department);
        }
        return manager;
    }
}
