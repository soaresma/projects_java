package br.soaressolutions.ocpj.declarationsandaccesscontrol;

import br.soaressolutions.ocpj.model.Parent;
import br.soaressolutions.ocpj.declarationsandaccesscontrol.access.ChildII;

public class Child extends Parent {

	static public void main(String...args) {
			Parent p = new Parent();
			//Tentando acessar as variaveis de instância da superclasse Parent
			//através de sua referência com o operador (.)
			//Isso causa erro de compilação porque este membro só pode ser acessado 
			//por herança, e neste caso, este membro para uma classe de fora do pacote
			//pode ser considerado default ou ate mesmo private
			/*p.name = "Jack";
			p.desc = "Manager";
			
			System.out.println("Name: " + p.name);*/
			
			Child child = new Child();
			System.out.println(child);
			
			child.name = "John Walker";
			child.desc = "Manager";
			
			System.out.println("Name: " + child.name);
			System.out.println("Desc: " + child.desc);
			
			String name = "Paul Simon";
			String desc = "Director IT";
			
			
			
			child.imprimeDados(name, desc);
			
			ChildII c2 = new ChildII();
			c2.imprimeDadosChildII(name); 
			
	}
	
	public void imprimeDados(String name, String desc) {
				
			System.out.println("Name: " + (this.name = name));
			System.out.println("Desc: " + (this.desc = desc));
	}
}