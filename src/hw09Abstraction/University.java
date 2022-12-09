package hw09Abstraction;


public interface University extends College, Hospital {

	// Only one word is used for inheritance the interface and this is extends
	/*
	 * An interface only can inherit interfaces only by extends keyword , interface
	 * can not inherit a regular class and abstract class by extends key words.	
	 */

	/*
	 * public University () {} 'created constructor' But it says interface can't
	 * have any constructor.
	 */
	
	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium () {
		System.out.println("This is default method from university ");
	}
		
	public static void library () {
			System.out.println("This is Static method from university ");
		}
	
	
		

}
