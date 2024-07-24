package application;

import entities.Employee;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("\nEmployee: %s, $ %.2f\n", employee.name, employee.netSalary());
		
		System.out.print("\nWich percentage to increase salary?: ");
		double percent = sc.nextDouble();
		employee.increaseSalary(percent);
		
		System.out.printf("\nEmployee: %s, $ %.2f\n", employee.name, employee.netSalary());
		
		sc.close();

	}

}
