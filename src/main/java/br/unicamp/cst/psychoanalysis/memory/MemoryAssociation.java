package br.unicamp.cst.psychoanalysis.memory;

public class MemoryAssociation {
	public enum ASSOCIATION_KIND { ATTRIBUTE, CLASS, TEMPORAL, WORD, DRIVE_MESH };

	Double weight = 1.0;
	ASSOCIATION_KIND KIND = ASSOCIATION_KIND.ATTRIBUTE;

	ThingPresentation tp1;
	ThingPresentation tp2;

	public MemoryAssociation() {
		// TODO Auto-generated constructor stub
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	public ASSOCIATION_KIND getKIND() {
		return KIND;
	}

	public void setKIND(ASSOCIATION_KIND kind) {
		KIND = kind;
	}

	public ThingPresentation getTp1() {
		return tp1;
	}

	public void setTp1(ThingPresentation tp1) {
		this.tp1 = tp1;
	}

	public ThingPresentation getTp2() {
		return tp2;
	}

	public void setTp2(ThingPresentation tp2) {
		this.tp2 = tp2;
	}

}
