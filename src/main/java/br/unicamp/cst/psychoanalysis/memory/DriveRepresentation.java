/**
 * 
 */
package br.unicamp.cst.psychoanalysis.memory;

import java.util.List;

import br.unicamp.cst.core.entities.MemoryObject;

/**
 * @author Marcelo Rigon
 *
 */
public class DriveRepresentation {
	/// It's not being used yet. Defines oral, anal, phalic and genital components 
	protected PartialDrive partialDrive;
	protected String component;
	protected float quotaOfAffect;
	protected MemoryObject aim;
	protected List<MemoryObject> source;
	protected List<MemoryObject> objects;

	/**
	 * 
	 */
	public DriveRepresentation() {
		// TODO Auto-generated constructor stub
	}

}
