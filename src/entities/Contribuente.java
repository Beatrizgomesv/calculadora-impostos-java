package entities;

public abstract class Contribuente {
	private String nome;
	private Double rendimentoAnual;
	
	public Contribuente(){
	}
	
	public Contribuente(String nome, double rendimentoAnual) {
	this.nome = nome;
	this.rendimentoAnual = rendimentoAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendimentoAnual() {
		return rendimentoAnual;
	}

	public void setRendimentoAnual(double rendimentoAnual) {
		this.rendimentoAnual = rendimentoAnual;
	}
	public abstract double taxa(); 

	}


