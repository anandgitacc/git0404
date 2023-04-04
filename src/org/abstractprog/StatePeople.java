package org.abstractprog;

// child class
public class StatePeople extends Indians {

	@Override
	public void foodHabit() {
		System.out.println("Following south food habit");
	}

	@Override
	public void culture() {
		System.out.println("Following south culture");
	}
	
	private void tamilNadu() {
		System.out.println("Following orders of Taminadu GOVT");
	}
	
	public static void main(String[] args) {
		
		StatePeople s = new StatePeople();
		s.foodHabit();
		s.culture();
		s.tamilNadu();
		s.panCard();
		s.aadharCard();
		
	}
	
	

}
