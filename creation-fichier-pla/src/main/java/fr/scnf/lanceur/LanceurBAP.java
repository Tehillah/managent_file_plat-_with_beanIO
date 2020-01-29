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

import fr.scnf.model.ArticleDetail;
import fr.scnf.model.ArticleFinBAP;
import fr.scnf.model.BanniereBAP;
import fr.scnf.model.FluxDeReglement;
import fr.scnf.model.ModePaiement;

public class LanceurBAP {

	public static void main(String[] args) {
		
		// create a BeanIO StreamFactory
		StreamFactory factory = StreamFactory.newInstance();
		// load the mapping file from the working directory
		factory.load("src\\main\\resources\\configBAP.xml");
		
		// Chargement de fichiers de lecture .csv
		// Read it from the classpath : src/main/resources
		BeanReader readerBanniereBAP = factory.createReader("banniereBAP", new File ("src/main/resources/input/data-banniere-BAP.csv"));
		
		BeanReader readerArticleDetail = factory.createReader("articleDetail", new File ("src/main/resources/input/data-articleDetail-BAP.csv"));
		
		BeanReader readerArticleFinBAP = factory.createReader("articleFinBAP", new File ("src/main/resources/input/data-articleFin-BAP.csv"));
		
		Object record = null;
		List<BanniereBAP> banniereBAPs = new ArrayList <> () ;
		List<ArticleDetail> articleDetails = new ArrayList <> () ;
		List<ArticleFinBAP> articleFinBAPs = new ArrayList <> () ;
		
		// lecture du fichier "dataBAP.csv" et le stockage dans les tableaux
		
		while ((record = readerBanniereBAP.read()) != null) {
			BanniereBAP banniereBAP = (BanniereBAP) record;
			banniereBAPs.add(banniereBAP);
		}
		
		while ((record = readerArticleDetail.read()) != null) {
			ArticleDetail articleDetail = (ArticleDetail) record;
			articleDetails.add(articleDetail);
		}
		
		while ((record = readerArticleFinBAP.read()) != null) {
			ArticleFinBAP articleFinBAP = (ArticleFinBAP) record;
			articleFinBAPs.add(articleFinBAP);
		}
		
		for (BanniereBAP banniereBAP : banniereBAPs) {
			new LanceurBAP().ConstruireRepertoire("src/main/resources/BAP/" +banniereBAP.getEntite()+"-BAP");
			BeanWriter out = factory.createWriter("BanniereSendFile", new File("src/main/resources/BAP/" + banniereBAP.getEntite()+"-BAP" + "/" + banniereBAP.getIdentifiant() + "_20191203" + ".txt"));
			out.write(banniereBAP);
			
			for (ArticleDetail articleDetail : articleDetails) {
				
				if (banniereBAP.getIdentifiant().equals(articleDetail.getIdentifiant())) {
					
					// Construction de l'objet Flux de Règlement
					FluxDeReglement fluxDeReglement = new FluxDeReglement();
					fluxDeReglement.setRefEnregistrementReglement(articleDetail.getRefEnregistrementReglement());
					fluxDeReglement.setIdentifiantFluxReglement(articleDetail.getIdentifiantFluxReglement());
					fluxDeReglement.setNumeroFichier(articleDetail.getNumeroFichier());
					fluxDeReglement.setNombreTotalReglements(articleDetail.getNombreTotalReglements());
					fluxDeReglement.setMontantTotalReglements(articleDetail.getMontantTotalReglements());
					out.write(fluxDeReglement);
					
					// Construction de l'objet Mode de Paiement
					ModePaiement modePaiement = new ModePaiement();
					modePaiement.setRefEnregistrementModePaiement(articleDetail.getRefEnregistrementModePaiement());
					modePaiement.setModePaiement(articleDetail.getModePaiement());
					modePaiement.setTypeReglement(articleDetail.getTypeReglement());
					modePaiement.setLibelleModePaiementParTypeReglement(articleDetail.getLibelleModePaiementParTypeReglement());
					modePaiement.setNombreTotalReglements(articleDetail.getNombreTotalReglements());
					modePaiement.setMontantTotalReglements(articleDetail.getMontantTotalReglements());
					out.write(modePaiement);
										
				}				
			}
		
			for(ArticleFinBAP articleFinBAP : articleFinBAPs) {
				
				if (banniereBAP.getIdentifiant().equals(articleFinBAP.getIdentifiant())) {
					out.write(articleFinBAP);	
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
