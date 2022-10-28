package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe sanjib = new AboutMe(); // Constructor is initialized here
		// Variables are initialized here
		sanjib.name = "Sanjib Das";
		sanjib.age = 89;
		sanjib.myHouseNo = 25478;
		sanjib.myCarNo = 25478962;
		sanjib.myPhoneNo = 547863214554875l;
		sanjib.myWeight = 1.145874f;
		sanjib.myGpa = 3.84565566125;
		sanjib.sex = 'M';
		sanjib.carLicense = false;

		sanjib.aboutme(); // Method is Initialized

		System.out.println("\n----------------------------------------------------\n");

		AboutMe sanjib01 = new AboutMe();
		// Variables are initialized here
		sanjib01.name = "Alex";
		sanjib01.age = 52;
		sanjib01.myHouseNo = 24789;
		sanjib01.myCarNo = 2547892;
		sanjib01.myPhoneNo = 587863254854875l;
		sanjib01.myWeight = 2.245874f;
		sanjib01.myGpa = 2.25565566125;
		sanjib01.sex = 'M';
		sanjib01.carLicense = false;

		sanjib01.aboutme(); // Method is Initialized

	}

}
