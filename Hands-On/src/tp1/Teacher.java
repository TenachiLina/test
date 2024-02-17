package tp1;

public class Teacher {
	String name;
	
	public Teacher(String NAME)
	{
		name = NAME;
	}
	public Course CreateCourse(String course_code,String teacher_code) {	
		Course c = new Course(course_code, teacher_code );
		return c;
	}
}
