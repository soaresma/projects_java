package br.soaressolutions.ocpj.declarationsandaccesscontrol;

import br.soaressolutions.ocpj.model.Custumer;
import br.soaressolutions.ocpj.model.CustumerSpecial;

public class TesteAccesAbstractClassII {
	
	public static void main(String[] args) {
			
		//Erro de compilação, porque Custumer class é uma classe abstract e 
		//não pode ser instanciada.
		/*br\soaressolutions\ocpj\declarationsandaccesscontrol\TesteAccesAbstractClassII.java:11: error: Custumer is abstract; cannot be instantiated
                Custumer custumer = new Custumer();                                    ^
				1 error*/
		//Custumer custumer = new Custumer();
		
		CustumerSpecial custumerEspecial = new CustumerSpecial();
		//CustumerClass é um subclasse de Custumer e pela definição
		//de herança, CustumerClass herda os membros da classe Custumer
		custumerEspecial.setName("David Bowie");
		custumerEspecial.setCpf("56456464687987");
		
		System.out.println("Nome: " + custumerEspecial.getName());
		System.out.println("Cpf: " + custumerEspecial.getCpf());
		
		//Invocando através da variavel de tipo reference CustumerSpecial custumerEspecial
		//o método implementado na mesma, passando como argumento um literal de ponto flutuando
		//do tipo primitivo double
		custumerEspecial.calcularPontosCliente(150d);
		
		
		
		
	}
	
	
	
}