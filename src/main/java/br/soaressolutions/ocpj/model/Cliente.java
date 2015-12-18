package br.soaressolutions.ocpj.model;

public class Cliente {

	private String nome;
	private int rg;
	private String cpf;
	
	public Cliente() {
		System.out.println("Passou pelo construtor sem parametros");			
	}
	
	public Cliente(String nome, int rg, String cpf) {
		this(rg,cpf);
		this.nome = nome;
		System.out.println("Passou pelo construtor com parametros");			
	}
	
	public Cliente(int rg, String cpf) {
		System.out.println("Passou pelo construtor sobrecarregado parametros");			
		this.rg = rg;
		this.cpf = cpf;
	}
	
	{
		
		System.out.println("Passou pelo bloco de inicializacao");			
		
	}
	
	static {
	
		System.out.println("Passou pelo bloco estático");
		
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getRg() {
		return rg;
	}
	
	public void setRg(int rg) {
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}