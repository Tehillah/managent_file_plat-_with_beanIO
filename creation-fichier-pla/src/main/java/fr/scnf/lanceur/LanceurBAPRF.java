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
import fr.scnf.model.ArticleFinBAPRF;
import fr.scnf.model.BanniereBAPRF;
import fr.scnf.model.FichierPaiementBAPRF;
import fr.scnf.model.ModePaiementBAPRF;

public class LanceurBAPRF {

	public static void main(String[] args) {
		
		// create a BeanIO StreamFactory
		StreamFactory factory = StreamFactory.newInstance();
		// load the mapping file from the working directory
		factory.load("src\\main\\resources\\configBAPRF.xml");
		
		// Chargement de fichiers de lecture .csv
		// Read it from the classpath : src/main/resources
		BeanReader readerBanniereBAPRF = factory.createReader("banniereBAPRF", new File ("src/main/resources/input/data-banniere-BAPRF.csv"));
		
		BeanReader readerFichierPaiementBAPRF = factory.createReader("fichierPaiementBAPRF", new File ("src/main/resources/input/data-fichierPaiement-BAPRF.csv"));
		
		BeanReader readerModePaiementBAPRF = factory.createReader("modePaiementBAPRF", new File ("src/main/resources/input/data-modePaiement-BAPRF.csv"));
		
		BeanReader readerArticleFinBAPRF = factory.createReader("articleFinBAPRF", new File ("src/main/resources/input/data-articleFin-BAPRF.csv"));
		
		
		Object record = null;
		List<BanniereBAPRF> banniereBAPRFs = new ArrayList <> () ;
		List<FichierPaiementBAPRF> fichierPaiementBAPRFs = new ArrayList <> () ;
		List<ModePaiementBAPRF> modePaiementBAPRFs = new ArrayList <> () ;
		List<ArticleFinBAPRF> articleFinBAPRFs = new ArrayList <> () ;
		
		// lecture du fichier "dataBAPRF.csv" et le stockage dans les tableaux
		
		while ((record = readerBanniereBAPRF.read()) != null) {
			BanniereBAPRF banniereBAPRF = (BanniereBAPRF) record;
			banniereBAPRFs.add(banniereBAPRF);
		}
		
		while ((record = readerFichierPaiementBAPRF.read()) != null) {
			FichierPaiementBAPRF fichierPaiementBAPRF = (FichierPaiementBAPRF) record;
			fichierPaiementBAPRFs.add(fichierPaiementBAPRF);
		}
		
		while ((record = readerModePaiementBAPRF.read()) != null) {
			ModePaiementBAPRF modePaiementBAPRF = (ModePaiementBAPRF) record;
			modePaiementBAPRFs.add(modePaiementBAPRF);
		}
		
		while ((record = readerArticleFinBAPRF.read()) != null) {
			ArticleFinBAPRF articleFinBAPRF = (ArticleFinBAPRF) record;
			articleFinBAPRFs.add(articleFinBAPRF);
		}
		
		
		for (BanniereBAPRF banniereBAPRF : banniereBAPRFs) {
			new LanceurBAPRF().ConstruireRepertoire("src/main/resources/BAPRF/" +banniereBAPRF.getEntite()+"-BAPRF");
			BeanWriter out = factory.createWriter("BanniereSendFile", new File("src/main/resources/BAPRF/" + banniereBAPRF.getEntite()+"-BAPRF" + "/" + banniereBAPRF.getIdentifiant() + "_20191203" + ".txt"));
			out.write(banniereBAPRF);
			
			
			for (FichierPaiementBAPRF fichierPaiementBAPRF : fichierPaiementBAPRFs) {
				
				if (banniereBAPRF.getIdentifiant().equals(fichierPaiementBAPRF.getIdentifiant())) {					
					// Construction de l'objet Fichier de Paiement BAPRF
					out.write(fichierPaiementBAPRF);
				}				
			}
			
			
			for (ModePaiementBAPRF modePaiementBAPRF : modePaiementBAPRFs) {	
				if (banniereBAPRF.getIdentifiant().equals(modePaiementBAPRF.getIdentifiant())) {
					out.write(modePaiementBAPRF);
				}
			}
			
			
			for(ArticleFinBAPRF articleFinBAPRF : articleFinBAPRFs) {				
				if (banniereBAPRF.getIdentifiant().equals(articleFinBAPRF.getIdentifiant())) {
					out.write(articleFinBAPRF);	
				}						
			}
			
			out.flush();
			out.close();	
		}
		
	}

	
	private void ConstruireRepertoire(String chemin) {
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
