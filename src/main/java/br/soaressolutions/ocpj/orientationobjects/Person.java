package br.soaressolutions.ocpj.orientationobjects;

//Summary - Encapsulation
//Um bom encapsulamento é implementado: com variáveis de instância private e métodos
//public getter e setter.
//A good encapsulation is implemented: with instance variables private and
//public methods getter ands setter.
public class Person {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void calculateJobTime(int year, int admissionYear) {
		year -= admissionYear;
		System.out.println("Job Time = " + year);
	}

}