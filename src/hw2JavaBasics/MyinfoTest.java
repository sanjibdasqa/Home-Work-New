package hw2JavaBasics;

public class MyinfoTest {
	public String name01 = "Sanjib Das";
	public byte age = 120;
	public short myApartmentRent = 14578;
	public int myYearlySalary = 654789525;
	public long myBankBalance = 478965487654454l;
	public float my_weight =1.41f;
	public double my_grade= 3.55458;
	public char sex = 'M';
	public boolean usCitizen =true;
	
	public static void main(String[] args) {
		Myinfo myinfo = new Myinfo();
		System.out.println(myinfo.name01);
		System.out.println(myinfo.age);
		System.out.println(myinfo.myApartmentRent);
		System.out.println(myinfo.myYearlySalary);
		System.out.println(myinfo.myBankBalance);
		System.out.println(myinfo.my_grade);
		System.out.println(myinfo.my_height);
		
		System.out.println("I am "+ myinfo.name01 + ",  I am "+ myinfo.age+ " years old."+ "\nMy House rent is " + myinfo.myApartmentRent);
	
	
	}
	
	
}
