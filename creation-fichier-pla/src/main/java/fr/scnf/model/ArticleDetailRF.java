package fr.scnf.model;

public class ArticleDetailRF {

	private String identifiant;
	private String refEnregistrementReglement;
	private String referenceReglement;
	private String refPaiementExterne;
	private String modePaiement;
	private String montantReglementEuro;
	private String codeDeviseReglement;
	private String montantReglementDevise;
	private String qualifiantDevise;
	private String dateEmissionCheque;
	private String dateEcheance;
	private String businessUnit;
	private String cleLettrage;
	private String codeBUGL;
	private String codeDivision;
	private String typeCompteOperation;

	private String refEnregistrementBeneficiaire;
	private String codeBeneficiaireSIC;
	private String codeBeneficiairePS;
	private String nomBeneficiaire;
	private String siretBeneficiaire;
	private String adresseBeneficiaire;
	private String bureauDistributeurBeneficiaire;
	private String codePostalBeneficiaire;
	private String codePaysBeneficiaire;
	private String libellePaysBeneficiaire;
	private String libelleBanqueBeneficiaire;
	private String identifiantNumeroCompte;
	private String qualifiantStructureCompte;
	private String codeBicSWIFT;

	private String refEnregistrementFournisseurOrigine;
	private String codeFournisseurOrigineSIC;
	private String codeFournisseurOriginePS;
	private String nomFournisseurOrigine;
	private String adresseFournisseurOrigine;
	private String bureauDistributeurFournisseurOrigine;
	private String codePostalFournisseurOrigine;
	private String codePaysFournisseurOrigine;
	private String libellePaysFournisseurOrigine;

	private String refEnregistrementInfoComplRegltEtranger;
	private String filler;
	private String adresseBanqueEtrangere;
	private String bureauDistributeurBanqueEtrangere;
	private String codePostalBanqueEtrangere;
	private String codePaysBanqueEtrangere;
	private String libellePaysBanqueEtrangere;
	private String codeEconomiqueBalancePaiement;

	private String refEnregistrementFacture;
	private String numeroCommande;
	private String numeroFactureFournisseur;
	private String codeTypeReglementFacture;
	private String dateFacture;
	private String montantFactureEuro;

	private String refEnregistrementDeduction;
	private String numeroDeductionFournisseur;
	private String codeTypeReglementDeduction;
	private String dateDeduction;
	private String montantDeductionEuro;

	
	public String getRefEnregistrementReglement() {
		return refEnregistrementReglement;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public void setRefEnregistrementReglement(String refEnregistrementBanniere) {
		this.refEnregistrementReglement = refEnregistrementBanniere;
	}

	public String getReferenceReglement() {
		return referenceReglement;
	}

	public void setReferenceReglement(String referenceReglement) {
		this.referenceReglement = referenceReglement;
	}

	public String getRefPaiementExterne() {
		return refPaiementExterne;
	}

	public void setRefPaiementExterne(String refPaiementExterne) {
		this.refPaiementExterne = refPaiementExterne;
	}

	public String getModePaiement() {
		return modePaiement;
	}

	public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
	}

	public String getMontantReglementEuro() {
		return montantReglementEuro;
	}

	public void setMontantReglementEuro(String montantReglementEuro) {
		this.montantReglementEuro = montantReglementEuro;
	}

	public String getCodeDeviseReglement() {
		return codeDeviseReglement;
	}

	public void setCodeDeviseReglement(String codeDeviseReglement) {
		this.codeDeviseReglement = codeDeviseReglement;
	}

	public String getMontantReglementDevise() {
		return montantReglementDevise;
	}

	public void setMontantReglementDevise(String montantReglementDevise) {
		this.montantReglementDevise = montantReglementDevise;
	}

	public String getQualifiantDevise() {
		return qualifiantDevise;
	}

	public void setQualifiantDevise(String qualifiantDevise) {
		this.qualifiantDevise = qualifiantDevise;
	}

