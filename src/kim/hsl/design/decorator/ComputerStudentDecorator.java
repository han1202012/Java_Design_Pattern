package kim.hsl.design.decorator;

/**
 * 实体装饰者类
 * 必须实现其带参数的构造器
 */
public class ComputerStudentDecorator extends AbstractDecorator {

    public ComputerStudentDecorator(AbstractStudent abstractStudent) {
        super(abstractStudent);
    }

    @Override
    protected String studyCourses() {
        return super.studyCourses() + " , 学习计算机专业课程";
    }
}