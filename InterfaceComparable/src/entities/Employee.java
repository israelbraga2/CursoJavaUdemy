package entities;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	//metodo serve para comparar
	@Override
	public int compareTo(Employee other) {
		//vamos ordenar a lista por nome
		return name.compareTo(other.getName());
	}
	
	
}
