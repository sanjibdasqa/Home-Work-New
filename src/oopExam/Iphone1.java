package oopExam;

/*
1)  Can you make a relation of Iphone1 with Phone Interface and AppleWatch Abstract class. [Complete the code after answering above]. [points: 30] . 

 */

public class Iphone1 extends AppleWatch implements Phone {
	
	public String model;
	
    private String info;
	private int price;
	private char user;
	private boolean madeinUSA;
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public char getUser() {
		return user;
	}
	public void setUser(char user) {
		this.user = user;
	}
	public boolean isMadeinUSA() {
		return madeinUSA;
	}
	public void setMadeinUSA(boolean madeinUSA) {
		this.madeinUSA = madeinUSA;
	}
	
	public Iphone1(){
		System.out.println("This is a default constructor from iphone1");
	}
	
	public Iphone1(String info, int price, char user, boolean madeinUSA) {
		this.info = info;
		this.price = price;
		this.user = user;
		this.madeinUSA = madeinUSA;
		System.out.println("iphone name is "+info+"\niphone price is " + price + "\niphone1 user is " +user + "\niphone made in USA? " +madeinUSA);
	}
	
	public void regularClassInfo() {
		System.out.println("1.Regular Class can be instantiated But Abstract and Interface can not be Instantiated"+"\n2.Regular Class Can not have method declared it can only have implemented method. Abstract Class and interface can have method declared ");
	}
	
	public void youtube() {
		System.out.println("Need to print all the freatures");
	}
	/*2)
	 * Assume 4 private variables here -- price (as int), Info (as String), user (as a char, M or F), madeInUSA (as boolean)
	 * inside Iphone1 class. If the variables are private how can you use those
	 * variable? What kind of concept you can use? use it just after the variables.
	 * get the out come in TestPhone class. Complete this action and go to next.
	 */
	@Override
	public void oneplus() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void motorola() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void rolex() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Iphone7() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void message() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void camera() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub
		
	}
	
	
	/*
	 * 3) Again, here in Iphone1, we got 4 private variables we know. Create 2
	 * constructors inside it using that 4 private variables -- default and
	 * parameterized after those variables (obviously before methods and after
	 * variables), now go to Iphone2 class.
	 */
	
	/*
	 * 1)
	 * Create a method - regularClassInfo and print out all the features of a
	 * regular class compared with Interface and Abstract class you know.
	 */

	/*
	 * Write a method inside them related to one of the features like youtube and
	 * print out related info.
	 */

}
