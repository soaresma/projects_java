package br.soaressolutions.ocpj.orientationobjects;

//An interface, can extends one or more interfaces
public class TestBall {
	
	public static void main(String[] args) {
		
		Ball ball = new Ball();
		ball.bounce();
		ball.setBounceFactor(12);
		ball.moveIt();
		ball.doSphericalThing();
		
		//Test CAST object's
		//You can use a reference variable type of interface to instance of class that
		//implements in the interface and use Cast object's to in runtime, the JVM call
		//the version overriden in implementation class.
		System.out.println("------------ Test CAST ---------------");
		Spherical sph = ball;
		sph.doSphericalThing();
		
		Bounceable bounce = new Ball();
		bounce.bounce();
	}
	
	
	
}