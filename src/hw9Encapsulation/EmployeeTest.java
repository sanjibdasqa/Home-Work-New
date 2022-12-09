package hw9Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee ();
		employee.setName("Sanjib");
		employee.setAge(30);
		employee.setSex('M');
		employee.setUscitizen(true);
		
	
		System.out.println("Employee Name Is : " + employee.getName() + "\nEmployeeAge Is : " + employee.getAge() + "\nEmployee Sex Is : " + employee.getSex() + "\nEmployee status US Citizen : " + employee.isUscitizen());
	
		
				

}
}
