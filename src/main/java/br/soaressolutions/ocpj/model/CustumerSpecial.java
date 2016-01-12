package br.soaressolutions.ocpj.model;

public class CustumerSpecial extends Custumer {

	public void calcularPontosCliente(double valor) {
		int pontos = (int) valor / 10;
		System.out.println("Pontos acumulados: " + pontos);
	}
	
	
	
	

}