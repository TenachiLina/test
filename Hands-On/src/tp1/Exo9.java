package tp1;

public class Exo9 {
	public static void main(String[] args) {
	
	Company Comp = new Company();	
	Address ad1 = new Address("aaa","New York",25000);
	Address ad2 = new Address("bbb","New York",25000);
	Address ad3 = new Address("ccc","New York",25000);
	Employee emp1 = new Employee("Lina",0001,25000000,ad1);
	Employee emp2 = new Employee("Raya",0002,20000000,ad2);
	Employee emp3 = new Employee("Ziya",0003,30000000,ad3);
	Comp.hire(emp1);
	Comp.hire(emp2);
	Comp.hire(emp3);
	float salaire; 
	Address ad4 = new Address("ddd","New York",25000);
	Employee ee = new Employee("thief",0005,5000000,ad4 );
	salaire = ee.getSalary(0001);
	Comp.DisplayEmployees();
 
}}
