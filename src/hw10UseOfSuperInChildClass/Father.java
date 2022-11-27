package hw10UseOfSuperInChildClass;

public class Father {
	int name;
	int age;
	char sex; 
	boolean usCitizen; 
	String familyName;
	
	public Father() {
		System.out.println("This is a default constructor ");
		
			}

	public Father(int name, int age, char sex, boolean usCitizen, String familyName) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		this.familyName = familyName;
		
		System.out.println("This is a peramitarized Constructor ");
	}
	
	

}
