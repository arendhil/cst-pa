package br.unicamp.cst.psychoanalysis.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * A set of ThingPresentationMesh that happens at the same time.
 * @author Marcelo F. Rigon
 * @see ThingPresentation, ThingPresentationMesh
 */
public class TemplateImage extends ThingPresentation {
	List<ThingPresentationMesh> meshes;
	
	public TemplateImage() {
		meshes = new ArrayList<ThingPresentationMesh>();
	}

}
