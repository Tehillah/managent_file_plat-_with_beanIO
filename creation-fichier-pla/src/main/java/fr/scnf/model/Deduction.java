package fr.scnf.model;

public class Deduction {
	private String refEnregistrementDeduction;
	private String numeroDeduction;
	private String typeDeduction;
	private String dateDeduction;
	private String montantDeductionEuro;

	public Deduction() {
		super();
	}

	public String getRefEnregistrementDeduction() {
		return refEnregistrementDeduction;
	}

	public void setRefEnregistrementDeduction(String refEnregistrementDeduction) {
		this.refEnregistrementDeduction = refEnregistrementDeduction;
	}

	public String getNumeroDeduction() {
		return numeroDeduction;
	}

	public void setNumeroDeduction(String numeroDeduction) {
		this.numeroDeduction = numeroDeduction;
	}

	public String getTypeDeduction() {
		return typeDeduction;
	}

	public void setTypeDeduction(String typeDeduction) {
		this.typeDeduction = typeDeduction;
	}

	public String getMontantDeductionEuro() {
		return montantDeductionEuro;
	}

	public void setMontantDeductionEuro(String montantDeductionEuro) {
		this.montantDeductionEuro = montantDeductionEuro;
	}

	public String getDateDeduction() {
		return dateDeduction;
	}

	public void setDateDeduction(String dateDeduction) {
		this.dateDeduction = dateDeduction;
	}

}
