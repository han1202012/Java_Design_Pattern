package kim.hsl.design.prototype.deepcopy;

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
    public void setCourses(Vector<String> course) {
        this.courses = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + courses +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("调用 Student clone 方法");

        //1 . 首先拷贝一个基本对象
        Student student = (Student) super.clone();

        //2 . 将引用类型的对象单独克隆赋值
        student.courses = (Vector<String>) this.courses.clone();

        //3 . 返回创建的新的对象
        return student;
    }
}