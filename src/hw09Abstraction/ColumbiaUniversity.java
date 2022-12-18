package hw09Abstraction;

public class ColumbiaUniversity extends MedicalSchool {

	public ColumbiaUniversity() {
	} // we can create constructor in regular class.

	/*
	 * which name is different from the class name because constructor name should
	 * be the as same as class name.
	 */

	/* public void chemistry (); we can't make a abstract method a regular class */

	public void biology() {
		System.out.println("This is a regular class and biology is a non abstruct method");
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

}
