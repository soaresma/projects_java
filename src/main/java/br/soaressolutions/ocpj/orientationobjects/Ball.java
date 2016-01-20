package br.soaressolutions.ocpj.orientationobjects;

//An interface, can extends one or more interfaces
public class Ball implements Bounceable {
	
	//A method's interface are implicitly public abstract
	public void bounce(){
		System.out.println("Invoke method implemented of Bounceable");
	}
	public void setBounceFactor(int bf) {
		System.out.println("Invoke method implemented of Bounceable");
	}
	
	public void  moveIt() {
		System.out.println("Invoke method Moveable interface's");
	}
	
	public void  doSphericalThing() {
		System.out.println("Invoke method Spherical interface's");
	}
	
	
	
}