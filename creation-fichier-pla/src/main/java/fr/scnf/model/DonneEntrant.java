package fr.scnf.model;

import java.io.Serializable;

public class DonneEntrant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private String identifiant;
	private String codeDivision;
	private String montantBeneficiciaire;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getCodeDivision() {
		return codeDivision;
	}

	public void setCodeDivision(String codeDivision) {
		this.codeDivision = codeDivision;
	}

	public String getMontantBeneficiciaire() {
		return montantBeneficiciaire;
	}

	public void setMontantBeneficiciaire(String montantBeneficiciaire) {
		this.montantBeneficiciaire = montantBeneficiciaire;
	}

}
