package fr.scnf.model;

public class FichierPaiementBAPRF {

	private String identifiant;

	private String refEnregistrementFichierPaiement;
	private String identifiantFichierPaiement;
	private String referenceFichierPaiement;
	private String nombreReglements;
	private String montantReglements;

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getRefEnregistrementFichierPaiement() {
		return refEnregistrementFichierPaiement;
	}

	public void setRefEnregistrementFichierPaiement(String refEnregistrementFichierPaiement) {
		this.refEnregistrementFichierPaiement = refEnregistrementFichierPaiement;
	}

	public String getIdentifiantFichierPaiement() {
		return identifiantFichierPaiement;
	}

	public void setIdentifiantFichierPaiement(String identifiantFichierPaiement) {
		this.identifiantFichierPaiement = identifiantFichierPaiement;
	}

	public String getReferenceFichierPaiement() {
		return referenceFichierPaiement;
	}

	public void setReferenceFichierPaiement(String referenceFichierPaiement) {
		this.referenceFichierPaiement = referenceFichierPaiement;
	}

	public String getNombreReglements() {
		return nombreReglements;
	}

	public void setNombreReglements(String nombreReglements) {
		this.nombreReglements = nombreReglements;
	}

	public String getMontantReglements() {
		return montantReglements;
	}

	public void setMontantReglements(String montantReglements) {
		this.montantReglements = montantReglements;
	}

}
