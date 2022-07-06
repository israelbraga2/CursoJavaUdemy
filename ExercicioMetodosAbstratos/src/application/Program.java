package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			System.out.println("Tax payer #" + i + "data:");
			System.out.println("Individual or Company ( i/ c)?");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Anual Income:");
			double income = sc.nextDouble(); 
			
			if(ch == 'i') {
			
				System.out.println("Health expenditures :");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, income, healthExpenditures));
			}
			else {
				System.out.println("Number of employees");	
				int numberOfemployees = sc.nextInt();
				list.add(new Company(name, income, numberOfemployees) );
			}
		}
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(TaxPayer tp: list) {
			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		
		
		sc.close();
	}

}
