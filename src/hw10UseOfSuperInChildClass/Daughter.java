package hw10UseOfSuperInChildClass;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Daughter extends Father {
	String birthMonth; 
	int age;
	
	public Daughter() {
		super();
		super.father();
		super.fatherInfo("sanjib", 35, 'M', true);
		super.familyName = "sanjibfamily";
		System.out.println("This is a default Constructor");
	}

	public Daughter(String birthMonth, int age) {
		System.out.println("The birth month is: " + birthMonth  + "the age  is:" + age);
		this.birthMonth = birthMonth;
		this.age = age;
	}
	
		public void daughter() {
			
			System.out.println("This is a regular method");
								
			}
		public void daughter(String birthMonth, int age) {
			System.out.println("The birth month is: " + birthMonth  + "the age  is:" + age);
			this.birthMonth = birthMonth;
			this.age = age;
		}
		
		
		
		
}
