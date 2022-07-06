import java.util.Locale;
import java.util.Scanner;

public class exercicio3prod {
// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite Product 1: ");
		int prod1 = sc.nextInt();
		System.out.println("Digite Product 2: ");
		int prod2 = sc.nextInt();
		System.out.println("Digite Product 3: ");
		int prod3 = sc.nextInt();
		System.out.println("Digite Product 4: ");
		int prod4 = sc.nextInt();
		
		int diferenca = prod1*prod2 - prod3*prod4;
		
		System.out.println("A diferença entre produtos: " + diferenca);
		
sc.close();
	}

}
