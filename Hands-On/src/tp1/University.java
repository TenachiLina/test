package tp1;

import java.util.ArrayList;

public class University {
	
		ArrayList<Department> departments = new ArrayList<>();

	    public void addDepartment(Department department) {
	    	departments.add(department);
	    }

	    public void removeDepartment(Department department) {
	    	departments.remove(department);
	    }

	    public void DisplayDepartments() {
	    	for (Department dep : departments) {
	    	    System.out.println(dep.name);
	    	}
	    }
	    
	    
}
