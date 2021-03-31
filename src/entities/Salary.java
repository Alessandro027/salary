package entities;

public class Salary {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double perc) {
		grossSalary = grossSalary + ((perc / 100.0) * grossSalary);
	}
	
	public String toString() {
		return name 
		+ ", $ "
		+ String.format("%.2f", netSalary());
	}

}
