package fr.scnf.model;

import java.util.List;

import org.apache.commons.lang.RandomStringUtils;

public class Facture {
	private String refEnregistrement;
	private String numeroCommande;
	private String numeroFactureFournisseur;
	private String typeFacture;
	private String dateFacture;
	private String montantFactureEuro;
	private List<Deduction> deductions;

	public Facture(String refEnregistrement) {
		super();
		this.refEnregistrement = refEnregistrement;
		this.numeroCommande = RandomStringUtils.randomAlphanumeric(15);

		this.numeroFactureFournisseur = RandomStringUtils.randomAlphanumeric(15);

		this.typeFacture = RandomStringUtils.randomAlphanumeric(1);

		this.dateFacture = RandomStringUtils.randomAlphanumeric(10);

		this.montantFactureEuro = RandomStringUtils.randomAlphanumeric(14);

	}

	public String getRefEnregistrement() {
		return refEnregistrement;
	}

	public void setRefEnregistrement(String refEnregistrement) {
		this.refEnregistrement = refEnregistrement;
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

	public List<Deduction> getDeductions() {
		return deductions;
	}

	public void setDeductions(List<Deduction> deductions) {
		this.deductions = deductions;
	}
}
