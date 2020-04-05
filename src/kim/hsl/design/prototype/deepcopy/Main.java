package kim.hsl.design.prototype.deepcopy;

public class Main {

    public static void main(String[] args) {
        try {
            //测试使用 clone 方法实现的原型模式 , 使用原型模式创建 2 个对象
            Student newStudent = new Student();

            // 1 . 使用 clone 方法创建对象1
            Student student = (Student) newStudent.clone();
            student.setName("Tom");
            student.setAge(10);
            student.getCourses().add("数学");

            // 2 . 使用 clone 方法创建对象2
            Student student2 = (Student) newStudent.clone();
            student2.setName("Jerry");
            student2.setAge(18);
            student2.getCourses().add("语文");

            System.out.println("student : " + student + "\nstudent2 : " + student2);
        } catch (CloneNotSupportedException e) {
            //捕获 clone 方法可能产生的异常
            e.printStackTrace();
        }
    }
}