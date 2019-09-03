package fr.scnf.model;

import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;

public class Banniere {

	private String refEnregistrement;

	private String identifant;

	private int dateFichier;

	private String numeroFichier;

	private String nombreEnregistrement;

	private String numeroversion;

	private List<Reglement> reglements;

	private ArticleFin articleFin;

	public Banniere(String refEnregistrement) {
		super();
		this.refEnregistrement = refEnregistrement;
		this.identifant = "ADFR";
		this.dateFichier = RandomUtils.nextInt(8);
		this.numeroFichier = "000001";
		this.nombreEnregistrement = "0000010";
		this.numeroversion = "V5";
	}

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

	public String getNumeroFichier() {
		return numeroFichier;
	}

	public void setNumeroFichier(String numeroFichier) {
		this.numeroFichier = numeroFichier;
	}

	public String getNombreEnregistrement() {
		return nombreEnregistrement;
	}

	public void setNombreEnregistrement(String nombreEnregistrement) {
		this.nombreEnregistrement = nombreEnregistrement;
	}

	public String getNumeroversion() {
		return numeroversion;
	}

	public void setNumeroversion(String numeroversion) {
		this.numeroversion = numeroversion;
	}

	public List<Reglement> getReglements() {
		return reglements;
	}

	public void setReglements(List<Reglement> reglements) {
		this.reglements = reglements;
	}

	public ArticleFin getArticleFin() {
		return articleFin;
	}

	public void setArticleFin(ArticleFin articleFin) {
		this.articleFin = articleFin;
	}

}
