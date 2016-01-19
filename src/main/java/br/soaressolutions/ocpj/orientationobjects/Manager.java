package br.soaressolutions.ocpj.orientationobjects;

public class Manager extends Employed {

	public void calculateSalary(double salary) {
		System.out.println("Calculated salary in subClass Manager");
	}
	
	public void calculateSalary(double salary, String name) {
		System.out.println(name + " to receive amount of US$ " + salary);
	}
	
}