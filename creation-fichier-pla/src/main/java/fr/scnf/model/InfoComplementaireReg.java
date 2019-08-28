package fr.scnf.model;

import org.apache.commons.lang.RandomStringUtils;

public class InfoComplementaireReg {

	private String refEnregistrement;
	private String adresseBanqueEtrangere;
	private String bureauDistributeurBanqEtrangere;
	private String codePostalBanqEtrangere;
	private String codePaysBanqEtrangere;
	private String libellePaysBanqEtrangere;
	private String zoneReserve;

	public InfoComplementaireReg(String refEnregistrement) {
		super();
		this.refEnregistrement = refEnregistrement;
		this.adresseBanqueEtrangere = RandomStringUtils.randomAlphanumeric(35);
		this.bureauDistributeurBanqEtrangere = RandomStringUtils.randomAlphanumeric(30);
		this.codePostalBanqEtrangere = RandomStringUtils.randomAlphanumeric(12);
		this.codePaysBanqEtrangere = RandomStringUtils.randomAlphanumeric(3);
		this.libellePaysBanqEtrangere = RandomStringUtils.randomAlphanumeric(30);
		this.zoneReserve = RandomStringUtils.randomAlphanumeric(3);
	}

	public String getRefEnregistrement() {
		return refEnregistrement;
	}

	public void setRefEnregistrement(String refEnregistrement) {
		this.refEnregistrement = refEnregistrement;
	}

	public String getAdresseBanqueEtrangere() {
		return adresseBanqueEtrangere;
	}

	public void setAdresseBanqueEtrangere(String adresseBanqueEtrangere) {
		this.adresseBanqueEtrangere = adresseBanqueEtrangere;
	}

	public String getBureauDistributeurBanqEtrangere() {
		return bureauDistributeurBanqEtrangere;
	}

	public void setBureauDistributeurBanqEtrangere(String bureauDistributeurBanqEtrangere) {
		this.bureauDistributeurBanqEtrangere = bureauDistributeurBanqEtrangere;
	}

	public String getCodePostalBanqEtrangere() {
		return codePostalBanqEtrangere;
	}

	public void setCodePostalBanqEtrangere(String codePostalBanqEtrangere) {
		this.codePostalBanqEtrangere = codePostalBanqEtrangere;
	}

	public String getCodePaysBanqEtrangere() {
		return codePaysBanqEtrangere;
	}

	public void setCodePaysBanqEtrangere(String codePaysBanqEtrangere) {
		this.codePaysBanqEtrangere = codePaysBanqEtrangere;
	}

	public String getLibellePaysBanqEtrangere() {
		return libellePaysBanqEtrangere;
	}

	public void setLibellePaysBanqEtrangere(String libellePaysBanqEtrangere) {
		this.libellePaysBanqEtrangere = libellePaysBanqEtrangere;
	}

	public String getZoneReserve() {
		return zoneReserve;
	}

	public void setZoneReserve(String zoneReserve) {
		this.zoneReserve = zoneReserve;
	}

}
