package kim.hsl.design.prototype.shallowcopy;

/**
 * 浅拷贝
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
                " , " + name.hashCode() +
                '}';
    }
}