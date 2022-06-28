import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		byte age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
		
		
		}
	
	
	
	

}

/*System.out.println("Olá, Mundo!");
double x = 12.234455;
String nome = "Maria";
int idade = 31;
double renda = 4000.0;
		

System.out.printf("%.2f%n", x);
System.out.printf("%.4f%n", x);
Locale.setDefault(Locale.US);
System.out.printf("%.4f%n", x);
System.out.println("Resultado = " + x + " Metros");
System.out.printf("Resultado = %.2f Metros%n", x);
System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);*/

/*double b, B, h, area;
b = 6.0;
B = 8.0;
h = 5.0;

area = (b + B) / 2.0 * h ;
System.out.println(area);*/
