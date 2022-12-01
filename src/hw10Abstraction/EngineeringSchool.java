package hw10Abstraction;

public abstract class EngineeringSchool {
	
	/* Abstract class can inherit one regular class and one abstract class by Extends keyword 
	 Abstract class can't use extends keyword to inherit an interface. 
	
	An Abstract Class inherit interface using implements keyword, and abstract class can inherit more that one 
	 interface by implements keyword.
	  */
	
	
	
	
	

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println(" I am printing from computerLab");
	}

}
