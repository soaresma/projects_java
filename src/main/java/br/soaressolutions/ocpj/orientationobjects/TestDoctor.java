package br.soaressolutions.ocpj.orientationobjects;


public class TestDoctor {
	
	public static void main(String[] args) {
		//Invoke static variable doctorCount using dot operator (.)
		//with class Doctor name. Everthing instance of class has
		//only a copy of member static.
		System.out.println(Doctor.doctorCount);
		//All time that constructor another class is invoke, this 
		//instance init block is first invoke
		Doctor doc = new Doctor();
		new Doctor();
		new Doctor();
		doc.calculateSalary(10000D);
		
		//Aplied polymorphism - Altough a reference variable's type can't be changed
		//it can be used to refer to an objecet whose type is a subtype of its own.
		//We learned how to determine what methods are invocable for a given reference
		Person p = (Person) doc;
		p.calculateJobTime(2015, 1999);
	}

}