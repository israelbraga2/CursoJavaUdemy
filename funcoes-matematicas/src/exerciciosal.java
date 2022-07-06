import java.util.Locale;
import java.util.Scanner;

public class exerciciosal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salnc=0, salconc=0, calcdiferenca, difporcentagem;
		
		
		System.out.println("Digite o salário nova casa:");
		salnc = sc.nextFloat();
		
		System.out.println("Digite o salário da concorrente:");
		salconc = sc.nextDouble();
		
		calcdiferenca = salnc / salconc -1;
		difporcentagem = calcdiferenca *100;
		
		System.out.printf("A diferença de salário em porcentagem é: %.2f%n ", difporcentagem, "%");
		
			
		
		sc.close();


	}

}
