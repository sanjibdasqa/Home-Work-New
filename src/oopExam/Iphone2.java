package oopExam;

public class Iphone2 extends Iphone1 {

	public char userOfIphone2 = 'M';

	public Iphone2() {
		super("Iphone14", 1099, 'F', false);
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
		super.model = "IphoneSE";
		this.userOfIphone2 = userOfIphone2;
		System.out.println("Iphone user is " + userOfIphone2);
	}

	public void dropbox() {
		System.out.println("we use super method to call the constructor of super (parent) class \n"
				+ " try to put the super method (after sysout of default constructor) and find the below outcome\n"
				+ " Constructor call must be the first statement in a constructor of child class \n"
				+ " We can use only one super() method inside constructor\n"
				+ " Either default or parameterized constructor can be called/initialized by super method from the super class,\n"
				+ "That's why the below line in comment out\n"
				+ "super(); represents the default constructor of super/parent class\n");
	}

}
