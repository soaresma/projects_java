package br.soaressolutions.ocpj.declarationsandaccesscontrol;

public class PrivateBank extends Bank {

	public static void main(String[] args) {
		//Isso causa a impressão de que só porque PrivateBank 
		// e uma subclasse de Bank, ela herda o membro, mas
		//isso causa erro de compilação porque o metodo printResult não é um método estático.
		//printResult(args[0]);
		
		new PrivateBank().messageShow(args[0]);
	}
	
	//Invocando um método default declarado na superclasse Bank.
	//Se uma classe declarada em uma package diferente da superclasse
	//Causará erro de compilação
	public void messageShow(String txt) {
		this.printResult(txt);
	}
}