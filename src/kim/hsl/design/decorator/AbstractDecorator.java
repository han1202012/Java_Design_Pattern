package kim.hsl.design.decorator;

/**
 * 装饰者
 * 抽象的装饰者
 * 该类也继承 被装饰者 的抽象类
 */
public abstract class AbstractDecorator extends AbstractStudent {

    //声明抽象的被装饰者, 通过构造器将其类型 ( 或子类类型 ) 对象传入 , 注入实体类
    private AbstractStudent abstractStudent;

    public AbstractDecorator(AbstractStudent abstractStudent) {
        this.abstractStudent = abstractStudent;
    }

    /*
       调用实现的两个 抽象装饰者 方法
       实际上委托给了注入的 抽象装饰者 类型的对象执行的
       抽象装饰者 类型的对象是其子类对象
     */

    @Override
    protected String studyCourses() {
        return this.abstractStudent.studyCourses();
    }
}