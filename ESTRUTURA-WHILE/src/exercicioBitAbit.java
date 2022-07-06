import java.util.Scanner;

public class exercicioBitAbit {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o primeiro numero para conversão BIT a BIT: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo numero para conversão BIT a BIT: ");
		int n2 = sc.nextInt();
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
				sc.close();

	}

}
