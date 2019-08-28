package fr.scnf.model;

import org.apache.commons.lang.RandomStringUtils;

public class Divers {
	private String refEnregistrement;
	private String champs1;
	private String champs2;
	private String champs3;
	private String champs4;
	private String champs5;
	private String champs6;
	private String champs7;
	private String champs8;
	private String champs9;
	private String champs10;

	public Divers(String refEnregistrement) {
		super();
		this.refEnregistrement = refEnregistrement;
		this.champs1 = RandomStringUtils.randomAlphanumeric(30);
		this.champs2 = RandomStringUtils.randomAlphanumeric(30);
		this.champs3 = RandomStringUtils.randomAlphanumeric(30);
		this.champs4 = RandomStringUtils.randomAlphanumeric(30);
		this.champs5 = RandomStringUtils.randomAlphanumeric(30);
		this.champs6 = RandomStringUtils.randomAlphanumeric(30);
		this.champs7 = RandomStringUtils.randomAlphanumeric(30);
		this.champs8 = RandomStringUtils.randomAlphanumeric(30);
		this.champs9 = RandomStringUtils.randomAlphanumeric(30);
		this.champs10 = RandomStringUtils.randomAlphanumeric(30);
	}

	public String getRefEnregistrement() {
		return refEnregistrement;
	}

	public void setRefEnregistrement(String refEnregistrement) {
		this.refEnregistrement = refEnregistrement;
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

	public String getChamps3() {
		return champs3;
	}

	public void setChamps3(String champs3) {
		this.champs3 = champs3;
	}

	public String getChamps4() {
		return champs4;
	}

	public void setChamps4(String champs4) {
		this.champs4 = champs4;
	}

	public String getChamps5() {
		return champs5;
	}

	public void setChamps5(String champs5) {
		this.champs5 = champs5;
	}

	public String getChamps6() {
		return champs6;
	}

	public void setChamps6(String champs6) {
		this.champs6 = champs6;
	}

	public String getChamps7() {
		return champs7;
	}

	public void setChamps7(String champs7) {
		this.champs7 = champs7;
	}

	public String getChamps8() {
		return champs8;
	}

	public void setChamps8(String champs8) {
		this.champs8 = champs8;
	}

	public String getChamps9() {
		return champs9;
	}

	public void setChamps9(String champs9) {
		this.champs9 = champs9;
	}

	public String getChamps10() {
		return champs10;
	}

	public void setChamps10(String champs10) {
		this.champs10 = champs10;
	}

}
