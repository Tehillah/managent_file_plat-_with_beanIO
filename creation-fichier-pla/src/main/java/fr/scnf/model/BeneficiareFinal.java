package fr.scnf.model;

import org.apache.commons.lang.RandomStringUtils;

public class BeneficiareFinal {

	private String refEnregistrement;
	private String numeroBeneficiaireFinal;
	private String nomBeneficiaireFinal;
	private String adresseBeneficiaireFinal;
	private String bureauDistributeurBenefFinal;
	private String codePostalBeneficiaireFinal;
	private String codePaysBeneficiaireFinal;
	private String libellePaysBeneficiaireFinal;

	public BeneficiareFinal(String refEnregistrement) {
		super();
		this.refEnregistrement = refEnregistrement;
		this.numeroBeneficiaireFinal = RandomStringUtils.randomAlphanumeric(10);
		;
		this.nomBeneficiaireFinal = RandomStringUtils.randomAlphanumeric(40);
		;
		this.adresseBeneficiaireFinal = RandomStringUtils.randomAlphanumeric(32);
		;
		this.bureauDistributeurBenefFinal = RandomStringUtils.randomAlphanumeric(26);
		;
		this.codePostalBeneficiaireFinal = RandomStringUtils.randomAlphanumeric(12);
		;
		this.codePaysBeneficiaireFinal = RandomStringUtils.randomAlphanumeric(3);
		;
		this.libellePaysBeneficiaireFinal = RandomStringUtils.randomAlphanumeric(30);
		;
	}

	public String getRefEnregistrement() {
		return refEnregistrement;
	}

	public void setRefEnregistrement(String refEnregistrement) {
		this.refEnregistrement = refEnregistrement;
	}

	public String getNumeroBeneficiaireFinal() {
		return numeroBeneficiaireFinal;
	}

	public void setNumeroBeneficiaireFinal(String numeroBeneficiaireFinal) {
		this.numeroBeneficiaireFinal = numeroBeneficiaireFinal;
	}

	public String getNomBeneficiaireFinal() {
		return nomBeneficiaireFinal;
	}

	public void setNomBeneficiaireFinal(String nomBeneficiaireFinal) {
		this.nomBeneficiaireFinal = nomBeneficiaireFinal;
	}

	public String getAdresseBeneficiaireFinal() {
		return adresseBeneficiaireFinal;
	}

	public void setAdresseBeneficiaireFinal(String adresseBeneficiaireFinal) {
		this.adresseBeneficiaireFinal = adresseBeneficiaireFinal;
	}

	public String getBureauDistributeurBenefFinal() {
		return bureauDistributeurBenefFinal;
	}

	public void setBureauDistributeurBenefFinal(String bureauDistributeurBenefFinal) {
		this.bureauDistributeurBenefFinal = bureauDistributeurBenefFinal;
	}

	public String getCodePostalBeneficiaireFinal() {
		return codePostalBeneficiaireFinal;
	}

	public void setCodePostalBeneficiaireFinal(String codePostalBeneficiaireFinal) {
		this.codePostalBeneficiaireFinal = codePostalBeneficiaireFinal;
	}

	public String getCodePaysBeneficiaireFinal() {
		return codePaysBeneficiaireFinal;
	}

	public void setCodePaysBeneficiaireFinal(String codePaysBeneficiaireFinal) {
		this.codePaysBeneficiaireFinal = codePaysBeneficiaireFinal;
	}

	public String getLibellePaysBeneficiaireFinal() {
		return libellePaysBeneficiaireFinal;
	}

	public void setLibellePaysBeneficiaireFinal(String libellePaysBeneficiaireFinal) {
		this.libellePaysBeneficiaireFinal = libellePaysBeneficiaireFinal;
	}

}
