package hw12Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		Sister sister =new Sister();
		sister.sister(36,58);
		sister.sister("25", 39);
		sister.sister(47, 94,"37");
		sister.sister("12",50,49,20);
		sister.sister(14,80,46,"55",19,42);
		
		System.out.println("------This is from Niece class--------");
		Niece niece =new Niece();
		niece.sister(65, 420);
		niece.sister("39", 26);
		niece.sister(34, 210,25,"66",77,85);
		
		
	}

}
