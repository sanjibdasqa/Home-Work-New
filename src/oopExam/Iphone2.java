package oopExam;

/*
 NOW, Iphone1 came in 2000, but the new model Iphone2, Iphone3 came in 2001. 
 Assume Iphone1 is a superclass and Iphone2, Iphone3 is the child class of the Iphone1. Implement that here.
 */

public class Iphone2 extends Iphone1 {

	public char userOfIphone2 = 'M';

	public Iphone2() {
	super("Iphone14",1099,'F',false);
	super.regularClassInfo();
		
		System.out.println("This is a default Constructor from Iphone2 ");
	}
	public Iphone2(char userOfIphone2) {
		this.userOfIphone2 = userOfIphone2;
		System.out.println("Iphone user is " + userOfIphone2);
	}
	public void iPhone2Info() {
		super.regularClassInfo();
		System.out.println("this is a regular method from iphone2");
	}
	public void iPhone2Info(char userOfIphone2) {
		super.regularClassInfo();
		super.model ="IphoneSE";
		this.userOfIphone2 = userOfIphone2;
		System.out.println("Iphone user is " + userOfIphone2);
	}

	/*
	 * 1) In IPhone2, Initialize a char variable userOfIphone2 (M or F). create
	 * default and parameterized constructor, a void type method iPhone2Info, a
	 * parameterized method with same name iPhone2Info inside Iphone2 class. Use the
	 * super method and super keyword in constructor, and super keyword in methods
	 * of Iphone2. Call constructor and methods. Can you call variable by super
	 * keyword? create a public variable inside Iphone1 and execute it in Iphone2.
	 * Execute all of them in TestPhone. [points: 70]
	 */

	/*
	 * Write a method inside them related to one of the features like dropbox and
	 * print out related info.
	 */

}
