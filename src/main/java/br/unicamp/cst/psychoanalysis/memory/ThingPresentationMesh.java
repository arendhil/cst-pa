package br.unicamp.cst.psychoanalysis.memory;

import java.util.ArrayList;
import java.util.List;

public class ThingPresentationMesh extends ThingPresentation {
	List<ThingPresentation> content; 

	public ThingPresentationMesh() {
		content = new ArrayList<ThingPresentation>();
	}

	
	public void addContent(ThingPresentation tp) {
		if (content.contains(tp)) {
			// already added content
		} else {
			content.add(tp);
		}
	}
	
	public void removeContent(ThingPresentation tp) {
		if (content.contains(tp)) {
			content.remove(tp);
		} else {
			//content not found
		}
	}
	
	public void clearAllContent() {
		content.clear();
	}
}
