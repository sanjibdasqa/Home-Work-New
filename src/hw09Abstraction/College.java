package hw09Abstraction;

public interface College {
	
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm  () {
		System.out.println("This is default method from College ");
	}
		
	public static void studyRoom () {
			System.out.println("This is Static method from College ");
		}
	
}
