package org.polymorphism;

//         child calss
public class SbiBank extends RbiBank {

	@Override // @ -> annotation - meta data
	public void savings() {
		System.out.println("Sbi : Savings % is : 6");
		super.savings();
	}
	
	@Override
	public void fixed() {
		System.out.println("Sbi : Fixed % is : 8");
		super.fixed();
	}
	
	@Override
	public void loan() {
		System.out.println("Sbi : Loan % is : 9");
		super.loan();
	}
	
	public static void main(String[] args) {
		
		SbiBank s = new SbiBank();
		s.savings();
		s.fixed();
		s.loan();
	}
	
}
