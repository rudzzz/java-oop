package java_oop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Employee employee1, employee2;
		
		employee1 = new Employee();
		employee2 = new Employee();
		
		String name1, name2;
		Double hourValue1, hourValue2, total;
		int hour1, hour2;
		
		
		System.out.println("First employee data:");
		name1 = scanner.next();
		hourValue1 = scanner.nextDouble();
		hour1 = scanner.nextInt();
		
		System.out.println("Second employee data:");
		name2 = scanner.next();
		hourValue2 = scanner.nextDouble();
		hour2 = scanner.nextInt();
		
		total = (hourValue1 * hour1) + (hourValue2 * hour2);
		
		System.out.println(total);
	}
}
