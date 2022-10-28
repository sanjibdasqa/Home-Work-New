package copyClass;

public class Mobile {
	
	public String name;
	public int age;
	
	public void camera () {
		
		System.out.println("I name is method :"+ name);
		System.out.println("My age is :" + age);
	}

	public static void main(String[] args) {
		
	Mobile computer = new Mobile ();
	
	computer.name ="Poly";
	computer.age = 23;
	
	computer.camera();
	
			
		
		
		
	}
	
	
}
