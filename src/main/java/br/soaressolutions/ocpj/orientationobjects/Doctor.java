package br.soaressolutions.ocpj.orientationobjects;

//Summary - IS-A and HAS-A
//IS-AS is implemented using inheritance either interface implementation
//"É-UM" é implementado usando herança ou implementação de interfaces
public class Doctor extends Person {
	
	//HAS-A is implemented by using instance variables that refer to other objects.
	//"TEM-UM" é implementado pelo uso de variáveis de instância que se referem
	//a outros objetos.
	private Employed emp;
	
	//static variable int doctorCount 
	static int doctorCount = 0;
	//static init block will first run block to class loader
	//in JVM
	static {
		System.out.println("1st - static init block");
		/* doctorCount++;
		System.out.println(doctorCount); */
		
	}
	//instance init block will after run that to tha call
	//super of superconstructor
	{
		System.out.println("2nd - instance init block is run after the super() of the superclass went run");
		emp = new Employed();
		doctorCount++;
		System.out.println(doctorCount);
		
	}
	
	public Employed getEmp() {
		return emp;
	}
	
	public void setEmployed(Employed emp) {
		this.emp = emp;
	}
	
	//This method run to code make to call to calculateSalary() on the
	//reference emp to the Employed's object class, hidding details to
	//implementation of callers Doctor class.
	public void calculateSalary(double sal) {
		this.emp.calculateSalary(sal);
	}

}