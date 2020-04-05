package kim.hsl.design.prototype;

import java.util.Vector;

/**
 * 原型模式实现流程 : 使用 clone 方法实现原型模式
 * 1 . 类继承 Cloneable 接口
 * 2 . 实现 protected Object clone() 方法
 */
public class Student implements Cloneable {
    private String name;
    private int age;

    public Student() {
        System.out.println("调用 Student 默认构造函数");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("调用 Student clone 方法");
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", " + super.toString() +
                '}';
    }
}