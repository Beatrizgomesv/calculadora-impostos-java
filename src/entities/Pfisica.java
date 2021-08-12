package entities;

public class Pfisica extends Contribuente {
	private Double planoDeSaude;

	public Pfisica() {
	}

	public Pfisica(String nome, double rendimentoAnual, Double planoDeSaude) {
		super(nome, rendimentoAnual);
		this.planoDeSaude = planoDeSaude;
	}

	public Double getPlanoDeSaude() {
		return planoDeSaude;
	}

	public void setPlanoDeSaude(Double planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}

	@Override
	public double taxa() {
		double basicTax;
		if (getRendimentoAnual() < 20000.0) {
			basicTax = getRendimentoAnual() * 0.15;
		} else {
			basicTax = getRendimentoAnual() * 0.25;
		}
		basicTax =- getPlanoDeSaude() * 0.5;
		if (basicTax < 0.0) {
			return 0.0;
		} 
		else {
			return basicTax;
		}
	}

}
