package br.soaressolutions.ocpj.orientationobjects;

public class Frog {
	
	static int frogCount = 0;
	
	Frog() {
		//One Constructor can just access only members static
		//of class, why you access methods or variable instance
		//last be Constructor run
		frogCount += 1;
	}
		
	public static void main(String[] args) {
		new Frog();
		new Frog();
		new Frog();
		System.out.println("Frog is " + frogCount);
	}
		
	
}