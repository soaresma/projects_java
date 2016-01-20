package br.soaressolutions.ocpj.orientationobjects;

//import java.io.Exception;
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
	
	public void  doSphericalThing() throws Exception {
		System.out.println("Invoke method Spherical interface's");
	}
	//ERROR. An interface don't can declare checked exception other than
	//those declared by interface method, or subclasses of those declared
	//by the interface method
	// public void  doSphericalThing() throws IOException {
		// System.out.println("Invoke method Spherical interface's");
	// }
	
	
	
}