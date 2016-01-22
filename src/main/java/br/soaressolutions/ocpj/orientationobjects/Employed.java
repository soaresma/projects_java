package br.soaressolutions.ocpj.orientationobjects;

public class Employed {

	public void calculateSalary(double salary) {
		System.out.println("Calculated salary in super class Employed");
		double reajust  = salary * 0.12_132131;
		salary += reajust;
		System.out.println("New Salary = " + salary);
	}
	
}