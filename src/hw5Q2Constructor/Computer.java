package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public String price;
	public char grade;
	public boolean madeInUSA;

	public Computer() {

		// Default Constructor Declared
		System.out.println("This is from default Constructor of Computer class.");

	}

	// Parameterized Constructor Declared
	public Computer(String brand, String model, String operatingSystem, String price, char grade, boolean madeInUSA) {

		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;

		System.out.println("My Brand: " + brand + ", Model: " + model + ", Operating system: " + operatingSystem
				+ ", Price :" + price + " Grade: " + grade + " and Made in U SA? " + "Ans: " + madeInUSA + ".");

	}

}
