package fr.scnf.model;

import org.apache.commons.lang.RandomStringUtils;

public class ArticleFin {
	
	private String refEnregistrement;
	
	private String identifiant;
	
	private String nombreTotalReglement;
	
	private String montantTotalReglement;

	public ArticleFin(String refEnregistrement) {
		super();
		this.refEnregistrement = refEnregistrement;
		this.identifiant = RandomStringUtils.randomAlphanumeric(15);
		this.nombreTotalReglement = RandomStringUtils.randomAlphanumeric(10);
		this.montantTotalReglement = RandomStringUtils.randomAlphanumeric(14);
	}

	public String getRefEnregistrement() {
		return refEnregistrement;
	}

	public void setRefEnregistrement(String refEnregistrement) {
		this.refEnregistrement = refEnregistrement;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getNombreTotalReglement() {
		return nombreTotalReglement;
	}

	public void setNombreTotalReglement(String nombreTotalReglement) {
		this.nombreTotalReglement = nombreTotalReglement;
	}

	public String getMontantTotalReglement() {
		return montantTotalReglement;
	}

	public void setMontantTotalReglement(String montantTotalReglement) {
		this.montantTotalReglement = montantTotalReglement;
	}

}
