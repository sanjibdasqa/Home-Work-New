package hw12Polymorphism;

public class Niece extends Sister {
	@Override
	public int sister(int age1, int age2) {
		int total1 = age1 + age2 *8 ;
		System.out.println("Total1 is " + total1);
		return total1;
	}
 @Override
	public void sister(String age4, int age3) {
		int total2 = Integer.parseInt(age4) + age3 /2;
		System.out.println("Total2 is " + total2);
	}
/*@Override
	public static void sister(int age2, int age3, String age4) {
		int total3 = age2 + age3 + Integer.parseInt(age4);
		System.out.println("Total3 is " + total3);
		
	}
	Static method can not be overridden 
	
	*/
 
	/*@Override
	final void sister(String age4, int age3, int age1, int age5) {
		int total4 = Integer.parseInt(age4) + age3 + age1 + age5;
		System.out.println("Total4 is " + total4);
		}
		Final method can not be overridden
		*/
 
 @Override
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total5 =age1+age2+age3+Integer.parseInt(age4)+age5+ age6 +20;
		System.out.println("Total5 is "+ total5);
	}

	
	
}
