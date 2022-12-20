package oopExam;

public class Iphone6 extends Iphone5 {

	public void compass() {
		System.out.println("This is a method from Iphone6");
	}

	public int materials(int ramprice, int cameraprice) {
		int total1 = ramprice + cameraprice;
		System.out.println("The total1 is " + total1);
		return total1;
	}

	public int materials(int ramprice, int cameraprice, String processorprice) {
		int total2 = ramprice + cameraprice + Integer.parseInt(processorprice);
		System.out.println("The total2 is " + total2);
		return total2;
	}

	public void materials(int graphicprice, int coolingfanprice, float processorspeed) {
		int total3 = graphicprice + coolingfanprice + (int) processorspeed;
		System.out.println("The total3 is " + total3);
	}

	public int materials(float hdmicableprice, double processorno) {
		int total4 = (int) hdmicableprice + (int) processorno;
		System.out.println("The total4 is " + total4);
		return total4;
	}

	public final int materials(int audiojack, float mouse) {
		int total5 = audiojack + (int) mouse;
		System.out.println("This total5 is " + total5);
		return total5;
	}

	public static int materials(int keyboard, double speaker) {
		int total6 = keyboard + (int) speaker;
		System.out.println("This total6 is " + total6);
		return total6;
	}
	/*
	 * 1. Method Overloading :This is called static polymorphism or early binding or
	 * method overloading or compile time polymorphism: happens in compile time. 
	 * 2. Method Overriding: This is also Called dynamic polymorphism or late binding
	 * or method overriding or run time polymorphism: happens in Run time.
	 */
}
