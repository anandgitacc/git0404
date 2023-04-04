package org.abstractprog;

// child class
public class SbiBank implements RbiBank, WorldBank {

	@Override
	public void savings() {
		System.out.println("Sbi: Savings % 6");
	}

	@Override
	public void fixed() {
		System.out.println("Sbi: Fixed % 6");
	}

	@Override
	public void loan() {
		System.out.println("Sbi: Loan % 6");
	}
	
	@Override
	public void deposite() {
		System.out.println("sbi: deposite % 10");
	}
	
	public static void main(String[] args) {
		
		SbiBank s = new SbiBank();
		s.savings();
		s.fixed();
		s.loan();
		s.deposite();
		
	}

	

}
