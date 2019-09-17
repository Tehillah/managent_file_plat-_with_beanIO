package fr.scnf.model;

public class ArticleFin {
	
	private String refEnregistrementArticleFin;
	private String identifiant;	
	private String nombreTotalReglement;	
	private String montantTotalReglement;

	public ArticleFin() {
		super();
	}
	
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

	public String getNombreTotalReglement() {
		return nombreTotalReglement;
	}

	public void setNombreTotalReglement(String nombreTotalReglement) {
		this.nombreTotalReglement = nombreTotalReglement;
	}

	public String getMontantTotalReglement() {
		return montantTotalReglement;
	}

	public void setMontantTotalReglement(String montantTotalReglement) {
		this.montantTotalReglement = montantTotalReglement;
	}

}
