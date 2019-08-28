package fr.scnf.model;

import java.util.List;

import org.apache.commons.lang.RandomStringUtils;

public class Beneficiaire {

	private String refEnregistrement;
	private String numeroBeneficiaire;
	private String siretBeneficiare;
	private String titreCivile;
	private String nomBeneficiaire;
	private String nomComplementaire;
	private String zoneReserve;
	private String nomOrdreCheque;
	private String nomComplementaireOrdreCheque;
	private String adresseBeneficiaire;
	private String bureauDistributeurBenef;
	private String codePostalBenef;
	private String codePaysBenef;
	private String libellePaysBenef;
	private String libelleBanqueBenef;
	private String identifiantNumeroCompte;
	private String qualificationStructureCompte;
	private String codeBic;
	private DonneurOrdreInitial donneurOrdreInitial;
	private BeneficiareFinal beneficiareFinal;
	private InfoComplementaireReg infoComplementaireReg;
	private List<Facture> factures;
	private Deduction deduction;
	private List<CreanceDebiteur> creanceDebiteurs;
	private Activite activite;

	public Beneficiaire(String refEnregistrement) {
		super();
		this.refEnregistrement = refEnregistrement;
		this.numeroBeneficiaire = RandomStringUtils.randomAlphanumeric(10);
		this.siretBeneficiare = RandomStringUtils.randomAlphanumeric(14);
		this.titreCivile = RandomStringUtils.randomAlphanumeric(1);
		this.nomBeneficiaire = RandomStringUtils.randomAlphanumeric(40);
		this.nomComplementaire = RandomStringUtils.randomAlphanumeric(30);
		this.zoneReserve = RandomStringUtils.randomAlphanumeric(10);
		this.nomOrdreCheque = RandomStringUtils.randomAlphanumeric(32);
		this.nomComplementaireOrdreCheque = RandomStringUtils.randomAlphanumeric(32);
		this.adresseBeneficiaire = RandomStringUtils.randomAlphanumeric(32);
		this.bureauDistributeurBenef = RandomStringUtils.randomAlphanumeric(26);
		this.codePostalBenef = RandomStringUtils.randomAlphanumeric(12);
		this.codePaysBenef = RandomStringUtils.randomAlphanumeric(3);
		this.libellePaysBenef = RandomStringUtils.randomAlphanumeric(30);
		this.libelleBanqueBenef = RandomStringUtils.randomAlphanumeric(30);
		this.identifiantNumeroCompte = RandomStringUtils.randomAlphanumeric(34);
		this.qualificationStructureCompte = RandomStringUtils.randomAlphanumeric(1);
		this.codeBic = RandomStringUtils.randomAlphanumeric(11);
	}

	public String getNomComplementaire() {
		return nomComplementaire;
	}

	public void setNomComplementaire(String nomComplementaire) {
		this.nomComplementaire = nomComplementaire;
	}

	public String getRefEnregistrement() {
		return refEnregistrement;
	}

	public void setRefEnregistrement(String refEnregistrement) {
		this.refEnregistrement = refEnregistrement;
	}

	public String getNumeroBeneficiaire() {
		return numeroBeneficiaire;
	}

	public void setNumeroBeneficiaire(String numeroBeneficiaire) {
		this.numeroBeneficiaire = numeroBeneficiaire;
	}

	public String getSiretBeneficiare() {
		return siretBeneficiare;
	}

	public void setSiretBeneficiare(String siretBeneficiare) {
		this.siretBeneficiare = siretBeneficiare;
	}

	public String getTitreCivile() {
		return titreCivile;
	}

	public void setTitreCivile(String titreCivile) {
		this.titreCivile = titreCivile;
	}

	public String getNomBeneficiaire() {
		return nomBeneficiaire;
	}

	public void setNomBeneficiaire(String nomBeneficiaire) {
		this.nomBeneficiaire = nomBeneficiaire;
	}

	public String getZoneReserve() {
		return zoneReserve;
	}

