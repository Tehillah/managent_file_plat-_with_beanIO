package fr.scnf.model;

public class ArticleFinBAPRF {

	private String identifiant;
	
	private String refEnregistrementArticleFinBAPRF;
	private String identifiantBAPRF;
	private String nombreReglements;
	private String montantReglements;

	
	
	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getRefEnregistrementArticleFinBAPRF() {
		return refEnregistrementArticleFinBAPRF;
	}

	public void setRefEnregistrementArticleFinBAPRF(String refEnregistrementArticleFinBAPRF) {
		this.refEnregistrementArticleFinBAPRF = refEnregistrementArticleFinBAPRF;
	}

	public String getIdentifiantBAPRF() {
		return identifiantBAPRF;
	}

	public void setIdentifiantBAPRF(String identifiantBAPRF) {
		this.identifiantBAPRF = identifiantBAPRF;
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
