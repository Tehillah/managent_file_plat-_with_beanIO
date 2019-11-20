package fr.scnf.model;

public class FluxDeReglement {

	private String identifiant;
	private String refEnregistrementReglement;
	private String identifiantFluxReglement;
	private String numeroFichier;
	private String nombreTotalReglements;
	private String montantTotalReglements;
	
	public String getRefEnregistrementReglement() {
		return refEnregistrementReglement;
	}
	
	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
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
