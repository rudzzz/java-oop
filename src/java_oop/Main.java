package java_oop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Employee employee1, employee2;
		
		employee1 = new Employee();
		employee2 = new Employee();
		
		System.out.println("First employee data:");
		employee1.name = scanner.next();
		employee1.hourValue = scanner.nextDouble();
		employee1.hour = scanner.nextInt();
		
		System.out.println("Second employee data:");
		employee2.name = scanner.next();
		employee2.hourValue = scanner.nextDouble();
		employee2.hour = scanner.nextInt();
		
		total = (hourValue1 * hour1) + (hourValue2 * hour2);
		
		System.out.println(total);
	}
}
