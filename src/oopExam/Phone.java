package oopExam;

public interface Phone extends Pager, Wakitoki {

	/* Interface can't have variable and constructor. */

	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	public static void battery() {
		System.out.println("battery is a Static method from Java 1.8 ");
	}

	public default void wireless() {
		System.out.println("wireless is a default method from Java 1.8 ");
	}

}
