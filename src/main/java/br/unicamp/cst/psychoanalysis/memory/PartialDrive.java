package br.unicamp.cst.psychoanalysis.memory;

public class PartialDrive {
	private float anal = 0f;
	private float oral = 0f;
	private float phalic = 0f;
	private float genital = 0f;

	public PartialDrive() {	}
	
	public PartialDrive(float anal, float oral, float phalic, float genital) {
		this.anal = anal;
		this.oral = oral;
		this.phalic = phalic;
		this.genital = genital;
	}

	public float getAnal() {
		return anal;
	}

	public void setAnal(float anal) {
		this.anal = anal;
	}

	public float getOral() {
		return oral;
	}

	public void setOral(float oral) {
		this.oral = oral;
	}

	public float getPhalic() {
		return phalic;
	}

	public void setPhalic(float phalic) {
		this.phalic = phalic;
	}

	public float getGenital() {
		return genital;
	}

	public void setGenital(float genital) {
		this.genital = genital;
	}

}
