package fr.scnf.model;

import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;

public class Banniere {

	private String refEnregistrement;

	private String identifant;

	private int dateFichier;

	private int numeroFichier;

	private int nombreEnregistrement;

	private String numeroversion;
	private List<Reglement> reglements;
	private ArticleFin articleFin;

	public Banniere(String refEnregistrement) {
		super();
		this.refEnregistrement = refEnregistrement;
		this.identifant = RandomStringUtils.randomAlphanumeric(15);
		this.dateFichier = RandomUtils.nextInt(8);
		this.numeroFichier = RandomUtils.nextInt(6);
		this.nombreEnregistrement = RandomUtils.nextInt(7);
		this.numeroversion = RandomStringUtils.randomAlphanumeric(2);
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
