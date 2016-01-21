package br.soaressolutions.ocpj.orientationobjects;

public class Init {
	
	Init(int x) {
		System.out.println("1 - args constructor");
	}
	
	Init() {
		System.out.println("no-args constructor");
		
	}
	
	//1st - Static init block run once, when is a loader class
	static {
		System.out.println("1st - static initialization block");	
	}
	//Call after to super() Object's class, and after run, this is
	//instance init block is run first.
	{
		System.out.println("1st - instance initialization block");	
	}
	
	//Call after to super() Object's class, and after run, this is
	//instance init block is run. And still, how been on line 37 is
	//call contructor Init's with param, instance init block again is
	//run.
	{
		System.out.println("2st - instance initialization block");	
	}
	//2nd - Static init block run once, when is a loader class
	static {
		System.out.println("2nd - static initialization block");	
	}
	
	public static void main(String[] args) {
		new Init();
		new Init(7);
	}
		
	
}