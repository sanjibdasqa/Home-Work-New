package oopExam;

import java.security.PublicKey;

/*
In 2004, Iphone6 come into the market which inherits Iphone5. Implement it. 
*/
public class Iphone6 extends Iphone5{
	
	public void compass() {
		System.out.println("This is a method from Iphone6");
	}
	
	public int materials (int ramprice, int cameraprice) {
		int total1= ramprice+cameraprice;
		System.out.println("The total1 is "+ total1);
		return total1;
		
	}
	
public int materials (int ramprice, int cameraprice, String processorprice ) {
	int total2 =ramprice+cameraprice+Integer.parseInt(processorprice);
	System.out.println("The total2 is "+ total2);
	return total2;
		}

public void materials (int graphicprice ,int coolingfanprice, float processorspeed) {
	int total3 = graphicprice + coolingfanprice + (int)processorspeed;
	System.out.println("The total3 is " + total3);
}


public int materials (float hdmicableprice, double processorno) {
	int total4 = (int)hdmicableprice + (int)processorno;
	System.out.println("The total4 is "+ total4);
return total4;
}

public final int materials (int audiojack, float mouse) {
	int total5 = audiojack + (int)mouse;
	System.out.println("This total5 is " + total5);
	return total5;
}

public static int materials (int keyboard, double speaker) {
	int total6 = keyboard + (int)speaker;
	System.out.println("This total6 is "+ total6);
	return total6;
}




	/*
	 * Write a method inside them related to one of the features like compass and
	 * print out related info. 
	 * 
	 * What kind of concept you can use to relate to Iphone1 to 6? Instantiate Iphone6 in TestPhone and show how many methods they can
	 * call in TestPhone. [points: 70] . 
	 * 
	 */

	/* First write about method over loading and method overriding with multiple line comments here
	 * Now, Think about Iphone6. It also has 6 methods with the same name as
	 * materials(). For example -- They are return type parameterized method (int ramPrice, int
	 * cameraPrice), another one return type parameterized method (int ramPrice, int cameraPrice, String
	 * ProcessorPrice), etc. Can you use the void, parameterized(return type), final (return type), or static (return type)
	 * method here as the same method name? if yes, create them and take more int
	 * variable of your own. What kind of concept you can use? [points: 70].
	 * Instantiate the class in TestPhone and initialize those methods. [points:
	 * 70]. 
	 * Now think about a regular class Name ConfiguredIphone6 which extends
	 * Iphone6. Override those methods of Iphone6 and change the logic at your own to show the
	 * changes. [points: 50]. Show the output in TestPhone (how many methods is
	 * possible to extends). [points: 50]. 
	 * 
	 * Please make sure you organize the code in every class
	 * 
	 * Paste the github link for the package
	 * below
	 * 
	 */
}


