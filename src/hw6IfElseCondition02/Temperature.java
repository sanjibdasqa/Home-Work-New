package hw6IfElseCondition02;

import java.util.Scanner;

public class Temperature {
	int temperarute = 78;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int temperature = scanner.nextInt();
		if (temperature < 32) {
			System.out.println("\"Freezing\"");

		} else if (temperature < 55) {
			System.out.println("\"Pleasant\"");
		} else if (temperature < 73) {
			System.out.println("\"Getting Warmer\"");
		} else if (temperature > 101) {
			System.out.println("\"Hot\"");
		} else {
			System.out.println("\" Please put Ice on my Head \"");

			scanner.close();

		}
	}

}
