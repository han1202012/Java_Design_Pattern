package kim.hsl.design.decorator;

/**
 * 被装饰对象
 * 确定的实体类
 */
public class Student extends AbstractStudent {

    @Override
    protected String studyCourses() {
        return "学习大学公共课";
    }
}