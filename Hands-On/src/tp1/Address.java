package tp1;

public class Address {
	private String street ;
	private String city ;
	private int postal_code ;
	
	public Address(String street, String city,int postal_code )
	{	this.setStreet(street);
		this.setCity(city);
		this.setPostal_code(postal_code);
		
	}


	public void Linafct2() {
		System.out.println("i'm learning GitHub ");
	}




	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;
	}
	
}


