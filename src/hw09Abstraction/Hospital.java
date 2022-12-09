package hw09Abstraction;

public interface Hospital {

	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public default void morgue() {
		System.out.println("This is default method from Hostipal ");
	}

	public static void pharmacy() {
		System.out.println("This is Static method from Hostipal ");
	}

}
