package kim.hsl.design.prototype.shallowcopy;

import java.util.Vector;

/**
 * 浅拷贝示例
 */
public class Student implements Cloneable {

    private String name;
    private int age;

    //该类在拷贝时 , 如果使用浅拷贝 , 只是将地址拷贝走了 , 两个对象实际上用的是同一个对象
    private Vector<String> courses = new Vector<>();

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

    public Vector<String> getCourses() {
        return courses;
    }
    public void setCourses(Vector<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", courses=" + courses +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("调用 Student clone 方法");
        return super.clone();
    }
}