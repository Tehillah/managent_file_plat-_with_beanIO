package fr.scnf.model;

public class ArticleFinRF {

	private String identifiant;
	private String refEnregistrementArticleFin;
	private String identifiantRF;
	private String nombreReglements;
	private String sommeReglements;

	public String getRefEnregistrementArticleFin() {
		return refEnregistrementArticleFin;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public void setRefEnregistrementArticleFin(String refEnregistrementArticleFin) {
		this.refEnregistrementArticleFin = refEnregistrementArticleFin;
	}

	public String getIdentifiantRF() {
		return identifiantRF;
	}

	public void setIdentifiantRF(String identifiantRF) {
		this.identifiantRF = identifiantRF;
	}

	public String getNombreReglements() {
		return nombreReglements;
	}

	public void setNombreReglements(String nombreReglements) {
		this.nombreReglements = nombreReglements;
	}

	public String getSommeReglements() {
		return sommeReglements;
	}

	public void setSommeReglements(String sommeReglements) {
		this.sommeReglements = sommeReglements;
	}

}
