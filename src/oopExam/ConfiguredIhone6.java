package oopExam;

public class ConfiguredIhone6 extends Iphone6 {

	@Override
	public void compass() {
		System.out.println("This is a method from Iphone6");
	}

	@Override
	public int materials(int ramprice, int cameraprice) {
		int total1 = ramprice + cameraprice * 6;
		System.out.println("The total1 is " + total1);
		return total1;

	}

	@Override
	public int materials(int ramprice, int cameraprice, String processorprice) {
		int total2 = ramprice + cameraprice + Integer.parseInt(processorprice) / 9;
		System.out.println("The total2 is " + total2);
		return total2;
	}

	@Override
	public void materials(int graphicprice, int coolingfanprice, float processorspeed) {
		int total3 = graphicprice + coolingfanprice + (int) processorspeed - 9874;
		System.out.println("The total3 is " + total3);
	}

	@Override
	public int materials(float hdmicableprice, double processorno) {
		int total4 = (int) hdmicableprice + (int) processorno + 32154 * 3;
		System.out.println("The total4 is " + total4);
		return total4;
	}
	/*
	 * @Override public final int materials (int audiojack, float mouse) { int
	 * total5 = audiojack + (int)mouse; System.out.println("This total5 is" +
	 * total5); return total5; } 
	 * Final method can not be overridden.
	 */
	/*
	 * @Override public static int materials (int keyboard, double speaker) { int
	 * total6 = keyboard + (int)speaker; System.out.println("This total is "+
	 * total6); return total6; } 
	 * Static method can not be overridden.
	 */

}
