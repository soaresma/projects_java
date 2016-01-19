package br.soaressolutions.ocpj.orientationobjects;

//import java.sql.SQLException;
public class TestAnimals {

	public static void main(String[] args) {
		Animal a  = new Animal(); //refence of type Animal to a Animal instance.
		Animal b = new Horse(); //refence of type Animal to a Horse instance. It's ok, Horse "IS-A" Animal.
		
		try {
			a.eat();
		} catch(Exception e) {
			e.printStackTrace();
		}
		 // Invoke the version declared in Animal
		// In runtime, the JVM look to instance, see that overriden eat() methos of superclass Animal
		// and calling the version declared in Horse.
		
		try {
			b.eat();
		} catch(Exception e) {
			e.printStackTrace();
		}
		 
		//Here ocurred error. The Animal superclass don't declared buck() method, therefore, a error
		//compilation is show in console.
		//b.buck(); 
	}
	

}