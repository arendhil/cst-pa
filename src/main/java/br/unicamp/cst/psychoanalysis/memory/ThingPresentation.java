package br.unicamp.cst.psychoanalysis.memory;

import br.unicamp.cst.core.entities.MemoryObject;

public class ThingPresentation extends MemoryObject {

	public ThingPresentation() {
		// TODO Auto-generated constructor stub
	}
	
	public String phrase() {
		return String.format("TP:%1s:%2s", getName(), getI());
	}
}
