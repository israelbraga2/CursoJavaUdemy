import java.util.Locale;
import java.util.Scanner;

public class exercicio1SenhaInvalida {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");	
		
		int senha = sc.nextInt();
		
		 while(senha != 2002){
			 
			 System.out.println("Senha inv�lida, tente novamente.");
			 senha = sc.nextInt();
		 }
		
		System.out.println("Acesso permitido.");
		
		sc.close();

	}

}
