package fr.scnf.lanceur;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		// factory.load("src/main/resources/banniere.xml");
		factory.load("src/main/resources/configuration.xml");
		SimpleDateFormat formatBannier = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat autreFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String dateFichier = formatBannier.format(date);

		String dateAujourdhui = autreFormat.format(date);

		// create a BeanWriter to write to "output.csv"
		BeanWriter out = factory.createWriter("BanniereSendFile", new File("src/main/resources/output" + ".txt"));
		for (int i = 0; i < 2; i++) {
			// Création de l'objet banniere
			Banniere banniere = new Banniere("001");
			banniere.setDateFichier(Integer.valueOf(dateFichier));
			out.write(banniere);
			// Création des objets reglemenets
			Reglement reglement1 = new Reglement("010");
			reglement1.setDateEcheance(dateAujourdhui);
			out.write(reglement1);

			// Création de l'objet Beneficiaire
			Beneficiaire beneficiaire = new Beneficiaire("020");

			out.write(beneficiaire);
			// Création de l'objet donneur ordre initiale
			DonneurOrdreInitial donneurOrdreInitial = new DonneurOrdreInitial("030");
			out.write(donneurOrdreInitial);
			// Création de l'objet beneficiaire finale
			BeneficiareFinal beneficiareFinal = new BeneficiareFinal("040");
			out.write(beneficiareFinal);
			InfoComplementaireReg infoComplementaireReg = new InfoComplementaireReg("050");
			out.write(infoComplementaireReg);
			// Création de l'objet de facture
			Facture facture1 = new Facture("060");
			facture1.setDateFacture(dateAujourdhui);
			out.write(facture1);
			// Création de l'objet deduction
			Deduction deduction1 = new Deduction("070");
			deduction1.setDateDeduction(dateAujourdhui);
			out.write(deduction1);

			// Création de la creance debiteur
			CreanceDebiteur creanceDebiteur = new CreanceDebiteur("080");
			out.write(creanceDebiteur);
			// Création de l'objet activite
			Activite activite = new Activite("090");
			out.write(activite);
			// Création de l'objet divers
			Divers divers = new Divers("100");
			out.write(divers);

			// Création de l'objet article fin
			ArticleFin articleFin = new ArticleFin("999");

			out.write(articleFin);

		}
		out.flush();
		out.close();

	}

}
