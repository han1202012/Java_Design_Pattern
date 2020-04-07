package kim.hsl.design.decorator;

public class MusicStudentDecorator extends AbstractDecorator {

    public MusicStudentDecorator(AbstractStudent abstractStudent) {
        super(abstractStudent);
    }

    @Override
    protected String studyCourses() {
        return super.studyCourses() + " , 学习音乐专业课程";
    }
}