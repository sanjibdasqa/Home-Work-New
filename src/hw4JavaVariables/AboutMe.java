package hw4JavaVariables;

public class AboutMe {
	// variables are declared here

	public String name;
	public byte age;
	public short myHouseNo;
	public int myCarNo;
	public long myPhoneNo;
	public float myWeight;
	public double myGpa;
	public char sex;
	public boolean carLicense;

	// Here Constructor declared

	public AboutMe() {
		System.out.println("This is all about us");

	}

	// Here method implemented

	public void aboutme() {

		System.out.println("My Name: " + name + "\nMy Age: " + age + "\nMy House No: " + myHouseNo + "\nMy Car No:"
				+ myCarNo + "\nMy Phone No" + myPhoneNo + "\nMySex:" + sex + "\nMy Weight: " + myWeight + "\nMy Grade: "
				+ myGpa + "\nDo I Have Any Driving License ? Ans: " + carLicense);
	}

}
