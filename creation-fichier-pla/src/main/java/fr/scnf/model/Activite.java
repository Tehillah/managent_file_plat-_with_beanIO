package fr.scnf.model;

import org.apache.commons.lang.RandomStringUtils;

public class Activite {
	private String refEnregistrement;
	private String codeBuGl;
	private String codeDivision;
	private String typeCompteOperation;
	private String champs1;
	private String champs2;
	private Divers divers;

	public Activite(String refEnregistrement) {
		super();
		this.refEnregistrement = refEnregistrement;
//		this.codeBuGl = RandomStringUtils.randomAlphanumeric(5);

//		this.codeDivision = RandomStringUtils.randomAlphanumeric(5);

		this.typeCompteOperation = RandomStringUtils.randomAlphanumeric(3);

		this.champs1 = RandomStringUtils.randomAlphanumeric(10);

		this.champs2 = RandomStringUtils.randomAlphanumeric(10);

	}

	public Divers getDivers() {
		return divers;
	}

	public void setDivers(Divers divers) {
		this.divers = divers;
	}

	public String getRefEnregistrement() {
		return refEnregistrement;
	}

	public void setRefEnregistrement(String refEnregistrement) {
		this.refEnregistrement = refEnregistrement;
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

	public String getChamps1() {
		return champs1;
	}

	public void setChamps1(String champs1) {
		this.champs1 = champs1;
	}

	public String getChamps2() {
		return champs2;
	}

	public void setChamps2(String champs2) {
		this.champs2 = champs2;
	}

}
