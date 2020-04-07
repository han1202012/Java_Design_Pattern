package kim.hsl.design.decorator;

public class Main {

    public static void main(String[] args) {

        //刚入学的学生
	    Student student = new Student();
	    System.out.println(student.studyCourses());

	    //大二学习计算机专业课程
        AbstractStudent computerStudent = new ComputerStudentDecorator(student);
        System.out.println(computerStudent.studyCourses());

        //大二学习音乐专业课程
        AbstractStudent musicStudent = new MusicStudentDecorator(student);
        System.out.println(musicStudent.studyCourses());

        //先学计算机 , 专修音乐的学生
        AbstractStudent computerMusicStudent = new ComputerStudentDecorator(computerStudent);
        System.out.println(computerMusicStudent.studyCourses());

    }
}
