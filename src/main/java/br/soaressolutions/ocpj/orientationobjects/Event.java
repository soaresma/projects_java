package br.soaressolutions.ocpj.orientationobjects;


public abstract class Event {
	
	protected String name;
	protected String local;
	
	private int amount;
	
	public abstract calculateAmoutEventByMonth();
	
	public int amountPersonByEvent() {
		return this.amount++;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void calculateCostEvent(double value) {
		double percent = value * 0.16;
		double cost = value + percent;
		System.out.println("Cost = " + cost);
	}

}