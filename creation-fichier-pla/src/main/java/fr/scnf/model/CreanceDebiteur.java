package fr.scnf.model;

public class CreanceDebiteur {
	private String refEnregistrementCreanceDebiteur;
	private String refCreance;
	private String refCreancier;
	private String libelleCreance;
	private String libelleDetailCreance;
	private String montantDetailCreance;
	private String numeroDebiteur;
	private String nomDebiteur;

	public CreanceDebiteur() {
		super();

	}

	public String getRefEnregistrementCreanceDebiteur() {
		return refEnregistrementCreanceDebiteur;
	}

	public void setRefEnregistrementCreanceDebiteur(String refEnregistrementCreanceDebiteur) {
		this.refEnregistrementCreanceDebiteur = refEnregistrementCreanceDebiteur;
	}

	public String getRefCreance() {
		return refCreance;
	}

	public void setRefCreance(String refCreance) {
		this.refCreance = refCreance;
	}

	public String getRefCreancier() {
		return refCreancier;
	}

	public void setRefCreancier(String refCreancier) {
		this.refCreancier = refCreancier;
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

	public String getMontantDetailCreance() {
		return montantDetailCreance;
	}

	public void setMontantDetailCreance(String montantDetailCreance) {
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
