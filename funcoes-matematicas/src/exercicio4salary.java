import java.util.Locale;
import java.util.Scanner;

public class exercicio4salary {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero do funcion�rio:");
		int numero = sc.nextInt();
		
		System.out.println("Digite o n�mero de horas trabalhadas: ");
		int hrextra = sc.nextInt();
		
		System.out.println("Valor da hora extra: ");
		double valhr = sc.nextDouble();		
		
				
		double salrecebido = valhr * hrextra;
		
		System.out.println("N�mero " + numero);
		System.out.printf("Sal�rio: US$ %.2f%n", salrecebido);
		
		
		
		sc.close();
		

	}

}
