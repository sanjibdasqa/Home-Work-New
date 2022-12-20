package oopExam;

/*
 * An abstract class is a super class that cannot be instantiated (can't create objects).I
 *It Contains both abstract and non abstract methods 
 *Abstract method can not be implemented, can be defined only
 *Non abstract methods can be implemented, but can not be defined.
 *Abstract class can extends one regular class and one abstract class by extend keyword it can inherit more than one 
 *interface by implements keyword .

 ere, Can you make a relationship of AppleWatch with Watch, DigitalWatch, and AppleWatchSeries5? [points: 70] . 
 */

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {
	public String name;
	public int price;

	public AppleWatch() {
		System.out.println("This is a default constactor from Apple Watch");
	}

	public static void main(String[] args) {
		// AppleWatch aW = new AppleWatch; abstract class cannot be instantiated
	}

	public abstract void appleWatchInfo(); // This is a abstract method.

	public void abstractClassInfo() {
		System.out.println(
				"1.An abstract class must have an abstract method but in regular and interface it is not mendatory\n2. Abstract class can't be instantiated but a regular class can be instanciated/n3."
						+ "+\n3.Contains both abstract and not abstract method");
	}

}
