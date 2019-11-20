package fr.scnf.model;

public class ArticleDetail {

	private String entite;
	private String identifiant;
	private String refEnregistrementReglement;
	private String identifiantFluxReglement;
	private String numeroFichier;

	private String refEnregistrementModePaiement;
	private String modePaiement;
	private String typeReglement;
	private String libelleModePaiementParTypeReglement;

	private String nombreTotalReglements;
	private String montantTotalReglements;

	public String getEntite() {
		return entite;
	}

	public void setEntite(String entite) {
		this.entite = entite;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getRefEnregistrementReglement() {
		return refEnregistrementReglement;
	}

	public void setRefEnregistrementReglement(String refEnregistrementReglement) {
		this.refEnregistrementReglement = refEnregistrementReglement;
	}

	public String getIdentifiantFluxReglement() {
		return identifiantFluxReglement;
	}

	public void setIdentifiantFluxReglement(String identifiantFluxReglement) {
		this.identifiantFluxReglement = identifiantFluxReglement;
	}

	public String getNumeroFichier() {
		return numeroFichier;
	}

	public void setNumeroFichier(String numeroFichier) {
		this.numeroFichier = numeroFichier;
	}

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

	public String getTypeReglement() {
		return typeReglement;
	}

	public void setTypeReglement(String typeReglement) {
		this.typeReglement = typeReglement;
	}

	public String getLibelleModePaiementParTypeReglement() {
		return libelleModePaiementParTypeReglement;
	}

	public void setLibelleModePaiementParTypeReglement(String libelleModePaiementParTypeReglement) {
		this.libelleModePaiementParTypeReglement = libelleModePaiementParTypeReglement;
	}

	public String getNombreTotalReglements() {
		return nombreTotalReglements;
	}

	public void setNombreTotalReglements(String nombreTotalReglements) {
		this.nombreTotalReglements = nombreTotalReglements;
	}

	public String getMontantTotalReglements() {
		return montantTotalReglements;
	}

	public void setMontantTotalReglements(String montantTotalReglements) {
		this.montantTotalReglements = montantTotalReglements;
	}

}
