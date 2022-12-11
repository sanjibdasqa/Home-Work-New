package hw11Abstraction;

public abstract class EngineeringSchool extends NYUniversity {
	
	// HW 10 Abstraction comments
			/* There are two key words are used for the inheritance in java for Abstract class 
		 * which are extends and implements keyword.
		 * An Abstract class can inherit one regular class or one abstract class by extend key word 
		 * and it can inherit more than one interface by implement keyword
		  * An Abstract Class can inherit one regular class and one abstract class but it can inherit more than one interface. 
		  */
		
		// HW 09 Abstraction comments
		/* There are two key words are used for the inheritance in java for an Abstract class 
		 * which are extends and implements keyword.
		 * An Abstract class can inherit one regular class or one abstract class by extend key word 
		 * but Abstract class can't inherit interface by extend keyword.
		 * A Abstract Class can inherit one regular class and one abstract class but it can inherit more than one interface. 
		  */
		
	
	
	
	

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("I am printing from computerLab");
	}

}
