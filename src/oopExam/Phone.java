package oopExam;

/*
 Points: 70

1) What are the features of Interface you know? use multiple line comments here to describe it. you can use newline (\n) and tab(\t)
/* Interface is a blueprint of class, Interface cannot be instantiated (cannot create object),
 * An interface is a collection of methods that are defined but not implemented,
 * It Contains only abstract methods.
 * interface contains default and static method only which are non abstract(exception)
 *interface can't inherit a regular class or abstract class
 *interface inherit more than one interface by extends keyword only.
 **/

 /*
2) if Phone interface, inherit other Interface -- Pager and Wakitoki, use appropriate keywords to inherit them in line 11. if Phone interface can inherit regular class - LandPhone and one abstract class SatelitePhone, use appropriate keywords to inherit them. if not, then ignore it
 */

public interface Phone extends Pager , Wakitoki {
	
	/*
	 * Interface can't have variable and constructor.
 3) Create a variable and a constructor if possible, if not possible to create variable and constructor, use multiple line comments with explanation
 */
	
	
/*
4) Create four abstract method interfaceInfo (created below), call, message and camera 
*/
	public void interfaceInfo();
	public void call();
	public void message();
	public void camera();
	
/*
5) Create 2 non-abstract method - battery and wireless which are implemented inside this interface. Inside sysout print example-- "battery is a --- method from Java --?--" and complete the wireless one
 */
	
	
	public static void battery(){
		System.out.println("battery is a Static method from Java 1.8 ");
	}
	
	public default void wireless (){
		System.out.println("wireless is a default method from Java 1.8 ");
	}
		
	
}
