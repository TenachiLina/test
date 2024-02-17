package tp3;

public class FinalChild extends FinalExample {
	public final void finalMethod() {
        System.out.println("This is a final method in the Child class.");
    }
	 void NotFinal_Method(){
        System.out.println("This is not a final method in the Child class.");
        this.Protected_Method();//9dret tchoufha 
	 }
	
}


