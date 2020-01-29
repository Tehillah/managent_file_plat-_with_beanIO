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
import fr.scnf.model.ArticleDetailRF;
import fr.scnf.model.ArticleFinBAP;
import fr.scnf.model.ArticleFinRF;
import fr.scnf.model.BanniereBAP;
import fr.scnf.model.BanniereRF;
import fr.scnf.model.BeneficiaireRF;
import fr.scnf.model.DeductionRF;
import fr.scnf.model.FactureRF;
import fr.scnf.model.FluxDeReglement;
import fr.scnf.model.FournisseurOrigineRF;
import fr.scnf.model.InfoComplRgltEtrangerRF;
import fr.scnf.model.ModePaiement;
import fr.scnf.model.ReglementRF;

public class LanceurRF {

	public static void main(String[] args) {
		
		// create a BeanIO StreamFactory
		StreamFactory factory = StreamFactory.newInstance();
		// load the mapping file from the working directory
		factory.load("src\\main\\resources\\configRF.xml");
		
		// Chargement de fichiers de lecture .csv
		// Read it from the classpath : src/main/resources
		BeanReader readerBanniereRF = factory.createReader("banniereRF", new File ("src/main/resources/input/data-banniere-RF.csv"));
				
		BeanReader readerArticleDetailRF = factory.createReader("articleDetailRF", new File ("src/main/resources/input/data-articleDetail-RF.csv"));
				
		BeanReader readerArticleFinRF = factory.createReader("articleFinRF", new File ("src/main/resources/input/data-articleFin-RF.csv"));
					
		Object record = null;
		List<BanniereRF> banniereRFs = new ArrayList <> () ;
		List<ArticleDetailRF> articleDetailRFs = new ArrayList <> () ;
		List<ArticleFinRF> articleFinRFs = new ArrayList <> () ;
		
		// lecture du fichier "dataRF.csv" et le stockage dans les tableaux
		
		while ((record = readerBanniereRF.read()) != null) {
			BanniereRF banniereRF = (BanniereRF) record;
			banniereRFs.add(banniereRF);
		}
		
		while ((record = readerArticleDetailRF.read()) != null) {
			ArticleDetailRF articleDetailRF = (ArticleDetailRF) record;
			articleDetailRFs.add(articleDetailRF);
		}
		
		while ((record = readerArticleFinRF.read()) != null) {
			ArticleFinRF articleFinRF = (ArticleFinRF) record;
			articleFinRFs.add(articleFinRF);
		}
		
		for (BanniereRF banniereRF : banniereRFs) {
			new LanceurRF().ConstruireRepertoire("src/main/resources/RF/" +banniereRF.getEntite()+"-RF");
			BeanWriter out = factory.createWriter("BanniereSendFile", new File("src/main/resources/RF/" + banniereRF.getEntite()+"-RF" + "/" + banniereRF.getIdentifiant() + "_20191203" + ".txt"));
			out.write(banniereRF);
			
			for (ArticleDetailRF articleDetailRF : articleDetailRFs) {
				
				if (banniereRF.getIdentifiant().equals(articleDetailRF.getIdentifiant())) {
					
					// Construction de l'objet RèglementRF
					ReglementRF reglementRF = new ReglementRF();
					reglementRF.setRefEnregistrementReglement(articleDetailRF.getRefEnregistrementReglement());
					reglementRF.setReferenceReglement(articleDetailRF.getReferenceReglement());
					reglementRF.setRefPaiementExterne(articleDetailRF.getRefPaiementExterne());
					reglementRF.setModePaiement(articleDetailRF.getModePaiement());
					reglementRF.setMontantReglementEuro(articleDetailRF.getMontantReglementEuro());
					reglementRF.setCodeDeviseReglement(articleDetailRF.getCodeDeviseReglement());
					reglementRF.setMontantReglementDevise(articleDetailRF.getMontantReglementDevise());
					reglementRF.setQualifiantDevise(articleDetailRF.getQualifiantDevise());
					reglementRF.setDateEmissionCheque(articleDetailRF.getDateEmissionCheque());
					reglementRF.setDateEcheance(articleDetailRF.getDateEcheance());
					reglementRF.setBusinessUnit(articleDetailRF.getBusinessUnit());
					reglementRF.setCleLettrage(articleDetailRF.getCleLettrage());
					reglementRF.setCodeBUGL(articleDetailRF.getCodeBUGL());
					reglementRF.setCodeDivision(articleDetailRF.getCodeDivision());
					reglementRF.setTypeCompteOperation(articleDetailRF.getTypeCompteOperation());
					out.write(reglementRF);
					
					// Construction de l'objet BeneficiaireRF
					BeneficiaireRF beneficiaireRF = new BeneficiaireRF();
					beneficiaireRF.setRefEnregistrementBeneficiaire(articleDetailRF.getRefEnregistrementBeneficiaire());
					beneficiaireRF.setCodeBeneficiaireSIC(articleDetailRF.getCodeBeneficiaireSIC());
					beneficiaireRF.setCodeBeneficiairePS(articleDetailRF.getCodeBeneficiairePS());
					beneficiaireRF.setNomBeneficiaire(articleDetailRF.getNomBeneficiaire());
					beneficiaireRF.setSiretBeneficiaire(articleDetailRF.getSiretBeneficiaire());
					beneficiaireRF.setAdresseBeneficiaire(articleDetailRF.getAdresseBeneficiaire());
					beneficiaireRF.setBureauDistributeurBeneficiaire(articleDetailRF.getBureauDistributeurBeneficiaire());
					beneficiaireRF.setCodePostalBeneficiaire(articleDetailRF.getCodePostalBeneficiaire());
					beneficiaireRF.setCodePaysBeneficiaire(articleDetailRF.getCodePaysBeneficiaire());
					beneficiaireRF.setLibellePaysBeneficiaire(articleDetailRF.getLibellePaysBeneficiaire());
					beneficiaireRF.setLibelleBanqueBeneficiaire(articleDetailRF.getLibelleBanqueBeneficiaire());
					beneficiaireRF.setIdentifiantNumeroCompte(articleDetailRF.getIdentifiantNumeroCompte());
					beneficiaireRF.setQualifiantStructureCompte(articleDetailRF.getQualifiantStructureCompte());
					beneficiaireRF.setCodeBicSWIFT(articleDetailRF.getCodeBicSWIFT());
					out.write(beneficiaireRF);
										
					// Construction de l'objet FournisseurOrigineRF
					FournisseurOrigineRF fournisseurOrigineRF = new FournisseurOrigineRF();
					fournisseurOrigineRF.setRefEnregistrementFournisseurOrigine(articleDetailRF.getRefEnregistrementFournisseurOrigine());
					fournisseurOrigineRF.setCodeFournisseurOrigineSIC(articleDetailRF.getCodeFournisseurOrigineSIC());
					fournisseurOrigineRF.setCodeFournisseurOriginePS(articleDetailRF.getCodeFournisseurOriginePS());
					fournisseurOrigineRF.setNomFournisseurOrigine(articleDetailRF.getNomFournisseurOrigine());
					fournisseurOrigineRF.setAdresseFournisseurOrigine(articleDetailRF.getAdresseFournisseurOrigine());
					fournisseurOrigineRF.setBureauDistributeurFournisseurOrigine(articleDetailRF.getBureauDistributeurFournisseurOrigine());
					fournisseurOrigineRF.setCodePostalFournisseurOrigine(articleDetailRF.getCodePostalFournisseurOrigine());
					fournisseurOrigineRF.setCodePaysFournisseurOrigine(articleDetailRF.getCodePaysFournisseurOrigine());
					fournisseurOrigineRF.setLibellePaysFournisseurOrigine(articleDetailRF.getLibellePaysFournisseurOrigine());
					out.write(fournisseurOrigineRF);
					
					// Construction de l'objet InfoComplRgltEtrangerRF
					InfoComplRgltEtrangerRF infoComplRgltEtrangerRF = new InfoComplRgltEtrangerRF();
					infoComplRgltEtrangerRF.setRefEnregistrementInfoComplRegltEtranger(articleDetailRF.getRefEnregistrementInfoComplRegltEtranger());
					infoComplRgltEtrangerRF.setFiller(articleDetailRF.getFiller());
					infoComplRgltEtrangerRF.setAdresseBanqueEtrangere(articleDetailRF.getAdresseBanqueEtrangere());
					infoComplRgltEtrangerRF.setBureauDistributeurBanqueEtrangere(articleDetailRF.getBureauDistributeurBanqueEtrangere());
					infoComplRgltEtrangerRF.setCodePostalBanqueEtrangere(articleDetailRF.getCodePostalBanqueEtrangere());
					infoComplRgltEtrangerRF.setCodePaysBanqueEtrangere(articleDetailRF.getCodePaysBanqueEtrangere());
					infoComplRgltEtrangerRF.setLibellePaysBanqueEtrangere(articleDetailRF.getLibellePaysBanqueEtrangere());
					infoComplRgltEtrangerRF.setCodeEconomiqueBalancePaiement(articleDetailRF.getCodeEconomiqueBalancePaiement());
					out.write(infoComplRgltEtrangerRF);
					
					// Construction de l'objet FactureRF
					FactureRF factureRF = new FactureRF();
					factureRF.setRefEnregistrementFacture(articleDetailRF.getRefEnregistrementFacture());
					factureRF.setNumeroCommande(articleDetailRF.getNumeroCommande());
					factureRF.setNumeroFactureFournisseur(articleDetailRF.getNumeroFactureFournisseur());
					factureRF.setCodeTypeReglementFacture(articleDetailRF.getCodeTypeReglementFacture());
					factureRF.setDateFacture(articleDetailRF.getDateFacture());
					factureRF.setMontantFactureEuro(articleDetailRF.getMontantFactureEuro());
					out.write(factureRF);
					
					// Construction de l'objet DeductionRF
					DeductionRF deductionRF = new DeductionRF();
					deductionRF.setRefEnregistrementDeduction(articleDetailRF.getRefEnregistrementDeduction());
					deductionRF.setNumeroDeductionFournisseur(articleDetailRF.getNumeroDeductionFournisseur());
					deductionRF.setCodeTypeReglementDeduction(articleDetailRF.getCodeTypeReglementDeduction());
					deductionRF.setDateDeduction(articleDetailRF.getDateDeduction());
					deductionRF.setMontantDeductionEuro(articleDetailRF.getMontantDeductionEuro());
					out.write(deductionRF);
					
					
				}				
			}
		
			for(ArticleFinRF articleFinRF : articleFinRFs) {
				
				if (banniereRF.getIdentifiant().equals(articleFinRF.getIdentifiant())) {
					out.write(articleFinRF);	
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
