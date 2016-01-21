package br.soaressolutions.ocpj.orientationobjects;

public class InitError {
	
	static int[] x = new int[4];
	//Stati init blocks, throw a ExceptionInInitializeError. Don't forget, ever, ever, never.
	static {
		x[4] = 5;
	}
	
	public static void main(String[] args) {
		
	}
		
	
}