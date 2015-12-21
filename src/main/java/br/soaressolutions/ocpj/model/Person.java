package br.soaressolutions.ocpj.model;

public class Person {

	public static final double WEIGHT = 100d;
	public static final double HEIGTH = 1.90d;
	
	protected String name;
	protected String healthSecurity;
	protected Integer age;
	
	public Person(){}
	
	public Person(String name, String healthSecurity, Integer age) {
			this(healthSecurity, age);
			this.name = name;
	}
	
	private Person(String healthSecurity, Integer age) {
			this.healthSecurity = healthSecurity;
			this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHealthSecurity() {
		return healthSecurity;
	}
	
	public void setHealthSecurity(String healthSecurity) {
		this.healthSecurity = healthSecurity;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}	
	
}