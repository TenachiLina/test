package tp1;

public class Employee {

	private String Name;
	private int ID;
	private float Salary;
	private Address address; 
	
	public Employee(String name, int id,float salary, Address address  )
	{	this.setName(name);
		this.setID(id);
		this.setSalary(salary,id);
		this.setAddress(address); 	
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public float getSalary(int id) { 
		if(id == this.ID) 
		return Salary;
		else 
		{System.out.println("You don't have the right to look at other's salaries");
		return 0;}
	}

	public void setSalary(float salary,int id) {if(id == this.ID) 
		Salary = salary;
		else 
		{System.out.println("You can't change other's salaries");
		}
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
