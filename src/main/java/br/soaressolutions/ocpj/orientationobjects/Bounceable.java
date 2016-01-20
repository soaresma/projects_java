package br.soaressolutions.ocpj.orientationobjects;

//An interface, can extends one or more interfaces
public interface Bounceable extends Moveable, Spherical {
	
	//A method's interface are implicitly public abstract
	//How a interface is implicitly abstract, follow all
	//rules of abstract class.
	void bounce();
	void setBounceFactor(int bf);
}