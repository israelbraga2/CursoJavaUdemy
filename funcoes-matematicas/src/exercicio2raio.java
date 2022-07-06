import java.util.Locale;
import java.util.Scanner;

public class exercicio2raio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi = 3.14159;
		
		
		System.out.println("Digite o numero do raio:");
		raio = sc.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.printf("Valor da area é : %.4f%n ", area);
		
		
		
		
		
		
		
		sc.close();

	}

}
