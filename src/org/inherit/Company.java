package org.inherit;

// child class B
public class Company extends Client {
	
	public void comName() {
		System.out.println("Company name: GreensTech");
	}
	
	public void comId() {
		System.out.println("Compay id: 112");
	}
	
	public static void main(String[] args) {
		
		Company c = new Company();
		c.comName();
		c.comId();
		c.clName();
		c.clLocation();
		
	}
	
	

}
