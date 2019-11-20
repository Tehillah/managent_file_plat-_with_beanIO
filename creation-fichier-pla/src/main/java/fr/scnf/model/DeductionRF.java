package fr.scnf.model;

public class DeductionRF {

	private String refEnregistrementDeduction;
	private String numeroDeductionFournisseur;
	private String codeTypeReglementDeduction;
	private String dateDeduction;
	private String montantDeductionEuro;

	public String getRefEnregistrementDeduction() {
		return refEnregistrementDeduction;
	}

	public void setRefEnregistrementDeduction(String refEnregistrementDeduction) {
		this.refEnregistrementDeduction = refEnregistrementDeduction;
	}

	public String getNumeroDeductionFournisseur() {
		return numeroDeductionFournisseur;
	}

	public void setNumeroDeductionFournisseur(String numeroDeductionFournisseur) {
		this.numeroDeductionFournisseur = numeroDeductionFournisseur;
	}

	public String getCodeTypeReglementDeduction() {
		return codeTypeReglementDeduction;
	}

	public void setCodeTypeReglementDeduction(String codeTypeReglementDeduction) {
		this.codeTypeReglementDeduction = codeTypeReglementDeduction;
	}

	public String getDateDeduction() {
		return dateDeduction;
	}

	public void setDateDeduction(String dateDeduction) {
		this.dateDeduction = dateDeduction;
	}

	public String getMontantDeductionEuro() {
		return montantDeductionEuro;
	}

	public void setMontantDeductionEuro(String montantDeductionEuro) {
		this.montantDeductionEuro = montantDeductionEuro;
	}

}
