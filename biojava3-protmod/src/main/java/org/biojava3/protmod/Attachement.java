/*
 *                    BioJava development code
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  If you do not have a copy,
 * see:
 *
 *      http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright for this code is held jointly by the individual
 * authors.  These should be listed in @author doc comments.
 *
 * For more information on the BioJava project and its aims,
 * or to join the biojava-l mailing list, visit the home page
 * at:
 *
 *      http://www.biojava.org/
 *
 * Created on Jun 1, 2010
 * Author: Jianjiong Gao 
 *
 */

package org.biojava3.protmod;

import org.biojava.bio.structure.AminoAcid;
import org.biojava.bio.structure.Atom;
import org.biojava.bio.structure.Group;

public interface Attachement {
	/**
	 * 
	 * @return {@link ProteinModification} occurred on the residue.
	 */
	public ProteinModification getType();
	
	/**
	 * 
	 * @return the {@link AminoAcid} that is attached to.
	 */
	public AminoAcid getModifiedAminoAcid();
	
	/**
	 * 
	 * @return the attached {@link Group}.
	 */
	public Group getAttachedGroup();
	
	/**
	 * 
	 * @return the attached point on the {@link AminoAcid}.
	 */
	public Atom getAtomOnAminoAcid();
	
	/**
	 * 
	 * @return the attached point on the attached {@link Group}.
	 */
	public Atom getAtomOnAttachedGroup();
}
