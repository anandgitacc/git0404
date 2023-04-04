package org.polyclass;

// child class
public class SbiBank extends RbiBank {
	
	@Override // @ -> annotation - meta data
	public void savings() {
		System.out.println("Sbi: Savings % is 7");
		super.savings();
	}
	
	@Override
	public void fixed() {
		System.out.println("Sbi: Fixed % is 8");
		super.fixed();
	}
	
	public static void main(String[] args) {
		
		SbiBank s = new SbiBank();
		s.savings();
		s.fixed();
	}

}
