import java.util.Scanner;

public class exercicio1soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número para soma: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo número para soma: ");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		System.out.println("A soma dos dois valores foi igual a : " + soma);
		
sc.close();
	}

}
