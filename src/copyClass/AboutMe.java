package copyClass;

public class AboutMe {
	public String name;
	public String name01 = "Sanjib";
	public byte age = 30;
	public short myHouseNo = 31456;
	public int myYearlysalary= 214563987;
	public long myBankBalance= 9223372036854l;
	public float myHeight =1.434f;
	public double myGrade= 3.8695465885;
	public char sex= 'M';
	public boolean usCitizen= true;
	
	public static void main(String[] args) {
		AboutMe modon =new AboutMe();
		
		
		
		System.out.println("My name is: " + modon.name01 + ", My age: " + modon.age +", My house no is: " + modon.myHouseNo);
		
		
	}

}
