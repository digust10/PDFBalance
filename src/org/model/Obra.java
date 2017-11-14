package org.model;

public class Obra {
	int id;
	String custos;
	String name;

	public Obra(int id, String custos, String name) {
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
	public String getCustos() {
		return custos;
	}
	public void setCustos(String colunas) {
		this.custos = colunas;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
