package fr.scnf.model;

public class Activite {
	private String refEnregistrementActivite;
	private String codeBuGl;
	private String codeDivision;
	private String typeCompteOperation;
	private String champ1Activite;
	private String champ2Activite;

	private Divers divers;

	public Activite() {
		super();
	}

	public Divers getDivers() {
		return divers;
	}

	public void setDivers(Divers divers) {
		this.divers = divers;
	}

	public String getRefEnregistrementActivite() {
		return refEnregistrementActivite;
	}

	public void setRefEnregistrementActivite(String refEnregistrementActivite) {
		this.refEnregistrementActivite = refEnregistrementActivite;
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

	public String getChamp1Activite() {
		return champ1Activite;
	}

	public void setChamp1Activite(String champ1Activite) {
		this.champ1Activite = champ1Activite;
	}

	public String getChamp2Activite() {
		return champ2Activite;
	}

	public void setChamp2Activite(String champ2Activite) {
		this.champ2Activite = champ2Activite;
	}

}
