package fr.scnf.model;

import java.util.List;

//@Record(minOccurs=0, maxOccurs=-1)
//@Fields({
//    @Field(at=0, name="recordType", rid=true, literal="D")
//})
public class Banniere {

//    @Field(at=1, maxLength=20)
	private String refEnregistrement;
//    @Field(at=2, required=true, maxLength=30)
	private String identifant;
//    @Field(at=5, maxLength=6)
	private int dateFichier;
//    @Field(at=3, maxLength=30)
	private int numeroFichier;
//    @Field(at=5, minLength=2, maxLength=2)
	private int nombreEnregistrement;
//    @Field(at=3, maxLength=30)
	private String numeroversion;
	private List<Reglement> listReglement;

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

	public int getNombreEnregistrement() {
		return nombreEnregistrement;
	}

	public void setNombreEnregistrement(int nombreEnregistrement) {
		this.nombreEnregistrement = nombreEnregistrement;
	}

	public String getNumeroversion() {
		return numeroversion;
	}

	public void setNumeroversion(String numeroversion) {
		this.numeroversion = numeroversion;
	}

	public List<Reglement> getListReglement() {
		return listReglement;
	}

	public void setListReglement(List<Reglement> listReglement) {
		this.listReglement = listReglement;
	}

}
