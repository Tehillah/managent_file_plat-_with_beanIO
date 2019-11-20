package fr.scnf.model;

public class ModePaiement {

	private String refEnregistrementModePaiement;
	private String modePaiement;
	private String typeReglement;
	private String libelleModePaiementParTypeReglement;
	private String nombreTotalReglements;
	private String montantTotalReglements;

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
