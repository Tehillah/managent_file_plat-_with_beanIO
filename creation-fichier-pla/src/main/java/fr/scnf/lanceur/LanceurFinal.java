package fr.scnf.lanceur;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.beanio.BeanReader;
import org.beanio.BeanWriter;
import org.beanio.StreamFactory;

import fr.scnf.model.Activite;
import fr.scnf.model.ArticleFin;
import fr.scnf.model.Banniere;
import fr.scnf.model.Beneficiaire;
import fr.scnf.model.BeneficiaireFinal;
import fr.scnf.model.CreanceDebiteur;
import fr.scnf.model.Deduction;
import fr.scnf.model.Divers;
import fr.scnf.model.DonneEntrant;
import fr.scnf.model.DonneurOrdreInitial;
import fr.scnf.model.Facture;
import fr.scnf.model.InfoComplementaireReg;
import fr.scnf.model.Reglement;

public class LanceurFinal {

	public static void main(String[] args) {

		// create a BeanIO StreamFactory
		StreamFactory factory = StreamFactory.newInstance();
		// load the mapping file from the working directory
		factory.load("src/main/resources/config.xml");

		// chargement fichier de lecture cvs
		// read it from the classpath : src/main/resources
		BeanReader readerBanniere = factory.createReader("banniereEntrant",
				new File("src/main/resources/input/data-banniere1.csv"));

		BeanReader readerBeneficiaire = factory.createReader("donneEntrant",
				new File("src/main/resources/input/data-milieu1.csv"));

		BeanReader readerArticleFin = factory.createReader("articleFinEntrant",
				new File("src/main/resources/input/data-articleFin1.csv"));

		Object record = null;
		List<DonneEntrant> donneEntrants = new ArrayList<>();
		List<Banniere> bannieres = new ArrayList<>();
		List<ArticleFin> articleFins = new ArrayList<>();

		// lecture du fichier "data.csv" et le stockage dans les tableaux
		while ((record = readerBanniere.read()) != null) {
			Banniere banniere = (Banniere) record;
			bannieres.add(banniere);
		}
		while ((record = readerBeneficiaire.read()) != null) {
			DonneEntrant donneEntrant = (DonneEntrant) record;
			donneEntrants.add(donneEntrant);
		}
		while ((record = readerArticleFin.read()) != null) {
			ArticleFin donneEntrant = (ArticleFin) record;
			articleFins.add(donneEntrant);
		}

		for (Banniere banniere : bannieres) {
			new LanceurFinal().ContruireRepertoire("src/main/resources/FLUX/" + banniere.getEntite());
			BeanWriter out = factory.createWriter("BanniereSendFile", new File(
					"src/main/resources/FLUX/" + banniere.getEntite() + "/" + banniere.getIdentifiant() + "_20191203" + ".txt"));

			out.write(banniere);
			
			for (DonneEntrant donneEntrant : donneEntrants) {

				if (banniere.getIdentifiant().equals(donneEntrant.getIdentifiant())) {

					// Construction de l'objet règlement
					Reglement reglement = new Reglement();
					reglement.setRefEnregistrementReglement(donneEntrant.getRefEnregistrementReglement());
					reglement.setRefReglement(donneEntrant.getRefReglement());
					reglement.setModePaiement(donneEntrant.getModePaiement());
					reglement.setTypeReglement(donneEntrant.getTypeReglement());
					reglement.setLibelleOperation(donneEntrant.getLibelleOperation());
					reglement.setMontantDuReglementEnEuro(donneEntrant.getMontantDuReglementEnEuro());
					reglement.setCodeDevise(donneEntrant.getCodeDevise());
					reglement.setMontantDuReglementEnDevise(donneEntrant.getMontantDuReglementEnDevise());
					reglement.setNombreDecimales(donneEntrant.getNombreDecimales());
					reglement.setIndicateurMontant(donneEntrant.getIndicateurMontant());
					reglement.setDateEcheance(donneEntrant.getDateEcheance());
					reglement.setCodeRegroupement(donneEntrant.getCodeRegroupement());
					reglement.setReferenceEmission(donneEntrant.getReferenceEmission());
					reglement.setZoneReserveeReglement(donneEntrant.getZoneReserveeReglement());
					reglement.setLettrage(donneEntrant.getLettrage());
					reglement.setMotifPaiement(donneEntrant.getMotifPaiement());
					reglement.setCodeEconomique(donneEntrant.getCodeEconomique());
					out.write(reglement);

					// Construction de l'objet bénéficiaire
					Beneficiaire beneficiaire = new Beneficiaire();
					beneficiaire.setRefEnregistrementBeneficiaire(donneEntrant.getRefEnregistrementBeneficiaire());
					beneficiaire.setNumeroBeneficiaire(donneEntrant.getNumeroBeneficiaire());
					beneficiaire.setSiretBeneficiare(donneEntrant.getSiretBeneficiare());
					beneficiaire.setTitreCivile(donneEntrant.getTitreCivile());
					beneficiaire.setNomBeneficiaire(donneEntrant.getNomBeneficiaire());
					beneficiaire.setNomComplementaire(donneEntrant.getNomComplementaire());
					beneficiaire.setZoneReserveeBeneficiaire(donneEntrant.getZoneReserveeBeneficiaire());
					beneficiaire.setNomOrdreCheque(donneEntrant.getNomOrdreCheque());
					beneficiaire.setNomComplementaireOrdreCheque(donneEntrant.getNomComplementaireOrdreCheque());
					beneficiaire.setAdresseBeneficiaire(donneEntrant.getAdresseBeneficiaire());
					beneficiaire
							.setAdresseComplementaireBeneficiaire(donneEntrant.getAdresseComplementaireBeneficiaire());
					beneficiaire.setBureauDistributeurBenef(donneEntrant.getBureauDistributeurBenef());
					beneficiaire.setCodePostalBenef(donneEntrant.getCodePostalBenef());
					beneficiaire.setCodePaysBenef(donneEntrant.getCodePaysBenef());
					beneficiaire.setLibellePaysBenef(donneEntrant.getLibellePaysBenef());
					beneficiaire.setLibelleBanqueBenef(donneEntrant.getLibelleBanqueBenef());
					beneficiaire.setIdentifiantNumeroCompte(donneEntrant.getIdentifiantNumeroCompte());
					beneficiaire.setQualifiantStructureCompte(donneEntrant.getQualifiantStructureCompte());
					beneficiaire.setCodeBic(donneEntrant.getCodeBic());
					out.write(beneficiaire);

					// Construction de l'objet donneur d'ordre initial
					DonneurOrdreInitial donneurOrdreInitial = new DonneurOrdreInitial();
					donneurOrdreInitial.setRefEnregistrementDonneurOrdreInitial(
							donneEntrant.getRefEnregistrementDonneurOrdreInitial());
					donneurOrdreInitial.setNomDonneurOrdre(donneEntrant.getNomDonneurOrdre());
					donneurOrdreInitial.setReferenceDuService(donneEntrant.getReferenceDuService());
					donneurOrdreInitial.setNomService(donneEntrant.getNomService());
					donneurOrdreInitial.setAdresseService(donneEntrant.getAdresseService());
					donneurOrdreInitial.setBureauDistributeurService(donneEntrant.getBureauDistributeurService());
					donneurOrdreInitial.setCodePostalService(donneEntrant.getCodePostalService());
					donneurOrdreInitial.setCodeEtablissementComptable(donneEntrant.getCodeEtablissementComptable());
					donneurOrdreInitial.setCodeEtablissement(donneEntrant.getCodeEtablissement());
					donneurOrdreInitial.setLibelleEtablissement(donneEntrant.getLibelleEtablissement());
					donneurOrdreInitial.setNomResponsable(donneEntrant.getNomResponsable());
					donneurOrdreInitial.setNumeroTelephoneResponsable(donneEntrant.getNumeroTelephoneResponsable());
					donneurOrdreInitial.setEmailResponsable(donneEntrant.getEmailResponsable());
					out.write(donneurOrdreInitial);

//					// Construction de l'objet bénéficiaire final
//					BeneficiaireFinal beneficiaireFinal = new BeneficiaireFinal();
//					beneficiaireFinal.setRefEnregistrementBeneficiaireFinal(
//							donneEntrant.getRefEnregistrementBeneficiaireFinal());
//					beneficiaireFinal.setNumeroBeneficiaireFinal(donneEntrant.getNumeroBeneficiaireFinal());
//					beneficiaireFinal.setNomBeneficiaireFinal(donneEntrant.getNomBeneficiaireFinal());
//					beneficiaireFinal.setAdresseBeneficiaireFinal(donneEntrant.getAdresseBeneficiaireFinal());
//					beneficiaireFinal.setBureauDistributeurBenefFinal(donneEntrant.getBureauDistributeurBenefFinal());
//					beneficiaireFinal.setCodePostalBeneficiaireFinal(donneEntrant.getCodePostalBeneficiaireFinal());
//					beneficiaireFinal.setCodePaysBeneficiaireFinal(donneEntrant.getCodePaysBeneficiaireFinal());
//					beneficiaireFinal.setLibellePaysBeneficiaireFinal(donneEntrant.getLibellePaysBeneficiaireFinal());
//					out.write(beneficiaireFinal);
//
//					// Construction de l'objet Informations complémentaires règlement étranger
//					// (paiement hors euro)
//					InfoComplementaireReg infoComplementaireReg = new InfoComplementaireReg();
//					infoComplementaireReg.setRefEnregistrementInfoComplementaireReg(
//							donneEntrant.getRefEnregistrementInfoComplementaireReg());
//					infoComplementaireReg.setAdresseBanqueEtrangere(donneEntrant.getAdresseBanqueEtrangere());
//					infoComplementaireReg
//							.setBureauDistributeurBanqEtrangere(donneEntrant.getBureauDistributeurBanqEtrangere());
//					infoComplementaireReg.setCodePostalBanqEtrangere(donneEntrant.getCodePostalBanqEtrangere());
//					infoComplementaireReg.setCodePaysBanqEtrangere(donneEntrant.getCodePaysBanqEtrangere());
//					infoComplementaireReg.setLibellePaysBanqEtrangere(donneEntrant.getLibellePaysBanqEtrangere());
//					infoComplementaireReg
//							.setZoneReserveeInfoComplementaireReg(donneEntrant.getZoneReserveeInfoComplementaireReg());
//					out.write(infoComplementaireReg);
//
//					// Construction de l'objet facture
//					Facture facture = new Facture();
//					facture.setRefEnregistrementFacture(donneEntrant.getRefEnregistrementFacture());
//					facture.setNumeroCommande(donneEntrant.getNumeroCommande());
//					facture.setNumeroFactureFournisseur(donneEntrant.getNumeroFactureFournisseur());
//					facture.setTypeFacture(donneEntrant.getTypeFacture());
//					facture.setDateFacture(donneEntrant.getDateFacture());
//					facture.setMontantFactureEuro(donneEntrant.getMontantFactureEuro());
//					out.write(facture);
//
//					// Construction de l'objet déduction
//					Deduction deduction = new Deduction();
//					deduction.setRefEnregistrementDeduction(donneEntrant.getRefEnregistrementDeduction());
//					deduction.setNumeroDeduction(donneEntrant.getNumeroDeduction());
//					deduction.setTypeDeduction(donneEntrant.getTypeDeduction());
//					deduction.setDateDeduction(donneEntrant.getDateDeduction());
//					deduction.setMontantDeductionEuro(donneEntrant.getMontantDeductionEuro());
//					out.write(deduction);
//
//					// Construction de l'objet Créance Débiteur
//					CreanceDebiteur creanceDebiteur = new CreanceDebiteur();
//					creanceDebiteur
//							.setRefEnregistrementCreanceDebiteur(donneEntrant.getRefEnregistrementCreanceDebiteur());
//					creanceDebiteur.setRefCreance(donneEntrant.getRefCreance());
//					creanceDebiteur.setRefCreancier(donneEntrant.getRefCreancier());
//					creanceDebiteur.setLibelleCreance(donneEntrant.getLibelleCreance());
//					creanceDebiteur.setLibelleDetailCreance(donneEntrant.getLibelleDetailCreance());
//					creanceDebiteur.setMontantDetailCreance(donneEntrant.getMontantDetailCreance());
//					creanceDebiteur.setNumeroDebiteur(donneEntrant.getNumeroDebiteur());
//					creanceDebiteur.setNomDebiteur(donneEntrant.getNomDebiteur());
//					out.write(creanceDebiteur);

					// Construction de l'objet Activité
					Activite activite = new Activite();
					activite.setRefEnregistrementActivite(donneEntrant.getRefEnregistrementActivite());
					activite.setCodeBuGl(donneEntrant.getCodeBuGl());
					activite.setCodeDivision(donneEntrant.getCodeDivision());
					activite.setTypeCompteOperation(donneEntrant.getTypeCompteOperation());
					activite.setChamp1Activite(donneEntrant.getChamp1Activite());
					activite.setChamp2Activite(donneEntrant.getChamp2Activite());
					out.write(activite);

//					// Construction de l'objet divers
//					Divers divers = new Divers();
//					divers.setRefEnregistrementDivers(donneEntrant.getRefEnregistrementDivers());
//					divers.setChamp1(donneEntrant.getChamp1());
//					divers.setChamp2(donneEntrant.getChamp2());
//					divers.setChamp3(donneEntrant.getChamp3());
//					divers.setChamp4(donneEntrant.getChamp4());
//					divers.setChamp5(donneEntrant.getChamp5());
//					divers.setChamp6(donneEntrant.getChamp6());
//					divers.setChamp7(donneEntrant.getChamp7());
//					divers.setChamp8(donneEntrant.getChamp8());
//					divers.setChamp9(donneEntrant.getChamp9());
//					divers.setChamp10(donneEntrant.getChamp10());
//					out.write(divers);

				}
			}
			for (ArticleFin articleFin : articleFins) {

				if (banniere.getIdentifiant().equals(articleFin.getIdentifiant()))
					out.write(articleFin);
			}
			out.flush();
			out.close();
		}
	}

	private void ContruireRepertoire(String chemin) {
		Path path = Paths.get(chemin);
		// if directory exists?
		if (!Files.exists(path)) {
			try {
				Files.createDirectories(path);
			} catch (IOException e) {
				// fail to create directory
				e.printStackTrace();
			}
		}
	}

}
