import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1 , cod2 , qtd1 , qtd2;
		double totalpecas , valorpeca1 , valorpeca2;
		
		System.out.println("Digite o c�digo da pe�a: ");
		cod1 = sc.nextInt();
		System.out.println("Digite a quantidade da pe�a: ");
		qtd1 = sc.nextInt();
		
		System.out.println("Digite o valor da pe�a: ");
		valorpeca1 = sc.nextDouble();
		
		System.out.println("Digite o c�digo da pe�a: ");
		cod2 = sc.nextInt();
		System.out.println("Digite a quantidade da pe�a: ");
		qtd2 = sc.nextInt();
		System.out.println("Digite o valor da pe�a: ");
		valorpeca2 = sc.nextDouble();
		
		totalpecas = valorpeca1 * qtd1 + valorpeca2 * qtd2;
		System.out.printf("Valor a ser pago: %.2f%n ", totalpecas);
		
		
		
		
		
		sc.close();
		
	}

}
