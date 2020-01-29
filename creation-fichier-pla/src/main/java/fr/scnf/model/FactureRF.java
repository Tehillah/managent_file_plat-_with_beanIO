package fr.scnf.model;

public class FactureRF {

	private String refEnregistrementFacture;
	private String numeroCommande;
	private String numeroFactureFournisseur;
	private String codeTypeReglementFacture;
	private String dateFacture;
	private String montantFactureEuro;

	public String getRefEnregistrementFacture() {
		return refEnregistrementFacture;
	}

	public void setRefEnregistrementFacture(String refEnregistrementFacture) {
		this.refEnregistrementFacture = refEnregistrementFacture;
	}

	public String getNumeroCommande() {
		return numeroCommande;
	}

	public void setNumeroCommande(String numeroCommande) {
		this.numeroCommande = numeroCommande;
	}

	public String getNumeroFactureFournisseur() {
		return numeroFactureFournisseur;
	}

	public void setNumeroFactureFournisseur(String numeroFactureFournisseur) {
		this.numeroFactureFournisseur = numeroFactureFournisseur;
	}

	public String getCodeTypeReglementFacture() {
		return codeTypeReglementFacture;
	}

	public void setCodeTypeReglementFacture(String codeTypeReglementFacture) {
		this.codeTypeReglementFacture = codeTypeReglementFacture;
	}

	public String getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(String dateFacture) {
		this.dateFacture = dateFacture;
	}

	public String getMontantFactureEuro() {
		return montantFactureEuro;
	}

	public void setMontantFactureEuro(String montantFactureEuro) {
		this.montantFactureEuro = montantFactureEuro;
	}

}
