package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalInValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		/*this é para acessar o atributo da classe e nao o parametro da função*/
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " Units, Total: $"
				+ String.format("%.2f", totalInValueInStock());
	}
}
