package tp1;

public class Exo5et7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Book b1 = new Book("Harry Potter", "JK",061452,2000,"Fiction-magic-adventure");
//		Library ElHayat = new Library();
//		ElHayat.addBook(b1);

		
		University Con2 = new University();
		Department dep1 = new Department();
		dep1.name="NTIC";
		Department dep2 = new Department();
		dep2.name="Technologies";
		Department dep3 = new Department();
		dep3.name="Communication";
		Con2.addDepartment(dep1);
		Con2.addDepartment(dep2);
		Con2.addDepartment(dep3);
		Con2.DisplayDepartments();
		
		byte bte  = 2;
		short sh = 300 ;
		int integer = 20000;
		long lg = 925441;
		float flt = 2.5f;
		double dbl = 2.5684456d ; 
		char ca = 'c' ; 
		boolean bol = false ; 
		System.out.println(bte);
		System.out.println(sh);
		System.out.println(integer);
		System.out.println(lg);
		System.out.println(flt);
		System.out.println(dbl);
		System.out.println(ca);
		System.out.println(bol);
	}

}
