package br.soaressolutions.ocpj.declarationsandaccesscontrol.access;

import br.soaressolutions.ocpj.declarationsandaccesscontrol.Child;

public class ChildII {

	public void imprimeDadosChildII(String str) {
		//Ao tentar acessar um membro da classe Child herdado de Parent, em um método de uma 
		//classe declarada em um pacote diferente, este membro declarado na superclasse Parent
		//neste caso tem visibilidade private gerando erro de compilação.
		Child c = new Child();
		c.nome = str;
		System.out.println("Mensagem de ChildII: " + c.nome);
	}
}