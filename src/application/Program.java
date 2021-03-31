package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salary;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Salary salary = new Salary();
		
		System.out.print("Name: ");
		salary.name = sc.nextLine();
		System.out.print("Gross salary: ");
		salary.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		salary.tax = sc.nextDouble();
		
		System.out.print("Employee: " + salary.name);
		System.out.printf(", $ %.2f%n", salary.netSalary());
		
		System.out.print("Which percentage to increase salary? ");
		double tax = sc.nextDouble();
		salary.increaseSalary(tax);
		
		System.out.println();
		System.out.println("Update data: " + salary);
		

		sc.close();

	}

}
