package br.unicamp.cst.psychoanalysis.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * Parts of image linked together by some causality. It can be an action.
 * -- Secondary process --
 * For instance, the Labeled Image "Green Agent EATS cake", has the parts: "Green agent" and "cake" and the connector "EATS".
 * @author Marcelo Rigon
 * @see TemplateImage
 */
public class LabeledImage extends ThingPresentation {
	// element to connect the parts
	ThingPresentation action;
	MemoryAssociation image;
	List<TemplateImage> parts;

	public LabeledImage() {
		parts = new ArrayList<TemplateImage>();
	}

}
