package fr.scnf.model;

public class Facture {
	private String refEnregistrementFacture;
	private String numeroCommande;
	private String numeroFactureFournisseur;
	private String typeFacture;
	private String dateFacture;
	private String montantFactureEuro;


	public Facture() {
		super();
			}

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

	public String getTypeFacture() {
		return typeFacture;
	}

	public void setTypeFacture(String typeFacture) {
		this.typeFacture = typeFacture;
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
