package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Students students = new Students();
		
		System.out.println("Nome do aluno: ");
		students.name = sc.nextLine();
		
		System.out.println("Nota 1: ");
		students.grade1 = sc.nextDouble();
		
		System.out.println("Nota 2: ");
		students.grade2 = sc.nextDouble();
		
		System.out.println("Nota 3: ");
		students.grade3 = sc.nextDouble();
		
		System.out.printf("Final da grade: %.2f", students.finalGrade());
		
		if(students.finalGrade() < 60.0) {
			System.out.printf(" REPROVADO: %.2f%n  ",  students.missingPoints());
			
		}else {
			System.out.println(" APROVADO ");
		}
		
		
		sc.close();
	}

}
