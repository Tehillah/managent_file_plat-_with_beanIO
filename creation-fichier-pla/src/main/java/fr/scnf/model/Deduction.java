package fr.scnf.model;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;

public class Deduction {
	private String refEnregistrement;
	private String numeroDeduction;
	private String typeDeduction;
	private String dateDeduction;
	private int montantDeductionEuro;

	public Deduction(String refEnregistrement) {
		super();
		this.refEnregistrement = refEnregistrement;
		this.numeroDeduction = RandomStringUtils.randomAlphanumeric(15);

		this.typeDeduction = RandomStringUtils.randomAlphanumeric(1);

		this.montantDeductionEuro = RandomUtils.nextInt(14);

	}

	public String getRefEnregistrement() {
		return refEnregistrement;
	}

	public void setRefEnregistrement(String refEnregistrement) {
		this.refEnregistrement = refEnregistrement;
	}

	public String getNumeroDeduction() {
		return numeroDeduction;
	}

	public void setNumeroDeduction(String numeroDeduction) {
		this.numeroDeduction = numeroDeduction;
	}

	public String getTypeDeduction() {
		return typeDeduction;
	}

	public void setTypeDeduction(String typeDeduction) {
		this.typeDeduction = typeDeduction;
	}

	public int getMontantDeductionEuro() {
		return montantDeductionEuro;
	}

	public void setMontantDeductionEuro(int montantDeductionEuro) {
		this.montantDeductionEuro = montantDeductionEuro;
	}

	public String getDateDeduction() {
		return dateDeduction;
	}

	public void setDateDeduction(String dateDeduction) {
		this.dateDeduction = dateDeduction;
	}

}
