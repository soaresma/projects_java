package br.soaressolutions.ocpj.oop;

import br.soaressolutions.ocpj.model.Cliente;

class TesteConstrutores {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		Cliente c2 = new Cliente("Maria", 284255683, "260.253.698-56");
	}
	
}