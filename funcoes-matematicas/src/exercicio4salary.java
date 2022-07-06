import java.util.Locale;
import java.util.Scanner;

public class exercicio4salary {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número do funcionário:");
		int numero = sc.nextInt();
		
		System.out.println("Digite o número de horas trabalhadas: ");
		int hrextra = sc.nextInt();
		
		System.out.println("Valor da hora extra: ");
		double valhr = sc.nextDouble();		
		
				
		double salrecebido = valhr * hrextra;
		
		System.out.println("Número " + numero);
		System.out.printf("Salário: US$ %.2f%n", salrecebido);
		
		
		
		sc.close();
		

	}

}
