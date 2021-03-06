/* Copyright (C) 2005, University of Massachusetts, Multi-Agent Systems Lab
 * See LICENSE for license information
 */

package taems.preprocessor;

/* Global Import */
import java.util.*;
import java.io.*;

/* Local Import */
import utilities.*;
import taems.*;

public class spaceFunction extends Block {
    protected Vector data;
    public spaceFunction(PreProcessor p, Vector v) {
	super(p);
	data=v;
    }
    public String toPTaems() {
	String answer = "#space " ;
	
	return(answer);
    }
    
   /**
     * Function used by the engine to produce the TTAEMS.
     * @param - Hashtable ht that contains all the state variable that we check in
     * the assertion
     * @return String - the TTAEMS string
     */
    public String toTTaems(Hashtable ht) {
	return(" ");
    }

}
