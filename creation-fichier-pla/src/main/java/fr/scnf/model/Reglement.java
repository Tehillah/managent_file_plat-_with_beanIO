package fr.scnf.model;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;

public class Reglement {

	private String refEnregistrement;
	private String refReglement;
	private String modePayement;

	private String typeReglement;

	private String libelleOperation;
	private String montantDuReglementEnEuro;
	private String codeDevise;
	private String montantDuReglementEnDevise;

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
		this.refReglement = "7109749N";
		this.modePayement = "VIR";

		this.typeReglement = "ORD";

		this.libelleOperation = "SNCF 7109749N 00001ACOMPTE SUR";

		this.montantDuReglementEnEuro = "00000000180000";

		this.codeDevise = "EUR";

		this.montantDuReglementEnDevise = "000000000000000";

		this.nmbreDecimal = 2;

		this.indicateurMontant = "O";

//		this.dateEcheance = ;

//		this.codeRegroupement = ;

//		this.referenceEmission = ;

//		this.zoneReserve = ;

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

	public String getMontantDuReglementEnEuro() {
		return montantDuReglementEnEuro;
	}

	public void setMontantDuReglementEnEuro(String montantDuReglementEnEuro) {
		this.montantDuReglementEnEuro = montantDuReglementEnEuro;
	}

	public String getCodeDevise() {
		return codeDevise;
	}

	public void setCodeDevise(String codeDevise) {
		this.codeDevise = codeDevise;
	}

	public String getMontantDuReglementEnDevise() {
		return montantDuReglementEnDevise;
	}

	public void setMontantDuReglementEnDevise(String montantDuReglementEnDevise) {
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
