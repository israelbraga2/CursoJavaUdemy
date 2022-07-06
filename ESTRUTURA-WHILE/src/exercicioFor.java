import java.util.Scanner;

public class exercicioFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		
		for(int i = 0; i<N; i++) {
			int x = sc.nextInt(); // ler numero x
			soma = soma + x; // adicinar numero x na soma
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
