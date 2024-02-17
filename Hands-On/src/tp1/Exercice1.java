package tp1;

public class Exercice1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Person p = new Person("Tenachi","Lina",20);
	
	System.out.println("p's age is : " + p.Age);
	System.out.println("p's first_name is : " + p.First_name);
	
	p.First_name = "Leila ";
	System.out.println("p's first_name is : " + p.First_name);
	
	p.UpdateAddContact(p,"Belle Vue", "MyEmail");
	p.Display_New_Updates(p);
	
	Teacher t = new Teacher("jk");
	
	Course c = t.CreateCourse("asd","java");
	System.out.println (c.Course_code);
	
	String firstName = "John";
	String lastName = "Doe";
	String fullName = firstName + " " + lastName;

	
	int[] nbr = {1,2,3};
	nbr = new int[] {4,5,6};
	System.out.println("nbr[0] " + nbr[0]);
	

	}

}
