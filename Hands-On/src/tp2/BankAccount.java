package tp2;

public class BankAccount {
  int accountNumber;
  double balance;
  static int i = 00001 ;
  public void deposit(int accountNumber,double amount) {
	  if( this.accountNumber == accountNumber) {
		  this.balance += amount;
			System.out.println("Your new balance is " + this.balance);

	  }else {
		  System.out.println("Vous ne pouvez pas accéder à ce compte .");
	  }
  }

  public BankAccount(double balance) {
	  
	  this.accountNumber = i;
	  this.balance=balance;
	  System.out.println("Your account Number is " + this.accountNumber);
	  i++;

  }
  

}
