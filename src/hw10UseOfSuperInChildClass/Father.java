package hw10UseOfSuperInChildClass;

public class Father {
	String name;
	int age;
	char sex; 
	boolean usCitizen; 
	String familyName;
	
	public Father() {
		System.out.println("This is a default constructor from father");
					}

	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("This is a paramitarized constructor");
		}
	
	public void father() {
		System.out.println("this is a default method from father");
		}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
	}
		
	
	
		
	}
	
	


