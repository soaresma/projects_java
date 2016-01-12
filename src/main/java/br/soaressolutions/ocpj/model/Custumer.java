package br.soaressolutions.ocpj.model;

public abstract class Custumer {

	private String name;
	private String cpf;
	
	public abstract void calcularPontosCliente(double valor);
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	

}