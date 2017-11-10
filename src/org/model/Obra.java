package org.model;

public class Obra {
	int id;
	double custos;
	String name;

	public Obra(int id, double custos, String name) {
		super();
		this.id = id;
		this.custos = custos;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCustos() {
		return custos;
	}
	public void setCustos(double custos) {
		this.custos = custos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
