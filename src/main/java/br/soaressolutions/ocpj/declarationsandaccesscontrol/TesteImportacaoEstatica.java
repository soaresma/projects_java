/** 
*	Importando membros estáticos (static members) com import static 
*
*	Esse recurso as vezes é necessário para facilitar a importação de membros static 
*	a serem utilizados pelos membros de uma classe e também a leitura do código.
*
* 	Regras para se utilizarem import static:
*
*	1) Você deve declarar importa static e não static import. Ao contrário da declaração
*	do método main() onde se pode declarar com qualquer combinação (static public void main(String[] args){} ou public static void main(String[] args){})
*	ao se utilizar a declaração import static, irá gerar um erro de compilação.
*
*	2) Cuidado para ambiguidade de membros static na classe. Por exemplo, a classe java.lang.Integer e java.util.Long, ambas possuem o campo MAX_VALUE.
*	Caso não especifique de qual classe esteja importando, a JVM em tempo de execução não irá advinhar para você, gerando um erro em tempo de execução.
*
*	3) Você pode fazer um import static na referência static do objeto, constantes (lembrando que elas são static e final) e métodos static.
*
*	É possivel também fazer um import static implicitamente. Por exemplo, quando declaramos o seguinte comando System.out.println(), estamos invocando no objeto
*	System a propriedade PrintStream out para exibir uma mensagem na console.
*
*	Erros comuns:
*
*	1) fazer o import de um membro static declarando static import.
*
*	2) fazendo uma importação de um membro static declarando import static java.lang.Integer sem utilizar o wildcard *
*
*/

package br.soaressolutions.ocpj.declarationsandaccesscontrol;

import static java.lang.Math.*;
import static java.lang.String.*;
import static br.soaressolutions.ocpj.model.Person.*;

class TesteImportacaoEstatica {
	
	public static void main(String[] args) {
		
		//Invocando a propriedade PI da classe Math
		System.out.println("PI = " + PI);
		//Convertendo um número binário em um objeto String utilizando o método estático valueOf()
		System.out.println("0b01001100_0100 = " + valueOf(0b01001100_0100));
		//Invocando um método estático nanoTime() implicitamente da classe System
		//pois a mesma não precisa ser importada pois o pacote java.lang faz parte
		//do pacote fundamental da linguagem
		System.out.println(System.nanoTime());
		//Invocando as constantes da classe Pessoa.
		System.out.println("Altura = " + WEIGHT);
		System.out.println("Peso = " + HEIGTH);
		
		
	
	}
	
}