package tp3;

public class MainExo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiersExample A = new AccessModifiersExample();
			A.print1();
			A.print2();
			A.print3();
			
			//A.print4();//ga3d i goulli bdlilou le mode d'acces
			StaticExample E = new StaticExample();
			System.out.println("this static i from E before add"+ E.i);
			 E.i += 5 ;
			 StaticExample E2 = new StaticExample();
				System.out.println("this static i from instance E2 "+ E2.i);
			 
			//	System.out.println("this static i "+ E.i);
			
				E.test(); //what about the static method
				FinalExample FP = new FinalExample();
				FP.Final_Method();
				FinalChild FC = new FinalChild();
				FC.Final_Method();//didn't override
				FP.NotFinal_Method();
				FC.NotFinal_Method();//override
	}

}
