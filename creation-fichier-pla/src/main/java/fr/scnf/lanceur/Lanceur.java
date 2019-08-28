package fr.scnf.lanceur;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.beanio.BeanWriter;
import org.beanio.StreamFactory;

import fr.scnf.model.Activite;
import fr.scnf.model.ArticleFin;
import fr.scnf.model.Banniere;
import fr.scnf.model.Beneficiaire;
import fr.scnf.model.BeneficiareFinal;
import fr.scnf.model.CreanceDebiteur;
import fr.scnf.model.Deduction;
import fr.scnf.model.Divers;
import fr.scnf.model.DonneurOrdreInitial;
import fr.scnf.model.Facture;
import fr.scnf.model.InfoComplementaireReg;
import fr.scnf.model.Reglement;

public class Lanceur {

	public static void main(String[] args) {

		// create a BeanIO StreamFactory
		StreamFactory factory = StreamFactory.newInstance();
		// load the mapping file from the working directory
		factory.load("src/main/resources/banniere.xml");
		Date date = new Date();
		// create a BeanWriter to write to "output.csv"
		BeanWriter out = factory.createWriter("BanniereSendFile", new File("src/main/resources/" + date + ".txt"));
		for (int i = 0; i < 50; i++) {
			String refEnregistrement = RandomStringUtils.randomAlphanumeric(3);
			Banniere banniere = new Banniere(refEnregistrement);

			// Beneficiaire
			Beneficiaire beneficiaire = new Beneficiaire(refEnregistrement);

			DonneurOrdreInitial donneurOrdreInitial = new DonneurOrdreInitial(refEnregistrement);
			BeneficiareFinal beneficiareFinal = new BeneficiareFinal(refEnregistrement);
			InfoComplementaireReg infoComplementaireReg = new InfoComplementaireReg(refEnregistrement);
			Facture facture1 = new Facture(refEnregistrement);
			Facture facture2 = new Facture(refEnregistrement);
			Deduction deduction1 = new Deduction(refEnregistrement);
			Deduction deduction2 = new Deduction(refEnregistrement);

			List<Deduction> deductions1 = new ArrayList<Deduction>();
			List<Deduction> deductions2 = new ArrayList<Deduction>();
			deductions1.add(deduction1);
			deductions2.add(deduction2);
			facture1.setDeductions(deductions1);
			facture2.setDeductions(deductions2);
			List<Facture> factures = new ArrayList<Facture>();
			factures.add(facture1);
			factures.add(facture2);

			CreanceDebiteur creanceDebiteur = new CreanceDebiteur(refEnregistrement);
			List<CreanceDebiteur> creanceDebiteurs = new ArrayList<CreanceDebiteur>();
			creanceDebiteurs.add(creanceDebiteur);

			beneficiaire.setDonneurOrdreInitial(donneurOrdreInitial);
			beneficiaire.setBeneficiareFinal(beneficiareFinal);
			beneficiaire.setInfoComplementaireReg(infoComplementaireReg);
			beneficiaire.setFactures(factures);
			beneficiaire.setCreanceDebiteurs(creanceDebiteurs);

			Divers divers = new Divers(refEnregistrement);
			Activite activite = new Activite(refEnregistrement);
			activite.setDivers(divers);
			beneficiaire.setActivite(activite);

			// Liste des objets reglemenets
			Reglement reglement1 = new Reglement(refEnregistrement);
			reglement1.setBeneficiaire(beneficiaire);
			Reglement reglement2 = new Reglement(refEnregistrement);
			reglement2.setBeneficiaire(beneficiaire);
			List<Reglement> listReglement = new ArrayList<Reglement>();
			listReglement.add(reglement1);
			listReglement.add(reglement2);
			banniere.setReglements(listReglement);
			ArticleFin articleFin = new ArticleFin(refEnregistrement);

			banniere.setArticleFin(articleFin);
			out.write(banniere);
		}
		out.flush();
		out.close();

	}

}
