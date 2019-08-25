package fr.scnf.lanceur;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.beanio.BeanWriter;
import org.beanio.StreamFactory;

import fr.scnf.model.Banniere;
import fr.scnf.model.Reglement;

public class Lanceur {

	public static void main(String[] args) {

		// create a BeanIO StreamFactory
		StreamFactory factory = StreamFactory.newInstance();
		// load the mapping file from the working directory
		factory.load("src/main/resources/banniere.xml");

		// create a BeanWriter to write to "output.csv"
		BeanWriter out = factory.createWriter("BanniereSendFile", new File("src/main/resources/output.txt"));
		Banniere banniere = new Banniere();
		banniere.setDateFichier(RandomUtils.nextInt(6));
		banniere.setIdentifant(RandomStringUtils.randomAlphanumeric(10));
		banniere.setNombreEnregistrement(RandomUtils.nextInt(8));
		banniere.setNumeroFichier(RandomUtils.nextInt(10));
		banniere.setNumeroversion(RandomStringUtils.randomAlphanumeric(3));
		banniere.setRefEnregistrement(RandomStringUtils.randomAlphanumeric(3));

		Reglement reglement1 = new Reglement();
		reglement1.setDateFichier(RandomUtils.nextInt(6));
//		reglement1.setIdentifant(RandomStringUtils.randomAlphanumeric(10));
		reglement1.setIdentifant(banniere.getIdentifant());
		reglement1.setNumeroFichier(RandomUtils.nextInt(10));
		reglement1.setRefEnregistrement(RandomStringUtils.randomAlphanumeric(3));

		Reglement reglement2 = new Reglement();
		reglement2.setDateFichier(RandomUtils.nextInt(6));
//		reglement2.setIdentifant(RandomStringUtils.randomAlphanumeric(10));
		reglement2.setIdentifant(banniere.getIdentifant());
		reglement2.setNumeroFichier(RandomUtils.nextInt(10));
		reglement2.setRefEnregistrement(RandomStringUtils.randomAlphanumeric(3));
		List<Reglement> listReglement = new ArrayList<Reglement>();
		listReglement.add(reglement1);
		listReglement.add(reglement2);
		banniere.setListReglement(listReglement);
		out.write(banniere);

		out.flush();
		out.close();

	}

}