	public void setZoneReserve(String zoneReserve) {
		this.zoneReserve = zoneReserve;
	}

	public String getNomOrdreCheque() {
		return nomOrdreCheque;
	}

	public void setNomOrdreCheque(String nomOrdreCheque) {
		this.nomOrdreCheque = nomOrdreCheque;
	}

	public String getNomComplementaireOrdreCheque() {
		return nomComplementaireOrdreCheque;
	}

	public void setNomComplementaireOrdreCheque(String nomComplementaireOrdreCheque) {
		this.nomComplementaireOrdreCheque = nomComplementaireOrdreCheque;
	}

	public String getAdresseBeneficiaire() {
		return adresseBeneficiaire;
	}

	public void setAdresseBeneficiaire(String adresseBeneficiaire) {
		this.adresseBeneficiaire = adresseBeneficiaire;
	}

	public String getBureauDistributeurBenef() {
		return bureauDistributeurBenef;
	}

	public void setBureauDistributeurBenef(String bureauDistributeurBenef) {
		this.bureauDistributeurBenef = bureauDistributeurBenef;
	}

	public String getCodePostalBenef() {
		return codePostalBenef;
	}

	public void setCodePostalBenef(String codePostalBenef) {
		this.codePostalBenef = codePostalBenef;
	}

	public String getCodePaysBenef() {
		return codePaysBenef;
	}

	public void setCodePaysBenef(String codePaysBenef) {
		this.codePaysBenef = codePaysBenef;
	}

	public String getLibellePaysBenef() {
		return libellePaysBenef;
	}

	public void setLibellePaysBenef(String libellePaysBenef) {
		this.libellePaysBenef = libellePaysBenef;
	}

	public String getLibelleBanqueBenef() {
		return libelleBanqueBenef;
	}

	public void setLibelleBanqueBenef(String libelleBanqueBenef) {
		this.libelleBanqueBenef = libelleBanqueBenef;
	}

	public String getIdentifiantNumeroCompte() {
		return identifiantNumeroCompte;
	}

	public void setIdentifiantNumeroCompte(String identifiantNumeroCompte) {
		this.identifiantNumeroCompte = identifiantNumeroCompte;
	}

	public String getQualificationStructureCompte() {
		return qualificationStructureCompte;
	}

	public void setQualificationStructureCompte(String qualificationStructureCompte) {
		this.qualificationStructureCompte = qualificationStructureCompte;
	}

	public String getCodeBic() {
		return codeBic;
	}

	public void setCodeBic(String codeBic) {
		this.codeBic = codeBic;
	}

	public DonneurOrdreInitial getDonneurOrdreInitial() {
		return donneurOrdreInitial;
	}

	public void setDonneurOrdreInitial(DonneurOrdreInitial donneurOrdreInitial) {
		this.donneurOrdreInitial = donneurOrdreInitial;
	}

	public BeneficiareFinal getBeneficiareFinal() {
		return beneficiareFinal;
	}

	public void setBeneficiareFinal(BeneficiareFinal beneficiareFinal) {
		this.beneficiareFinal = beneficiareFinal;
	}

	public Deduction getDeduction() {
		return deduction;
	}

	public void setDeduction(Deduction deduction) {
		this.deduction = deduction;
	}

	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}

	public List<CreanceDebiteur> getCreanceDebiteurs() {
		return creanceDebiteurs;
	}

	public void setCreanceDebiteurs(List<CreanceDebiteur> creanceDebiteurs) {
		this.creanceDebiteurs = creanceDebiteurs;
	}

	public Activite getActivite() {
		return activite;
	}

	public void setActivite(Activite activite) {
		this.activite = activite;
	}

	public InfoComplementaireReg getInfoComplementaireReg() {
		return infoComplementaireReg;
	}

	public void setInfoComplementaireReg(InfoComplementaireReg infoComplementaireReg) {
		this.infoComplementaireReg = infoComplementaireReg;
	}

}
