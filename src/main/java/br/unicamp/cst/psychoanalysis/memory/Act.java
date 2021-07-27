package br.unicamp.cst.psychoanalysis.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines an action plan, with a set of microacts to get from the current situation to the desired one.
 * -- Secondary process --
 * @author Marcelo Rigon
 * @see MicroAct
 */
public class Act extends WordPresentation {
	List<MicroAct> acts;
	
	public Act() {
		acts = new ArrayList<MicroAct>();
	}

}
