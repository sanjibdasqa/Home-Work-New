package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

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
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

}
