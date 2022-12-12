package oopExam;

public class TestPhone {

	public static void main(String[] args) {

		Iphone1 iphone1 = new Iphone1();

		iphone1.setInfo("iphone14");
		iphone1.setPrice(900);
		iphone1.setUser('F');
		iphone1.setMadeinUSA(false);

		System.out.println("iPhone name is " + iphone1.getInfo() + "\niphone1 Price is " + iphone1.getPrice()
				+ "\niphone user is " + iphone1.getUser() + "\nIphone is made in USA ? " + iphone1.isMadeinUSA());
		System.out.println("-----Default constructor is instantiated------");
		Iphone1 iphone001 = new Iphone1();
		System.out.println("<<<<<Paramiterized constructor is instantiated>>>>");
		Iphone1 iphone001a = new Iphone1("Iphone14", 1099, 'F', false);
		System.out.println("<<<<<Here Paramiterized method is intialized>>>");
		Iphone2 iphone002 = new Iphone2();
		iphone002.iPhone2Info('F');

		Iphone2 iphone2 = new Iphone2();
		iphone2.iPhone2Info();
		iphone2.regularClassInfo();

		Iphone3 iphone3 = new Iphone3();
		iphone3.map();
		iphone3.regularClassInfo();

		Iphone4 iphone4 = new Iphone4();
		iphone4.photos();
		iphone4.iPhone2Info();
		iphone4.regularClassInfo();

		Iphone5 iphone5 = new Iphone5();
		iphone5.email();
		iphone5.photos();
		iphone5.iPhone2Info();
		iphone5.regularClassInfo();

		Iphone6 iphone6 = new Iphone6();
		iphone6.compass();
		iphone6.email();
		iphone6.photos();
		iphone6.iPhone2Info();
		iphone6.regularClassInfo();

		System.out.println("------This is form IPhone6 Class------- ");

		iphone6.compass();
		iphone6.materials(47, 59);
		iphone6.materials(26, 58, "10");
		iphone6.materials(33, 94, 4.3545f);
		iphone6.materials(3.1254f, 9.545848);
		iphone6.materials(64, 3.254f);
		iphone6.materials(78, 8.165547);

		System.out.println("------This is form ConfiguredIhone6 Class------- ");

		ConfiguredIhone6 se = new ConfiguredIhone6();

		se.materials(65, 25);
		se.materials(54, 86, "8");
		se.materials(36, 14, 6.2145f);
		se.materials(2.1245f, 7.325415);

		/*
		 * Instantiate IPhone1, AppleWatch and Phone inside it. Call all the possible
		 * method by each of them. [points: 70] .
		 */

		/*
		 * Initialize getter and setter methods here from Iphone 1 and print:
		 * "I bought this phone in 2000, the price was 750$, user's sex: <put your sex initial> and boolean value for made in USA is: false"
		 * . [points: 70] .
		 */

		/*
		 * Instantiate Iphone6 in TestPhone and show how many methods they can call in
		 * TestPhone. [points: 70] . Comment out at the end of TestPhone to inform me
		 * which is hierarchical inheritance, multilevel inheritance, and single
		 * inheritance. [points: 50].
		 */

	}

}
