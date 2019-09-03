package fr.scnf.lanceur;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.beanio.BeanReader;
import org.beanio.BeanWriter;
import org.beanio.StreamFactory;

import fr.scnf.model.Activite;
import fr.scnf.model.ArticleFin;
import fr.scnf.model.Banniere;
import fr.scnf.model.Beneficiaire;
import fr.scnf.model.DonneEntrant;
import fr.scnf.model.DonneurOrdreInitial;
import fr.scnf.model.Reglement;

public class Lanceur {

	public static void main(String[] args) {

		// create a BeanIO StreamFactory
		StreamFactory factory = StreamFactory.newInstance();
		// load the mapping file from the working directory
		factory.load("src/main/resources/config.xml");

		// Construction des differentes dates

		SimpleDateFormat formatBannier = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat autreFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String dateFichier = formatBannier.format(date);
		String dateAujourdhui = autreFormat.format(date);
		// Instantiation du map pour stocker les données
		Map<String, List<DonneEntrant>> mapDonneEntrant = new HashMap<>();

		// chargement fichier de lecture cvs
		// read it from the classpath : src/main/resources
		BeanReader reader = factory.createReader("donneEntrant", new File("src/main/resources/input/data.csv"));

		Object record = null;
		List<DonneEntrant> donneEntrants = new ArrayList<>();

		Set<String> listIdentifiants = new HashSet<>();

		// lecture du fichier "data.csv" et le stockage dans les tableaux
		while ((record = reader.read()) != null) {
			DonneEntrant donneEntrant = (DonneEntrant) record;
			donneEntrants.add(donneEntrant);
			listIdentifiants.add(donneEntrant.getIdentifiant());
		}

		// Contruction du map pour classer les objects en fonction des identifiants
		for (String identifiant : listIdentifiants) {
			String key=null;
			List<DonneEntrant> datas = new ArrayList<>();
			for (DonneEntrant donneEntrantTraite : donneEntrants) {

				if (identifiant.equals(donneEntrantTraite.getIdentifiant())) {
					key=identifiant+donneEntrantTraite.getNom();
					datas.add(donneEntrantTraite);
				}
			}
			mapDonneEntrant.put(key, datas);
		}
		//itération sur l'objet map
		for (String identifiant : mapDonneEntrant.keySet()) {
			// create a BeanWriter to write to "output.csv"
			List<DonneEntrant> datas=mapDonneEntrant.get(identifiant);
			new Lanceur().ContruireRepertoire("src/main/resources/"+datas.get(0).getNom());
			
			BeanWriter out = factory.createWriter("BanniereSendFile",
					new File("src/main/resources/"+datas.get(0).getNom()+"/output" + identifiant + ".txt"));
			// Création de l'objet banniere
			Banniere banniere = new Banniere("001");
			banniere.setDateFichier(Integer.valueOf(dateFichier));
			banniere.setIdentifant(identifiant);

			out.write(banniere);
			for (DonneEntrant donneEntrant : mapDonneEntrant.get(identifiant)) {

				// Création des objets reglemenets
				Reglement reglement1 = new Reglement("010");
				reglement1.setDateEcheance(dateAujourdhui);
				reglement1.setMontantDuReglementEnEuro(donneEntrant.getMontantBeneficiciaire());
				out.write(reglement1);

				// Création de l'objet Beneficiaire
				Beneficiaire beneficiaire = new Beneficiaire("020");

				out.write(beneficiaire);
				// Création de l'objet donneur ordre initiale
				DonneurOrdreInitial donneurOrdreInitial = new DonneurOrdreInitial("030");
				out.write(donneurOrdreInitial);
				// Création de l'objet beneficiaire finale
//				BeneficiareFinal beneficiareFinal = new BeneficiareFinal("040");
//				out.write(beneficiareFinal);
//				InfoComplementaireReg infoComplementaireReg = new InfoComplementaireReg("050");
//				out.write(infoComplementaireReg);
				// Création de l'objet de facture
//				Facture facture1 = new Facture("060");
//				facture1.setDateFacture(dateAujourdhui);
//				out.write(facture1);
				// Création de l'objet deduction
//				Deduction deduction1 = new Deduction("070");
//				deduction1.setDateDeduction(dateAujourdhui);
//				out.write(deduction1);

				// Création de la creance debiteur
//				CreanceDebiteur creanceDebiteur = new CreanceDebiteur("080");
//				out.write(creanceDebiteur);
				// Création de l'objet activite
				Activite activite = new Activite("090");
				activite.setCodeDivision(donneEntrant.getCodeDivision());
				out.write(activite);
				// Création de l'objet divers
//				Divers divers = new Divers("100");
//				out.write(divers);

			}
			// Création de l'objet article fin
			ArticleFin articleFin = new ArticleFin("999");
			articleFin.setIdentifiant(identifiant);
			out.write(articleFin);
			out.flush();
			out.close();
		}

	}

	private void ContruireRepertoire(String chemin) {
		 Path path = Paths.get(chemin);
	        //if directory exists?
	        if (!Files.exists(path)) {
	            try {
	                Files.createDirectories(path);
	            } catch (IOException e) {
	                //fail to create directory
	                e.printStackTrace();
	            }
	        }
	}
	
}
