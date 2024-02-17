package tp3;

public class FinalExample {
	//final float pi =  3.14 ;
	//pi++;//error invalid variable declaration 
	final void Final_Method(){
        System.out.println("This is a final method in the Parent class.");
    }
	
	void NotFinal_Method(){
        System.out.println("This is not a final method in the Parent class.");
    }
	
	protected void Protected_Method(){
        System.out.println("This is a protected method in the Parent class.");
    }
	
}
