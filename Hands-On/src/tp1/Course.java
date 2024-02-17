package tp1;

public class Course {

	String Course_code;
	String Teacher_code;
	String Duration;
	String Location;
	
	
	public Course(String course_code, String teacher_code) {	
		Course_code = course_code ;
		Teacher_code = teacher_code ;
		
	}

	public Course UpdateDurLoc(Course oldCourse,String duration,String location )
	{ oldCourse.Duration = duration ; 
	  oldCourse.Location = location ;
	  return oldCourse; }
	
	
	public void Display_New_Updates(Course TheCourse )
	{  System.out.println("it's duration is : " + TheCourse.Duration); 
	System.out.println("it's location is : " + TheCourse.Location);
	  }
	
}
