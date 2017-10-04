package application;

public class Funcionario {
	int id, rg;
	String nome;
	
	public Funcionario(int id, int rg, String nome) {
		super();
		this.id = id;
		this.rg = rg;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
