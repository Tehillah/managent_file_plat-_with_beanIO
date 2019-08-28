package fr.scnf.model;

import org.apache.commons.lang.RandomStringUtils;

public class DonneurOrdreInitial {
	private String refEnregistrement;
	private String nomDonneurOrdre;
	private String referenceDuService;
	private String nomService;
	private String adresseService;
	private String bureauDistributeur;
	private String codePostal;
	private String codeEtablissementComptable;
	private String codeEtablissement;
	private String libelleEtablissement;
	private String nomEtablissement;
	private String numeroTelephone;
	private String emailResponsable;

	public DonneurOrdreInitial(String refEnregistrement) {
		super();
		this.refEnregistrement = refEnregistrement;
		this.nomDonneurOrdre = RandomStringUtils.randomAlphanumeric(40);
		this.referenceDuService = RandomStringUtils.randomAlphanumeric(10);
		this.nomService = RandomStringUtils.randomAlphanumeric(50);
		this.adresseService = RandomStringUtils.randomAlphanumeric(32);
		this.bureauDistributeur = RandomStringUtils.randomAlphanumeric(26);
		this.codePostal = RandomStringUtils.randomAlphanumeric(12);
		this.codeEtablissementComptable = RandomStringUtils.randomAlphanumeric(10);
		this.codeEtablissement = RandomStringUtils.randomAlphanumeric(10);
		this.libelleEtablissement = RandomStringUtils.randomAlphanumeric(50);
		this.nomEtablissement = RandomStringUtils.randomAlphanumeric(50);
		this.numeroTelephone = RandomStringUtils.randomAlphanumeric(14);
		this.emailResponsable = RandomStringUtils.randomAlphanumeric(60);
	}

	public String getRefEnregistrement() {
		return refEnregistrement;
	}

	public void setRefEnregistrement(String refEnregistrement) {
		this.refEnregistrement = refEnregistrement;
	}

	public String getNomDonneurOrdre() {
		return nomDonneurOrdre;
	}

	public void setNomDonneurOrdre(String nomDonneurOrdre) {
		this.nomDonneurOrdre = nomDonneurOrdre;
	}

	public String getReferenceDuService() {
		return referenceDuService;
	}

	public void setReferenceDuService(String referenceDuService) {
		this.referenceDuService = referenceDuService;
	}

	public String getNomService() {
		return nomService;
	}

	public void setNomService(String nomService) {
		this.nomService = nomService;
	}

	public String getAdresseService() {
		return adresseService;
	}

	public void setAdresseService(String adresseService) {
		this.adresseService = adresseService;
	}

	public String getBureauDistributeur() {
		return bureauDistributeur;
	}

	public void setBureauDistributeur(String bureauDistributeur) {
		this.bureauDistributeur = bureauDistributeur;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getCodeEtablissementComptable() {
		return codeEtablissementComptable;
	}

	public void setCodeEtablissementComptable(String codeEtablissementComptable) {
		this.codeEtablissementComptable = codeEtablissementComptable;
	}

	public String getCodeEtablissement() {
		return codeEtablissement;
	}

	public void setCodeEtablissement(String codeEtablissement) {
		this.codeEtablissement = codeEtablissement;
	}

	public String getLibelleEtablissement() {
		return libelleEtablissement;
	}

	public void setLibelleEtablissement(String libelleEtablissement) {
		this.libelleEtablissement = libelleEtablissement;
	}

	public String getNomEtablissement() {
		return nomEtablissement;
	}

	public void setNomEtablissement(String nomEtablissement) {
		this.nomEtablissement = nomEtablissement;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public String getEmailResponsable() {
		return emailResponsable;
	}

	public void setEmailResponsable(String emailResponsable) {
		this.emailResponsable = emailResponsable;
	}

}
