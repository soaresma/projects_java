package br.soaressolutions.ocpj.declarationsandaccesscontrol.access;



public final class TesteChildIII {
	
	public static void main(String[] args) {
		ChildIII c = new ChildIII();
		c.setNome("Joao");
		System.out.println(c.getNome());
		System.out.println(c);
		ChildIII c1 = c;		
		//c1 = c;
		c1.setNome("Paulo");
		System.out.println(c1);
		System.out.println(c1.getNome());
	}
	
}