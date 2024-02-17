package tp1;

public class Person {
	String Last_name;
	String Address;
	String Contact_info;
	String First_name;
	int Age;

	//méthode Person est le constructeur car il porte le même nom que la classe (?)
	//et il renvoie bien l'instance après l'avoir construite même s'il n'y a pas type de renvoi (?)
	public Person(String last_name,String first_name,int age)
	{
		Last_name =  last_name; 
		First_name = first_name;
		Age = age;
	}
	public Person UpdateAddContact(Person oldPerson,String address,String contact )
	{ oldPerson.Address = address ; 
	  oldPerson.Contact_info = contact ;
	  return oldPerson; }
	
	public void Display_New_Updates(Person ThePerson )
	{  System.out.println("His Address is : " + ThePerson.Address); 
	System.out.println("His Contact is : " + ThePerson.Contact_info);
	  }
}
