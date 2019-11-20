package fr.scnf.model;

public class ModePaiementBAPRF {

	private String refEnregistrementModePaiement;
	private String modePaiement;
	private String libelleModePaiement;
	private String nombreReglementsModePaiement;
	private String montantReglementsModePaiement;
	private String identifiant;

	public String getRefEnregistrementModePaiement() {
		return refEnregistrementModePaiement;
	}

	public void setRefEnregistrementModePaiement(String refEnregistrementModePaiement) {
		this.refEnregistrementModePaiement = refEnregistrementModePaiement;
	}

	public String getModePaiement() {
		return modePaiement;
	}

	public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
	}

	public String getLibelleModePaiement() {
		return libelleModePaiement;
	}

	public void setLibelleModePaiement(String libelleModePaiement) {
		this.libelleModePaiement = libelleModePaiement;
	}

	public String getNombreReglementsModePaiement() {
		return nombreReglementsModePaiement;
	}

	public void setNombreReglementsModePaiement(String nombreReglementsModePaiement) {
		this.nombreReglementsModePaiement = nombreReglementsModePaiement;
	}

	public String getMontantReglementsModePaiement() {
		return montantReglementsModePaiement;
	}

	public void setMontantReglementsModePaiement(String montantReglementsModePaiement) {
		this.montantReglementsModePaiement = montantReglementsModePaiement;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

}
