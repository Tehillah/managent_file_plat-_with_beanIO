package fr.scnf.model;

import java.io.Serializable;

public class DonneEntrant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String identifiant;

	private String refEnregistrementReglement;
	private String refReglement;
	private String modePaiement;
	private String typeReglement;
	private String libelleOperation;
	private String montantDuReglementEnEuro;
	private String codeDevise;
	private String montantDuReglementEnDevise;
	private String nombreDecimales;
	private String indicateurMontant;
	private String dateEcheance;
	private String codeRegroupement;
	private String referenceEmission;
	private String zoneReserveeReglement;
	private String lettrage;
	private String motifPaiement;
	private String codeEconomique;

	private String refEnregistrementBeneficiaire;
	private String numeroBeneficiaire;
	private String siretBeneficiare;
	private String titreCivile;
	private String nomBeneficiaire;
	private String nomComplementaire;
	private String zoneReserveeBeneficiaire;
	private String nomOrdreCheque;
	private String nomComplementaireOrdreCheque;
	private String adresseBeneficiaire;
	private String adresseComplementaireBeneficiaire;
	private String bureauDistributeurBenef;
	private String codePostalBenef;
	private String codePaysBenef;
	private String libellePaysBenef;
	private String libelleBanqueBenef;
	private String identifiantNumeroCompte;
	private String qualifiantStructureCompte;
	private String codeBic;

	private String refEnregistrementDonneurOrdreInitial;
	private String nomDonneurOrdre;
	private String referenceDuService;
	private String nomService;
	private String adresseService;
	private String bureauDistributeurService;
	private String codePostalService;
	private String codeEtablissementComptable;
	private String codeEtablissement;
	private String libelleEtablissement;
	private String nomResponsable;
	private String numeroTelephoneResponsable;
	private String emailResponsable;

	private String refEnregistrementBeneficiaireFinal;
	private String numeroBeneficiaireFinal;
	private String nomBeneficiaireFinal;
	private String adresseBeneficiaireFinal;
	private String bureauDistributeurBenefFinal;
	private String codePostalBeneficiaireFinal;
	private String codePaysBeneficiaireFinal;
	private String libellePaysBeneficiaireFinal;

	private String refEnregistrementInfoComplementaireReg;
	private String adresseBanqueEtrangere;
	private String bureauDistributeurBanqEtrangere;
	private String codePostalBanqEtrangere;
	private String codePaysBanqEtrangere;
	private String libellePaysBanqEtrangere;
	private String zoneReserveeInfoComplementaireReg;

	private String refEnregistrementFacture;
	private String numeroCommande;
	private String numeroFactureFournisseur;
	private String typeFacture;
	private String dateFacture;
	private String montantFactureEuro;

	private String refEnregistrementDeduction;
	private String numeroDeduction;
	private String typeDeduction;
	private String dateDeduction;
	private String montantDeductionEuro;

	private String refEnregistrementCreanceDebiteur;
	private String refCreance;
	private String refCreancier;
	private String libelleCreance;
	private String libelleDetailCreance;
	private String montantDetailCreance;
	private String numeroDebiteur;
	private String nomDebiteur;

	private String refEnregistrementActivite;
	private String codeBuGl;
	private String codeDivision;
	private String typeCompteOperation;
	private String champ1Activite;
	private String champ2Activite;

	private String refEnregistrementDivers;
	private String champ1;
	private String champ2;
	private String champ3;
	private String champ4;
	private String champ5;
	private String champ6;
	private String champ7;
	private String champ8;
	private String champ9;
	private String champ10;

	public String getRefEnregistrementReglement() {
		return refEnregistrementReglement;
	}

	public void setRefEnregistrementReglement(String refEnregistrementReglement) {
		this.refEnregistrementReglement = refEnregistrementReglement;
	}

	public String getRefReglement() {
		return refReglement;
	}

	public void setRefReglement(String refReglement) {
		this.refReglement = refReglement;
	}

	public String getModePaiement() {
		return modePaiement;
	}

	public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
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

	public String getNombreDecimales() {
		return nombreDecimales;
	}

	public void setNombreDecimales(String nombreDecimales) {
		this.nombreDecimales = nombreDecimales;
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

	public String getZoneReserveeReglement() {
		return zoneReserveeReglement;
	}

	public void setZoneReserveeReglement(String zoneReserveeReglement) {
		this.zoneReserveeReglement = zoneReserveeReglement;
	}

	public String getLettrage() {
		return lettrage;
	}

	public void setLettrage(String lettrage) {
		this.lettrage = lettrage;
	}

	public String getMotifPaiement() {
		return motifPaiement;
	}

	public void setMotifPaiement(String motifPaiement) {
		this.motifPaiement = motifPaiement;
	}

	public String getCodeEconomique() {
		return codeEconomique;
	}

	public void setCodeEconomique(String codeEconomique) {
		this.codeEconomique = codeEconomique;
	}

	public String getRefEnregistrementBeneficiaire() {
		return refEnregistrementBeneficiaire;
	}

	public void setRefEnregistrementBeneficiaire(String refEnregistrementBeneficiaire) {
		this.refEnregistrementBeneficiaire = refEnregistrementBeneficiaire;
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

	public String getNomComplementaire() {
		return nomComplementaire;
	}

	public void setNomComplementaire(String nomComplementaire) {
		this.nomComplementaire = nomComplementaire;
	}

	public String getZoneReserveeBeneficiaire() {
		return zoneReserveeBeneficiaire;
	}

	public void setZoneReserveeBeneficiaire(String zoneReserveeBeneficiaire) {
		this.zoneReserveeBeneficiaire = zoneReserveeBeneficiaire;
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

	public String getAdresseComplementaireBeneficiaire() {
		return adresseComplementaireBeneficiaire;
	}

	public void setAdresseComplementaireBeneficiaire(String adresseComplementaireBeneficiaire) {
		this.adresseComplementaireBeneficiaire = adresseComplementaireBeneficiaire;
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

	public String getQualifiantStructureCompte() {
		return qualifiantStructureCompte;
	}

	public void setQualifiantStructureCompte(String qualifiantStructureCompte) {
		this.qualifiantStructureCompte = qualifiantStructureCompte;
	}

	public String getCodeBic() {
		return codeBic;
	}

	public void setCodeBic(String codeBic) {
		this.codeBic = codeBic;
	}

	public String getRefEnregistrementDonneurOrdreInitial() {
		return refEnregistrementDonneurOrdreInitial;
	}

	public void setRefEnregistrementDonneurOrdreInitial(String refEnregistrementDonneurOrdreInitial) {
		this.refEnregistrementDonneurOrdreInitial = refEnregistrementDonneurOrdreInitial;
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

	public String getBureauDistributeurService() {
		return bureauDistributeurService;
	}

	public void setBureauDistributeurService(String bureauDistributeurService) {
		this.bureauDistributeurService = bureauDistributeurService;
	}

	public String getCodePostalService() {
		return codePostalService;
	}

	public void setCodePostalService(String codePostalService) {
		this.codePostalService = codePostalService;
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

	public String getNomResponsable() {
		return nomResponsable;
	}

	public void setNomResponsable(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}

	public String getNumeroTelephoneResponsable() {
		return numeroTelephoneResponsable;
	}

	public void setNumeroTelephoneResponsable(String numeroTelephoneResponsable) {
		this.numeroTelephoneResponsable = numeroTelephoneResponsable;
	}

	public String getEmailResponsable() {
		return emailResponsable;
	}

	public void setEmailResponsable(String emailResponsable) {
		this.emailResponsable = emailResponsable;
	}

	public String getRefEnregistrementBeneficiaireFinal() {
		return refEnregistrementBeneficiaireFinal;
	}

	public void setRefEnregistrementBeneficiaireFinal(String refEnregistrementBeneficiaireFinal) {
		this.refEnregistrementBeneficiaireFinal = refEnregistrementBeneficiaireFinal;
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

	public String getRefEnregistrementInfoComplementaireReg() {
		return refEnregistrementInfoComplementaireReg;
	}

	public void setRefEnregistrementInfoComplementaireReg(String refEnregistrementInfoComplementaireReg) {
		this.refEnregistrementInfoComplementaireReg = refEnregistrementInfoComplementaireReg;
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

	public String getZoneReserveeInfoComplementaireReg() {
		return zoneReserveeInfoComplementaireReg;
	}

	public void setZoneReserveeInfoComplementaireReg(String zoneReserveeInfoComplementaireReg) {
		this.zoneReserveeInfoComplementaireReg = zoneReserveeInfoComplementaireReg;
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

	public String getTypeFacture() {
		return typeFacture;
	}

	public void setTypeFacture(String typeFacture) {
		this.typeFacture = typeFacture;
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

	public String getNumeroDeduction() {
		return numeroDeduction;
	}

	public void setNumeroDeduction(String numeroDeduction) {
		this.numeroDeduction = numeroDeduction;
	}

	public String getTypeDeduction() {
		return typeDeduction;
	}

	public void setTypeDeduction(String typeDeduction) {
		this.typeDeduction = typeDeduction;
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

	public String getRefEnregistrementCreanceDebiteur() {
		return refEnregistrementCreanceDebiteur;
	}

	public void setRefEnregistrementCreanceDebiteur(String refEnregistrementCreanceDebiteur) {
		this.refEnregistrementCreanceDebiteur = refEnregistrementCreanceDebiteur;
	}

	public String getRefCreance() {
		return refCreance;
	}

	public void setRefCreance(String refCreance) {
		this.refCreance = refCreance;
	}

	public String getRefCreancier() {
		return refCreancier;
	}

	public void setRefCreancier(String refCreancier) {
		this.refCreancier = refCreancier;
	}

	public String getLibelleCreance() {
		return libelleCreance;
	}

	public void setLibelleCreance(String libelleCreance) {
		this.libelleCreance = libelleCreance;
	}

	public String getLibelleDetailCreance() {
		return libelleDetailCreance;
	}

	public void setLibelleDetailCreance(String libelleDetailCreance) {
		this.libelleDetailCreance = libelleDetailCreance;
	}

	public String getMontantDetailCreance() {
		return montantDetailCreance;
	}

	public void setMontantDetailCreance(String montantDetailCreance) {
		this.montantDetailCreance = montantDetailCreance;
	}

	public String getNumeroDebiteur() {
		return numeroDebiteur;
	}

	public void setNumeroDebiteur(String numeroDebiteur) {
		this.numeroDebiteur = numeroDebiteur;
	}

	public String getNomDebiteur() {
		return nomDebiteur;
	}

	public void setNomDebiteur(String nomDebiteur) {
		this.nomDebiteur = nomDebiteur;
	}

	public String getRefEnregistrementActivite() {
		return refEnregistrementActivite;
	}

	public void setRefEnregistrementActivite(String refEnregistrementActivite) {
		this.refEnregistrementActivite = refEnregistrementActivite;
	}

	public String getCodeBuGl() {
		return codeBuGl;
	}

	public void setCodeBuGl(String codeBuGl) {
		this.codeBuGl = codeBuGl;
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

	public String getChamp1Activite() {
		return champ1Activite;
	}

	public void setChamp1Activite(String champ1Activite) {
		this.champ1Activite = champ1Activite;
	}

	public String getChamp2Activite() {
		return champ2Activite;
	}

	public void setChamp2Activite(String champ2Activite) {
		this.champ2Activite = champ2Activite;
	}

	public String getRefEnregistrementDivers() {
		return refEnregistrementDivers;
	}

	public void setRefEnregistrementDivers(String refEnregistrementDivers) {
		this.refEnregistrementDivers = refEnregistrementDivers;
	}

	public String getChamp1() {
		return champ1;
	}

	public void setChamp1(String champ1) {
		this.champ1 = champ1;
	}

	public String getChamp2() {
		return champ2;
	}

	public void setChamp2(String champ2) {
		this.champ2 = champ2;
	}

	public String getChamp3() {
		return champ3;
	}

	public void setChamp3(String champ3) {
		this.champ3 = champ3;
	}

	public String getChamp4() {
		return champ4;
	}

	public void setChamp4(String champ4) {
		this.champ4 = champ4;
	}

	public String getChamp5() {
		return champ5;
	}

	public void setChamp5(String champ5) {
		this.champ5 = champ5;
	}

	public String getChamp6() {
		return champ6;
	}

	public void setChamp6(String champ6) {
		this.champ6 = champ6;
	}

	public String getChamp7() {
		return champ7;
	}

	public void setChamp7(String champ7) {
		this.champ7 = champ7;
	}

	public String getChamp8() {
		return champ8;
	}

	public void setChamp8(String champ8) {
		this.champ8 = champ8;
	}

	public String getChamp9() {
		return champ9;
	}

	public void setChamp9(String champ9) {
		this.champ9 = champ9;
	}

	public String getChamp10() {
		return champ10;
	}

	public void setChamp10(String champ10) {
		this.champ10 = champ10;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

}