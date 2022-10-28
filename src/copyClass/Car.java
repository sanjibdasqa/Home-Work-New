package copyClass;


public class Car {
	public String name;
	public int age;
	
	public void iphone() {
	
		System.out.println("i am printing from method :"+ name);
		System.out.println("i am the result form the object calling : "+ age);
		
		}
	public static void main(String[] args) {
		Car sanjib = new Car();
		
	System.out.println(sanjib.name);
	
	sanjib.name ="Poly";
	sanjib.age =25;
	
	sanjib.iphone();
	
	Car sanjib01 = new Car();
	
	sanjib01.name =" nunu";
	sanjib01.age =12;
	
	sanjib01.iphone();
			
			
	}
	
	
	
	
}