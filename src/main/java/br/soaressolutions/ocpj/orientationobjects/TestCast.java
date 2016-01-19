package br.soaressolutions.ocpj.orientationobjects;

public class TestCast {

	public static void main(String[] args) {
		
		Employed emp = new Employed();
		emp.calculateSalary(500.0); //Invoke the version declared in superclass Employed
		
		Manager manag = new Manager();
		manag.calculateSalary(1000.0); //Invoke the version declared in subclass Manager
		
		Employed empII = new Manager();
		//In runtime, the JVM looks to instance objects, see that overridden method calculateSalary(double d) of superclass and invoke
		//still the version overridden on the subclass Manager.
		empII.calculateSalary(100d); 
		
		//CAST Objects
		System.out.println("-------- TEST CASTING OBJECTS ----------");
		//UPCASTING
		emp = manag;		
		emp.calculateSalary(100d);
		//DOWNCAST
		manag = (Manager) emp;
		manag.calculateSalary(100d, "Marcelo");
		
		Employed empIII = new Employed();
		
		//ERROR in runtime. Here the compilation work because reference Manager class to a object Employed pass on test instanceof
		//Therefore, Manager IS-A Employed. Just in runtime, the JVM know that instance is Employed class and can't do downcast to
		//Manager why in runtime, no safely talk that "Manager can make everthing that a Employed can make", otherwise, is true.
		Manager managII = (Manager) empIII;
		managII.calculateSalary(100d);
		
	}
	
}