package fr.scnf.model;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;

public class CreanceDebiteur {
	private String refEnregistrement;
	private String refDeLaCreance;
	private String refDuCreance;
	private String libelleCreance;
	private String libelleDetailCreance;
	private int montantDetailCreance;
	private String numeroDebiteur;
	private String nomDebiteur;

	public CreanceDebiteur(String refEnregistrement) {
		super();
		this.refEnregistrement = refEnregistrement;
		this.refDeLaCreance = RandomStringUtils.randomAlphanumeric(30);
		this.refDuCreance = RandomStringUtils.randomAlphanumeric(35);
		this.libelleCreance = RandomStringUtils.randomAlphanumeric(60);
		this.libelleDetailCreance = RandomStringUtils.randomAlphanumeric(60);
		this.montantDetailCreance = RandomUtils.nextInt(14);
		this.numeroDebiteur = RandomStringUtils.randomAlphanumeric(10);
		this.nomDebiteur = RandomStringUtils.randomAlphanumeric(40);
	}

	public String getRefEnregistrement() {
		return refEnregistrement;
	}

	public void setRefEnregistrement(String refEnregistrement) {
		this.refEnregistrement = refEnregistrement;
	}

	public String getRefDeLaCreance() {
		return refDeLaCreance;
	}

	public void setRefDeLaCreance(String refDeLaCreance) {
		this.refDeLaCreance = refDeLaCreance;
	}

	public String getRefDuCreance() {
		return refDuCreance;
	}

	public void setRefDuCreance(String refDuCreance) {
		this.refDuCreance = refDuCreance;
	}

	public String getLibelleCreance() {
		return libelleCreance;
	}

	public void setLibelleCreance(String libelleCreance) {
		this.libelleCreance = libelleCreance;
	}

	public String getLibelleDetailCreance() {
		return libelleDetailCreance;
	}

	public void setLibelleDetailCreance(String libelleDetailCreance) {
		this.libelleDetailCreance = libelleDetailCreance;
	}

	public int getMontantDetailCreance() {
		return montantDetailCreance;
	}

	public void setMontantDetailCreance(int montantDetailCreance) {
		this.montantDetailCreance = montantDetailCreance;
	}

	public String getNumeroDebiteur() {
		return numeroDebiteur;
	}

	public void setNumeroDebiteur(String numeroDebiteur) {
		this.numeroDebiteur = numeroDebiteur;
	}

	public String getNomDebiteur() {
		return nomDebiteur;
	}

	public void setNomDebiteur(String nomDebiteur) {
		this.nomDebiteur = nomDebiteur;
	}
}
