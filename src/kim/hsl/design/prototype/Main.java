package kim.hsl.design.prototype;

public class Main {

    public static void main(String[] args) {
        try {

            //测试使用 clone 方法实现的原型模式 , 使用原型模式创建 10 个对象
            Student newStudent = new Student();

            /*
                需求声明 : 此时要创建 10 个 Student 对象
                         依次调用一个创建好的 Student 对象的 clone 方法 10 次
                         即可创建 10 个不同的对象
                适用场景 : 这是频繁创建大量的对象 , 该场景下适合使用原型模式
             */
            for (int i = 0; i < 10; i++) {
                // 1 . 使用 clone 方法创建对象
                Student student = (Student) newStudent.clone();
                // 2 . 设置克隆出的对象参数
                student.setName("Tom" + i);
                student.setAge(10 + i);
            }
        } catch (CloneNotSupportedException e) {
            //捕获 clone 方法可能产生的异常
            e.printStackTrace();
        }

    }

}
