package br.unicamp.cst.psychoanalysis.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines a set of preconditions for which, if the required action is applied, you have a consequence.
 * -- Secondary process --
 * @author Marcelo Rigon
 *
 */
public class MicroAct extends ThingPresentation {
	List<LabeledImage> preconditions;
	LabeledImage consequence;
	MicroAct next;
	MicroAct previous;
	WordPresentation action;

	public LabeledImage getConsequence() {
		return consequence;
	}

	public void setConsequence(LabeledImage consequence) {
		this.consequence = consequence;
	}

	public MicroAct getNext() {
		return next;
	}

	public void setNext(MicroAct next) {
		this.next = next;
	}

	public MicroAct getPrevious() {
		return previous;
	}

	public void setPrevious(MicroAct previous) {
		this.previous = previous;
	}

	public WordPresentation getAction() {
		return action;
	}

	public void setAction(WordPresentation action) {
		this.action = action;
	}
	
	public void addPrecondition(LabeledImage precondition) {
		preconditions.add(precondition);
	}
	
	public boolean removePrecondition(LabeledImage precondition) {
		return preconditions.remove(precondition);
	}

	// constructor
	public MicroAct() {
		preconditions = new ArrayList<LabeledImage>();
	}

}
