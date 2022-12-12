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

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch ,DigitalWatch {
	public String name;
	public int price;
	
	
	public AppleWatch() {
		System.out.println("This is a default constactor from Apple Watch");
	}
	
	
	
	public static void main(String[] args) {
		//AppleWatch aW = new AppleWatch; abstract class cannot be instantiated
		}
	     
	public abstract void appleWatchInfo();
	
	public void abstractClassInfo() {
		System.out.println("this is a non abstract method");
	}
	
	
	/*
Create 2 method: One is abstractClassInfo [which is a non-abstract method, print out all the features of an abstract class compared with Interface, regular class]. what type of method would be the other one if the name is appleWatchInfo? Please create this method
	 */

}
