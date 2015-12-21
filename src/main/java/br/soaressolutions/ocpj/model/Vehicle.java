package br.soaressolutions.ocpj.model;
/**
*
*	Abstract class
*
*	1) Está classe nunca poderá ser instaciada
*
*	2) Ao declarar uma classe não se pode combinar os modificadore final e abstract
*
*	3) Métodos em uma classe abstract não possuem implementação
*
*	4) Como o propósito da classe é ser extendida, a primeira classe concreta que 
*	extender uma abstract class deve implementar os métodos da superclasse.
*
*	5) Um só método marcado com o modificador abstract contamina toda a classe
*	e não deve ter implementação, ou seja, não deve possuir corpo ({ }).
*	
*	6) Uma abstract class pode ter métodos de instância como membros.
*
*
*	Erros comuns.
*
*	1) Anotar um método como abstract e não anotar a classe com o mesmo modificador
*	Ex:
*
*	public class A {
*		public absctract void methodA();
*	}
*
*	2) Fazer com que método marcado com abstract tenha implementação
*	Ex: public abstract void methodA() {}
*
*	3) Tentar instanciar um objeto de uma classe abstract
*	Ex: Vehicle v = new Vehicle();
**/

import java.util.Date;

public abstract class Vehicle {

	private String brand;
	private String manufacture;
	private String model;
	
	public abstract void accelerate();
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getManufacture() {
		return manufacture;
	}
	
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

}