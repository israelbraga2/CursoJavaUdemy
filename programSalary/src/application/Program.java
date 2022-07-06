package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.println("Digite o nome do funcionário: ");
		employee.name = sc.nextLine();
		
		System.out.println("Gross salary (digite salário bruto): ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Tax (digite o imposto) :");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.println("Whitch percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		sc.close();
	}

}
