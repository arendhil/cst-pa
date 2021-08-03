/**
 * 
 */
package br.unicamp.cst.psychoanalysis.memory;

import java.util.List;

import br.unicamp.cst.core.entities.MemoryObject;

/**
 * @author Marcelo Rigon
 * 
 * Implementation based on: https://www.researchgate.net/profile/Christian_Brandstaetter3/publication/293825928_Natural_Scientific_Psychoanalytical_Model_of_the_Psyche_for_Simulation_and_Emulation/links/56bc8b9708ae513496ed57cc/Natural-Scientific-Psychoanalytical-Model-of-the-Psyche-for-Simulation-and-Emulation.pdf
 * 
 * Evaluation standard attribute will be used in place of quota of affect.
 */
public class DriveRepresentation extends ThingPresentation {

	public enum DRIVE_COMPONENT {LIBIDINOUS, AGGRESSIVE};
	public enum DRIVE_PARTIAL {ORAL, ANAL, PHALIC, GENITAL, SELF_PRESERVATION};
	
	/** It's not being used yet. Defines oral, anal, phalic and genital components */ 
	protected DRIVE_PARTIAL partialDrive = DRIVE_PARTIAL.SELF_PRESERVATION;
	/** It's not being used yet. Defines if is an Aggressive or Libidinous drive. */ 
	protected DRIVE_COMPONENT component = DRIVE_COMPONENT.LIBIDINOUS;
	/** Desired "ACTION" type of MO to execute the drive. */
	protected ThingPresentation target;
	/** Origin of the Drive. It can be an organ as Stomach, Brain or  */
	protected ThingPresentation source;

	protected ThingPresentation object;

	/**
	 * 
	 */
	public DriveRepresentation() {
	}
	
	@Override
	public String toString() {
		return "DR: [" + getName() + "=" + this.getI().toString() + ", timestamp=" + getTimestamp() + ", evaluation="
				+ getEvaluation() + "]";
	}
	

	public ThingPresentation getTarget() {
		return target;
	}

	public void setTarget(ThingPresentation target) {
		this.target = target;
	}

	public ThingPresentation getSource() {
		return source;
	}

	public void setSource(ThingPresentation source) {
		this.source = source;
	}

	public ThingPresentation getObject() {
		return object;
	}

	public void setObject(ThingPresentation object) {
		this.object = object;
	}

	public DRIVE_PARTIAL getPartialDrive() {
		return partialDrive;
	}

	public void setPartialDrive(DRIVE_PARTIAL partialDrive) {
		this.partialDrive = partialDrive;
	}

	public DRIVE_COMPONENT getComponent() {
		return component;
	}

	public void setComponent(DRIVE_COMPONENT component) {
		this.component = component;
	}
}
