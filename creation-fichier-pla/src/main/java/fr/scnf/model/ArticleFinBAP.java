package fr.scnf.model;

public class ArticleFinBAP {

	private String refEnregistrementArticleFin;
	private String identifiant;
	private String nombreTotalReglements;
	private String montantTotalReglements;
	
	public String getRefEnregistrementArticleFin() {
		return refEnregistrementArticleFin;
	}
	
	public void setRefEnregistrementArticleFin(String refEnregistrementArticleFin) {
		this.refEnregistrementArticleFin = refEnregistrementArticleFin;
	}
	
	public String getIdentifiant() {
		return identifiant;
	}
	
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
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
