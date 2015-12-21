package br.soaressolutions.ocpj.declarationsandaccesscontrol;

import br.soaressolutions.ocpj.oop.Car;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteAccesAbstractClass {
	
	public static void main(String[] args) {
		/*Aqui dará erro de compilação, porque não é permitido
		//instanciar um objeto de uma classe marcada como abstract
		Vehicle vehicle = new Vehicle();*/
		
		//Para ter acesso aos membros da superclass marcada com abstract
		//instanciamos um objeto da subclass de Vehicle
		Car car = new Car();
		Calendar cal = Calendar.getInstance();
				
		//Métodos abaixo acessados porque Car É-UM Vehicle		
		car.setBrand("BMW");
		//Como o método static formatDateToString retorna uma String
		//sua chamada é passada diretamento como parâmetro do método
		//set para definir a data de fabricação.
		car.setManufacture(formatDateToString(cal));
		car.setModel("X3");
		car.accelerate();
		
		//Exibindo as informações
		System.out.println("Brand: " + car.getBrand());
		System.out.println("Manufacture: " + car.getManufacture());
		System.out.println("Model: " + car.getModel());
		
		
	}
	//Membros estáticos só podem ser acessados por outro membro estático 
	//dentro da própria classe.
	public static String formatDateToString(Calendar cal) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = cal.getTime();
		return dateFormat.format(date);
	}
	
	
}