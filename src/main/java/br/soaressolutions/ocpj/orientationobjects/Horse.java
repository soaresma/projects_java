package br.soaressolutions.ocpj.orientationobjects;

//import java.sql.SQLException;

class Horse extends Animal {

	//Version method overriden to a Animal superclass.
	/*public void eat() {
		System.out.println("Horse eating hay, oats, " + "and horse treats");
	}*/
	
	//The overriding method cannot hava more restrictive access modifier
	//than the method being overridden.
	/*
	*	br\soaressolutions\ocpj\orientationobjects\Horse.java:12: error: eat() in Horse cannot override eat() in Animal
        private void eat() {
                     ^
		attempting to assign weaker access privileges; was public
		1 error
	**/
	public void eat() throws Exception {
		System.out.println("Horse eating hay, oats, " + "and horse treats");
	}
	
	public void buck() {
		System.out.println("Calling the buck() method in a Horse instance");
	}

}