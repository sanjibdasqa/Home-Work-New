package oopExam;

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

	public Iphone1() {
		System.out.println("This is a default constructor from iphone1");
	}

	public Iphone1(String info, int price, char user, boolean madeinUSA) {
		this.info = info;
		this.price = price;
		this.user = user;
		this.madeinUSA = madeinUSA;
		System.out.println("iphone name is " + info + "\niphone price is " + price + "\niphone1 user is " + user
				+ "\niphone made in USA? " + madeinUSA);
	}

	public void regularClassInfo() {
		System.out.println("1.Regular Class can be instantiated But Abstract and Interface can not be Instantiated"
				+ "\n2.Regular Class Can not have method declared it can only have implemented method. Abstract Class and interface can have method declared."
				+ "\n3.Regular class Can inherit only 1 regular class or 1 abstract class where interface can inherit more than one interface by extend keyword ");
	}

	public void youtube() {
		System.out.println("This is a void type method from Iphonw1 class");
	}

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

}
