package tp1;
import java.util.ArrayList;

public class Company {
	
	private ArrayList<Employee> employees = new ArrayList<>();

    public void hire(Employee employee) {
    	employees.add(employee);
    }

    public void fire(Employee employee) {
    	employees.remove(employee);
    }

    public void DisplayEmployees() {
    	for (Employee emp : employees) {
    	    System.out.println(emp.getAddress().getCity());
    	}
    }

}
