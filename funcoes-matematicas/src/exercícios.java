import java.util.Locale;
import java.util.Scanner;

//exerc�cio: Estrutura sequencial.
//( entrada de dados, processamento de dados e sa�da de dados)

public class exerc�cios {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura: ");
		double largura = sc.nextDouble();
		System.out.println("Digite o comprimento: ");
		double comprimento = sc.nextDouble();
		System.out.println("Digite o metro quadrado: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("�REA = %.2f %n ", area);
		System.out.printf("PRE�O = %.2f %n ", preco);
		
sc.close();
	}

}
