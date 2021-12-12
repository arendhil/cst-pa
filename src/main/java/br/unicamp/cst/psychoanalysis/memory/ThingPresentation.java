package br.unicamp.cst.psychoanalysis.memory;

import br.unicamp.cst.core.entities.MemoryObject;

/**
 * Smallest memory element, composed of a type (name) and identifier (I).
 * @author Marcelo Rigon
 *
 */
public class ThingPresentation extends MemoryObject {
	Boolean _volatile = false;

	public ThingPresentation() {
		// TODO Auto-generated constructor stub
	}
	
	public String phrase() {
		return String.format("TP:%1s:%2s", getName(), getI());
	}
	
	public Boolean isVolatile() {
		return _volatile;
	}
	
	public void setVolaticity(Boolean volaticity) {
		_volatile = volaticity;
	}
}
