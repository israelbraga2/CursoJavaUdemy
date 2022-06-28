package teste;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();

		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * System.out.println("Digite seu nome: "); String x; x = sc.next();
		 * System.out.println("Voçê digitou: " + x );
		 * 
		 * System.out.println("Digite um número: "); int y; y = sc.nextInt();
		 * System.out.println("Voçê digitou: " + y );
		 * 
		 * System.out.println("Digite um número: "); double d; d = sc.nextDouble();
		 * System.out.println("Voçê digitou: " + d );
		 * 
		 * System.out.println("Digite o sexo:  " + " M " + " ou " + " F "); char s; s =
		 * sc.next().charAt(0); System.out.println("Voçê digitou: " + s );
		 * 
		 * System.out.println("Dados digitados:"); System.out.println(x);
		 * System.out.println(y); System.out.println(d); System.out.println(s);
		 * sc.close();
		 */

	}

}
