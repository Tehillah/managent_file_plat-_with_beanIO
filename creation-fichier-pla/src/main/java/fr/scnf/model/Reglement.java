package fr.scnf.model;

public class Reglement {
//  @Field(at=1, maxLength=20)
	private String refEnregistrement;
//  @Field(at=2, required=true, maxLength=30)
	private String identifant;
//  @Field(at=5, maxLength=6)
	private int dateFichier;
//  @Field(at=3, maxLength=30)
	private int numeroFichier;

	public String getRefEnregistrement() {
		return refEnregistrement;
	}

	public void setRefEnregistrement(String refEnregistrement) {
		this.refEnregistrement = refEnregistrement;
	}

	public String getIdentifant() {
		return identifant;
	}

	public void setIdentifant(String identifant) {
		this.identifant = identifant;
	}

	public int getDateFichier() {
		return dateFichier;
	}

	public void setDateFichier(int dateFichier) {
		this.dateFichier = dateFichier;
	}

	public int getNumeroFichier() {
		return numeroFichier;
	}

	public void setNumeroFichier(int numeroFichier) {
		this.numeroFichier = numeroFichier;
	}

}
