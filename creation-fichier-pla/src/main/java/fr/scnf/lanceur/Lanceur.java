package fr.scnf.lanceur;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.beanio.BeanWriter;
import org.beanio.StreamFactory;

import fr.scnf.model.Activite;
import fr.scnf.model.ArticleFin;
import fr.scnf.model.Banniere;
import fr.scnf.model.Beneficiaire;
import fr.scnf.model.DonneurOrdreInitial;
import fr.scnf.model.Reglement;

public class Lanceur {

	public static void main(String[] args) {

		// create a BeanIO StreamFactory
		StreamFactory factory = StreamFactory.newInstance();
		// load the mapping file from the working directory
		// factory.load("src/main/resources/banniere.xml");
		factory.load("src/main/resources/config.xml");
		SimpleDateFormat formatBannier = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat autreFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String dateFichier = formatBannier.format(date);

		String dateAujourdhui = autreFormat.format(date);

		Map<String, List<String>> codeIdentifiant = new HashMap<>();

		codeIdentifiant.put("ADFR", Arrays.asList("0150000768", "0150000770"));
		codeIdentifiant.put("ANDFFR", Arrays.asList("1007301308", "1007301309"));
		codeIdentifiant.put("PFFR", Arrays.asList("1007519051", "1007519053"));
		codeIdentifiant.put("SPFR", Arrays.asList("1234565227", "1234565228"));
		codeIdentifiant.put("SMFR", Arrays.asList("1333519595", "1333500617"));
		codeIdentifiant.put("RPPUFR", Arrays.asList("1334019592", "1334066613"));
		
		codeIdentifiant.put("ADGC", Arrays.asList("1334200952", "1334300013"));
		codeIdentifiant.put("ANDFGC", Arrays.asList("1334500001", "1334500002"));
		codeIdentifiant.put("PFGC", Arrays.asList("1339595760", "1340000674"));
		codeIdentifiant.put("SPGC", Arrays.asList("1340102141", "1340102142"));
		codeIdentifiant.put("SMGC", Arrays.asList("1340202135", "1340202136"));
		codeIdentifiant.put("RPPUGC", Arrays.asList("3025400665", "3025400666"));
		
		codeIdentifiant.put("ADHO", Arrays.asList("6615766158", "6615766159"));
		codeIdentifiant.put("ANDFHO", Arrays.asList("6615766160", "6615766161"));
		codeIdentifiant.put("PFHO", Arrays.asList("1340502124", "1340502125"));
		codeIdentifiant.put("SPHO", Arrays.asList("1340502126", "1340502127"));
		codeIdentifiant.put("SMHO", Arrays.asList("1340502128", "1340502129"));
		codeIdentifiant.put("RPPUHO", Arrays.asList("1340502130", "1340202135"));
		
		codeIdentifiant.put("ADNM", Arrays.asList("1007318979", "1007300342"));
		codeIdentifiant.put("ANDFNM", Arrays.asList("1334019522", "1334001663"));
		codeIdentifiant.put("PFNM", Arrays.asList("1007519009", "1007519021"));
		codeIdentifiant.put("SPNM", Arrays.asList("1334300011", "1334300012"));
		codeIdentifiant.put("SMNM", Arrays.asList("0150018974", "0150018974"));
		codeIdentifiant.put("RPPUNM", Arrays.asList("0150000773", "0150000774"));
		
		codeIdentifiant.put("ADR", Arrays.asList("1334564882", "1334565346"));
		codeIdentifiant.put("BPADR", Arrays.asList("1334536115", "1334536117"));
		codeIdentifiant.put("PFR", Arrays.asList("1334536112", "1334536113"));
		codeIdentifiant.put("SPR", Arrays.asList("1334519606", "1334520863"));
		codeIdentifiant.put("SMR", Arrays.asList("1334516937", "1334516847"));
		codeIdentifiant.put("RPLRDIR", Arrays.asList("1334500003", "1334510079"));
		
		codeIdentifiant.put("ADMO", Arrays.asList("0150018974", "0150000768"));
		codeIdentifiant.put("ANDFM", Arrays.asList("0150000770", "0150000772"));
		codeIdentifiant.put("RMMO", Arrays.asList("0150000773", "0150000774"));
		codeIdentifiant.put("SPMO", Arrays.asList("0150000775", "0150000776"));
		codeIdentifiant.put("SENMO", Arrays.asList("0150000778", "0150000779"));
		codeIdentifiant.put("RPPUM", Arrays.asList("0150018954", "0150018967"));
		
		codeIdentifiant.put("ADT", Arrays.asList("1340402120", "1340402121"));
		codeIdentifiant.put("ANDFT", Arrays.asList("1340402122", "1334300011"));
		codeIdentifiant.put("OPPOT", Arrays.asList("1334300012", "1334300013"));
		codeIdentifiant.put("SPT", Arrays.asList("1007300342", "1007301308"));
		codeIdentifiant.put("RMT", Arrays.asList("1007301309", "1007301310"));
		codeIdentifiant.put("RPPUT", Arrays.asList("1007301311", "1007318962"));

		for (String identifiant : codeIdentifiant.keySet()) {
			// create a BeanWriter to write to "output.csv"
			BeanWriter out = factory.createWriter("BanniereSendFile",
					new File("src/main/resources/output" + identifiant + ".txt"));
			// Création de l'objet banniere
			Banniere banniere = new Banniere("001");
			banniere.setDateFichier(Integer.valueOf(dateFichier));
			banniere.setIdentifant(identifiant);
			
			out.write(banniere);
			for (String codeDivision : codeIdentifiant.get(identifiant)) {

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
				activite.setCodeDivision(codeDivision);
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

}
