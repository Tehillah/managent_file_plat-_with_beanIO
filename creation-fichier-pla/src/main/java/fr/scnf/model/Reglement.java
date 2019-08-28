package fr.scnf.model;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;

public class Reglement {

	private String refEnregistrement;
	private String refReglement;
	private String modePayement;

	private String typeReglement;

	private String libelleOperation;
	private int montantDuReglementEnEuro;
	private String codeDevise;
	private int montantDuReglementEnDevise;

	private int nmbreDecimal;
	private String indicateurMontant;
	private String dateEcheance;

	private String codeRegroupement;

	private String referenceEmission;

	private String zoneReserve;
	private String lettrage;
	private String motifDePayement;

	private String codeEconomie;

	private Beneficiaire beneficiaire;

	public Reglement(String refEnregistrement) {
		super();
		this.refEnregistrement = refEnregistrement;
		this.refReglement = RandomStringUtils.randomAlphanumeric(10);
		this.modePayement = RandomStringUtils.randomAlphanumeric(3);

		this.typeReglement = RandomStringUtils.randomAlphanumeric(3);

		this.libelleOperation = RandomStringUtils.randomAlphanumeric(31);

		this.montantDuReglementEnEuro = RandomUtils.nextInt(14);

		this.codeDevise = RandomStringUtils.randomAlphanumeric(3);

		this.montantDuReglementEnDevise = RandomUtils.nextInt(15);

		this.nmbreDecimal = RandomUtils.nextInt(1);

		this.indicateurMontant = RandomStringUtils.randomAlphanumeric(1);

		this.dateEcheance = RandomStringUtils.randomAlphanumeric(10);

		this.codeRegroupement = RandomStringUtils.randomAlphanumeric(10);

		this.referenceEmission = RandomStringUtils.randomAlphanumeric(10);

		this.zoneReserve = RandomStringUtils.randomAlphanumeric(3);

		this.lettrage = RandomStringUtils.randomAlphanumeric(30);

		this.motifDePayement = RandomStringUtils.randomAlphanumeric(140);

		this.codeEconomie = RandomStringUtils.randomAlphanumeric(6);

	}

	public String getRefEnregistrement() {
		return refEnregistrement;
	}

	public void setRefEnregistrement(String refEnregistrement) {
		this.refEnregistrement = refEnregistrement;
	}

	public String getRefReglement() {
		return refReglement;
	}

	public void setRefReglement(String refReglement) {
		this.refReglement = refReglement;
	}

	public String getModePayement() {
		return modePayement;
	}

	public void setModePayement(String modePayement) {
		this.modePayement = modePayement;
	}

	public String getTypeReglement() {
		return typeReglement;
	}

	public void setTypeReglement(String typeReglement) {
		this.typeReglement = typeReglement;
	}

	public String getLibelleOperation() {
		return libelleOperation;
	}

	public void setLibelleOperation(String libelleOperation) {
		this.libelleOperation = libelleOperation;
	}

	public int getMontantDuReglementEnEuro() {
		return montantDuReglementEnEuro;
	}

	public void setMontantDuReglementEnEuro(int montantDuReglementEnEuro) {
		this.montantDuReglementEnEuro = montantDuReglementEnEuro;
	}

	public String getCodeDevise() {
		return codeDevise;
	}

	public void setCodeDevise(String codeDevise) {
		this.codeDevise = codeDevise;
	}

	public int getMontantDuReglementEnDevise() {
		return montantDuReglementEnDevise;
	}

	public void setMontantDuReglementEnDevise(int montantDuReglementEnDevise) {
		this.montantDuReglementEnDevise = montantDuReglementEnDevise;
	}

	public int getNmbreDecimal() {
		return nmbreDecimal;
	}

	public void setNmbreDecimal(int nmbreDecimal) {
		this.nmbreDecimal = nmbreDecimal;
	}

	public String getIndicateurMontant() {
		return indicateurMontant;
	}

	public void setIndicateurMontant(String indicateurMontant) {
		this.indicateurMontant = indicateurMontant;
	}

	public String getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(String dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	public String getCodeRegroupement() {
		return codeRegroupement;
	}

	public void setCodeRegroupement(String codeRegroupement) {
		this.codeRegroupement = codeRegroupement;
	}

	public String getReferenceEmission() {
		return referenceEmission;
	}

	public void setReferenceEmission(String referenceEmission) {
		this.referenceEmission = referenceEmission;
	}

	public String getZoneReserve() {
		return zoneReserve;
	}

	public void setZoneReserve(String zoneReserve) {
		this.zoneReserve = zoneReserve;
	}

	public String getLettrage() {
		return lettrage;
	}

	public void setLettrage(String lettrage) {
		this.lettrage = lettrage;
	}

	public String getMotifDePayement() {
		return motifDePayement;
	}

	public void setMotifDePayement(String motifDePayement) {
		this.motifDePayement = motifDePayement;
	}

	public String getCodeEconomie() {
		return codeEconomie;
	}

	public void setCodeEconomie(String codeEconomie) {
		this.codeEconomie = codeEconomie;
	}

	public Beneficiaire getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(Beneficiaire beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

}
