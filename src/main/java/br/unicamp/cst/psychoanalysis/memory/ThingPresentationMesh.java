package br.unicamp.cst.psychoanalysis.memory;

import java.util.ArrayList;
import java.util.List;

public class ThingPresentationMesh extends ThingPresentation {
	List<MemoryAssociation> content; 

	public ThingPresentationMesh() {
		content = new ArrayList<MemoryAssociation>();
	}
	

	/**
	 * Gets the evaluation of the Memory Object.
	 * 
	 * @return the evaluation of the Memory Object.
	 */
	@Override
	public synchronized Double getEvaluation() {
		Double ev = 0.0;
		
		return ev;
	}
	
	public int searchAssociation(ThingPresentation tp) {
		for (int i = 0; i < content.size(); i++) {
			MemoryAssociation association = content.get(i);
			if (association.getTp1().equals(tp) ||
				association.getTp2().equals(tp)) {
				return i;
			}
		}
		return -1;
	}

	
	public void addContent(ThingPresentation tp, Double weight) {
		boolean found = searchAssociation(tp) >= 0;
		
		if (found) {
			// already added content
		} else {
			//create association object
			MemoryAssociation association = new MemoryAssociation();
			association.setTp1(this);
			association.setTp2(tp);
			association.setWeight(weight);
			//add to list
			content.add(association);
		}
	}
	
	public void removeContent(ThingPresentation tp) {
		int pos = searchAssociation(tp);
		if (pos >= 0) {
			content.remove(pos);
		} else {
			//content not found
		}
	}
	
	public void clearAllContent() {
		content.clear();
	}
}
