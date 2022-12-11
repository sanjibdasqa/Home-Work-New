package hw10Abstraction;

public interface University extends College, Hospital {

	//HW 10 Abstraction Comments
		/*Only one word is used for inheritance the interface and this is extends keyword.
		 * An interface only can inherit interfaces only by extends keyword ,
		 * Interface can not inherit regular class and abstract class by extend keyword
		 * Also interface can not use implement keyword for inheritance.
		 * In the interface only one inheritance is possible which is done by Extends keyword
		 * and by using that more than one interface can be inherited
		 */
		
	//HW 09 Abstraction Comments
	/* Only one word is used for inheritance the interface and this is extends keyword.
		* An interface only can inherit interfaces only by extends keyword ,
		 * Interface can not inherit regular class and abstract class by extend keyword
		 * In the interface only one inheritance is possible which is done by Extends keyword
		 * and by using that more than one interface can be inherited
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