	public String getDateEmissionCheque() {
		return dateEmissionCheque;
	}

	public void setDateEmissionCheque(String dateEmissionCheque) {
		this.dateEmissionCheque = dateEmissionCheque;
	}

	public String getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(String dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getCleLettrage() {
		return cleLettrage;
	}

	public void setCleLettrage(String cleLettrage) {
		this.cleLettrage = cleLettrage;
	}

	public String getCodeBUGL() {
		return codeBUGL;
	}

	public void setCodeBUGL(String codeBUGL) {
		this.codeBUGL = codeBUGL;
	}

	public String getCodeDivision() {
		return codeDivision;
	}

	public void setCodeDivision(String codeDivision) {
		this.codeDivision = codeDivision;
	}

	public String getTypeCompteOperation() {
		return typeCompteOperation;
	}

	public void setTypeCompteOperation(String typeCompteOperation) {
		this.typeCompteOperation = typeCompteOperation;
	}

	public String getRefEnregistrementBeneficiaire() {
		return refEnregistrementBeneficiaire;
	}

	public void setRefEnregistrementBeneficiaire(String refEnregistrementBeneficiaire) {
		this.refEnregistrementBeneficiaire = refEnregistrementBeneficiaire;
	}

	public String getCodeBeneficiaireSIC() {
		return codeBeneficiaireSIC;
	}

	public void setCodeBeneficiaireSIC(String codeBeneficiaireSIC) {
		this.codeBeneficiaireSIC = codeBeneficiaireSIC;
	}

	public String getCodeBeneficiairePS() {
		return codeBeneficiairePS;
	}

	public void setCodeBeneficiairePS(String codeBeneficiairePS) {
		this.codeBeneficiairePS = codeBeneficiairePS;
	}

	public String getNomBeneficiaire() {
		return nomBeneficiaire;
	}

	public void setNomBeneficiaire(String nomBeneficiaire) {
		this.nomBeneficiaire = nomBeneficiaire;
	}

	public String getSiretBeneficiaire() {
		return siretBeneficiaire;
	}

	public void setSiretBeneficiaire(String siretBeneficiaire) {
		this.siretBeneficiaire = siretBeneficiaire;
	}

	public String getAdresseBeneficiaire() {
		return adresseBeneficiaire;
	}

	public void setAdresseBeneficiaire(String adresseBeneficiaire) {
		this.adresseBeneficiaire = adresseBeneficiaire;
	}

	public String getBureauDistributeurBeneficiaire() {
		return bureauDistributeurBeneficiaire;
	}

	public void setBureauDistributeurBeneficiaire(String bureauDistributeurBeneficiaire) {
		this.bureauDistributeurBeneficiaire = bureauDistributeurBeneficiaire;
	}

	public String getCodePostalBeneficiaire() {
		return codePostalBeneficiaire;
	}

	public void setCodePostalBeneficiaire(String codePostalBeneficiaire) {
		this.codePostalBeneficiaire = codePostalBeneficiaire;
	}

	public String getCodePaysBeneficiaire() {
		return codePaysBeneficiaire;
	}

	public void setCodePaysBeneficiaire(String codePaysBeneficiaire) {
		this.codePaysBeneficiaire = codePaysBeneficiaire;
	}

	public String getLibellePaysBeneficiaire() {
		return libellePaysBeneficiaire;
	}

	public void setLibellePaysBeneficiaire(String libellePaysBeneficiaire) {
		this.libellePaysBeneficiaire = libellePaysBeneficiaire;
	}

	public String getLibelleBanqueBeneficiaire() {
		return libelleBanqueBeneficiaire;
	}

	public void setLibelleBanqueBeneficiaire(String libelleBanqueBeneficiaire) {
		this.libelleBanqueBeneficiaire = libelleBanqueBeneficiaire;
	}

	public String getIdentifiantNumeroCompte() {
		return identifiantNumeroCompte;
	}

	public void setIdentifiantNumeroCompte(String identifiantNumeroCompte) {
		this.identifiantNumeroCompte = identifiantNumeroCompte;
	}

	public String getQualifiantStructureCompte() {
		return qualifiantStructureCompte;
	}

	public void setQualifiantStructureCompte(String qualifiantStructureCompte) {
		this.qualifiantStructureCompte = qualifiantStructureCompte;
	}

	public String getCodeBicSWIFT() {
		return codeBicSWIFT;
	}

	public void setCodeBicSWIFT(String codeBicSWIFT) {
		this.codeBicSWIFT = codeBicSWIFT;
	}

	public String getRefEnregistrementFournisseurOrigine() {
		return refEnregistrementFournisseurOrigine;
	}

	public void setRefEnregistrementFournisseurOrigine(String refEnregistrementFournisseurOrigine) {
		this.refEnregistrementFournisseurOrigine = refEnregistrementFournisseurOrigine;
	}

	public String getCodeFournisseurOrigineSIC() {
		return codeFournisseurOrigineSIC;
	}

	public void setCodeFournisseurOrigineSIC(String codeFournisseurOrigineSIC) {
		this.codeFournisseurOrigineSIC = codeFournisseurOrigineSIC;
	}

	public String getCodeFournisseurOriginePS() {
		return codeFournisseurOriginePS;
	}

	public void setCodeFournisseurOriginePS(String codeFournisseurOriginePS) {
		this.codeFournisseurOriginePS = codeFournisseurOriginePS;
	}

	public String getNomFournisseurOrigine() {
		return nomFournisseurOrigine;
	}

	public void setNomFournisseurOrigine(String nomFournisseurOrigine) {
		this.nomFournisseurOrigine = nomFournisseurOrigine;
	}

	public String getAdresseFournisseurOrigine() {
		return adresseFournisseurOrigine;
	}

	public void setAdresseFournisseurOrigine(String adresseFournisseurOrigine) {
		this.adresseFournisseurOrigine = adresseFournisseurOrigine;
	}

	public String getBureauDistributeurFournisseurOrigine() {
		return bureauDistributeurFournisseurOrigine;
	}

	public void setBureauDistributeurFournisseurOrigine(String bureauDistributeurFournisseurOrigine) {
		this.bureauDistributeurFournisseurOrigine = bureauDistributeurFournisseurOrigine;
	}

	public String getCodePostalFournisseurOrigine() {
		return codePostalFournisseurOrigine;
	}

	public void setCodePostalFournisseurOrigine(String codePostalFournisseurOrigine) {
		this.codePostalFournisseurOrigine = codePostalFournisseurOrigine;
	}

	public String getCodePaysFournisseurOrigine() {
		return codePaysFournisseurOrigine;
	}

	public void setCodePaysFournisseurOrigine(String codePaysFournisseurOrigine) {
		this.codePaysFournisseurOrigine = codePaysFournisseurOrigine;
	}

	public String getLibellePaysFournisseurOrigine() {
		return libellePaysFournisseurOrigine;
	}

	public void setLibellePaysFournisseurOrigine(String libellePaysFournisseurOrigine) {
		this.libellePaysFournisseurOrigine = libellePaysFournisseurOrigine;
	}

	public String getRefEnregistrementInfoComplRegltEtranger() {
		return refEnregistrementInfoComplRegltEtranger;
	}

	public void setRefEnregistrementInfoComplRegltEtranger(String refEnregistrementInfoComplRegltEtranger) {
		this.refEnregistrementInfoComplRegltEtranger = refEnregistrementInfoComplRegltEtranger;
	}

	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	public String getAdresseBanqueEtrangere() {
		return adresseBanqueEtrangere;
	}

	public void setAdresseBanqueEtrangere(String adresseBanqueEtrangere) {
		this.adresseBanqueEtrangere = adresseBanqueEtrangere;
	}

	public String getBureauDistributeurBanqueEtrangere() {
		return bureauDistributeurBanqueEtrangere;
	}

	public void setBureauDistributeurBanqueEtrangere(String bureauDistributeurBanqueEtrangere) {
		this.bureauDistributeurBanqueEtrangere = bureauDistributeurBanqueEtrangere;
	}

	public String getCodePostalBanqueEtrangere() {
		return codePostalBanqueEtrangere;
	}

	public void setCodePostalBanqueEtrangere(String codePostalBanqueEtrangere) {
		this.codePostalBanqueEtrangere = codePostalBanqueEtrangere;
	}

	public String getCodePaysBanqueEtrangere() {
		return codePaysBanqueEtrangere;
	}

	public void setCodePaysBanqueEtrangere(String codePaysBanqueEtrangere) {
		this.codePaysBanqueEtrangere = codePaysBanqueEtrangere;
	}

	public String getLibellePaysBanqueEtrangere() {
		return libellePaysBanqueEtrangere;
	}

	public void setLibellePaysBanqueEtrangere(String libellePaysBanqueEtrangere) {
		this.libellePaysBanqueEtrangere = libellePaysBanqueEtrangere;
	}

	public String getCodeEconomiqueBalancePaiement() {
		return codeEconomiqueBalancePaiement;
	}

	public void setCodeEconomiqueBalancePaiement(String codeEconomiqueBalancePaiement) {
		this.codeEconomiqueBalancePaiement = codeEconomiqueBalancePaiement;
	}

	public String getRefEnregistrementFacture() {
		return refEnregistrementFacture;
	}

	public void setRefEnregistrementFacture(String refEnregistrementFacture) {
		this.refEnregistrementFacture = refEnregistrementFacture;
	}

	public String getNumeroCommande() {
		return numeroCommande;
	}

	public void setNumeroCommande(String numeroCommande) {
		this.numeroCommande = numeroCommande;
	}

	public String getNumeroFactureFournisseur() {
		return numeroFactureFournisseur;
	}

	public void setNumeroFactureFournisseur(String numeroFactureFournisseur) {
		this.numeroFactureFournisseur = numeroFactureFournisseur;
	}

	public String getCodeTypeReglementFacture() {
		return codeTypeReglementFacture;
	}

	public void setCodeTypeReglementFacture(String codeTypeReglementFacture) {
		this.codeTypeReglementFacture = codeTypeReglementFacture;
	}

	public String getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(String dateFacture) {
		this.dateFacture = dateFacture;
	}

	public String getMontantFactureEuro() {
		return montantFactureEuro;
	}

	public void setMontantFactureEuro(String montantFactureEuro) {
		this.montantFactureEuro = montantFactureEuro;
	}

	public String getRefEnregistrementDeduction() {
		return refEnregistrementDeduction;
	}

	public void setRefEnregistrementDeduction(String refEnregistrementDeduction) {
		this.refEnregistrementDeduction = refEnregistrementDeduction;
	}

	public String getNumeroDeductionFournisseur() {
		return numeroDeductionFournisseur;
	}

	public void setNumeroDeductionFournisseur(String numeroDeductionFournisseur) {
		this.numeroDeductionFournisseur = numeroDeductionFournisseur;
	}

	public String getCodeTypeReglementDeduction() {
		return codeTypeReglementDeduction;
	}

	public void setCodeTypeReglementDeduction(String codeTypeReglementDeduction) {
		this.codeTypeReglementDeduction = codeTypeReglementDeduction;
	}

	public String getDateDeduction() {
		return dateDeduction;
	}

	public void setDateDeduction(String dateDeduction) {
		this.dateDeduction = dateDeduction;
	}

	public String getMontantDeductionEuro() {
		return montantDeductionEuro;
	}

	public void setMontantDeductionEuro(String montantDeductionEuro) {
		this.montantDeductionEuro = montantDeductionEuro;
	}

}
