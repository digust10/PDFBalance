package org.model;

public class Obra {
	int id;
	Double custos;
	String name;

	public Obra(int id, Double custos, String name) {
		super();
		this.id = id;
		this.custos = custos;
		this.name = name;
	}
	public Obra() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getCustos() {
		return custos;
	}
	public void setCustos(Double colunas) {
		this.custos = colunas;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
