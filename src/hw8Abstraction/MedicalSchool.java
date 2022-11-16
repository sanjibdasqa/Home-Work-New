package hw8Abstraction;

public abstract class MedicalSchool {
	
	
	public MedicalSchool() {
		System.out.println(" i am a default contructor inside medical school abstract Class");
	}

	public abstract void anatomyLab ();
	
	public void biochemistryLab() {
		System.out.println("I am from non abstruct class method biochemistryLab");
	}
	
	
	
}
