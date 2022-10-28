package lec04Methods;

public class AboutMe {
	// Variable Declared
	public String sanjibinfoString;
	// Variable Initialized 
	public String name01 = "Sanjib";
	public byte age = 90;
	public short myHouseNo = 14578;
	public int mySalary = 2147483647;
	public long myBankBalance =9223372036854775807l;
	public float myWeight =1.734435f;
	public double myGrade = 3.8676573457384;
	public char sex = 'M';
	public boolean usCitizen = true;
	
	public static void main(String[] args) {
		AboutMe aboutMe =new AboutMe();
		System.out.println("My name is "+ aboutMe.name01);
		System.out.println("My age is "+ aboutMe.age+ ", I live in appartment no "+  aboutMe.myHouseNo + ". My yearly salary is "+aboutMe.mySalary );
				


	}

}
