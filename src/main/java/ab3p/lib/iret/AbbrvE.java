package ab3p.lib.iret;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ab3p.lib.Find_Seq;
import ab3p.lib.MPtok;

public abstract class AbbrvE {

	/**
	 * Extracts possible long-short form 
	 * pairs, but does not attempt to find
	 * the relationship
	 * 
	 * @param pch
	 */
	public abstract void Extract(final char[] pch) ;
	
	
	/**
	 * Extracts possible long-short form 
	 * pairs, but does not attempt to find
	 * the relationship ( extened version (Jan-9-2008) )
	 * 
	 * @param pch
	 */
	public abstract void Extract2(final char[] pch) ;

	/**
	 * Tests a single token and returns true if
	 * the token should be a possible first token
	 * of a short form
	 * 
	 * @param str
	 * @return
	 */
	public abstract boolean Test(final char[] str) ;
	
	/**
	 * Sets ratings for the proposed pairs. Effort to
	 * remove (a), (b), etc., sequence markers
	 */
	public abstract void Rate() ;

	/**
	 * Produces a list of tokens in order of
	 * of occurrence in the string.
	 * @param str
	 */
	public abstract void token(final char[] str) ;

	/**
	 * Produces a list of tokens in order of
	 * of occurrence in the string.
	 * ( extended version (Jan-9-2008) )
	 * @param str
	 */
	public abstract void token2(final char[] str) ;

	
	/**
	 * Clear the abbl & abbs memory of strings
	 */
	public abstract void cleara() ;

	/**
	 * Clear the lst memory of words
	 */
	public abstract void clear() ; 

	
	
	// Application functions
	
	/**
	 * Accepts a natural language statement and
	 * processes to final results stored in tta, abbs, and abbl
	 * Need to call cleara function after each use of this function
	 * 
	 * @param pch
	 */
	public abstract void Proc(final char[] pch) ;

	/**
	 * Internal routines:
	 * setup data for Test method
	 */
	public abstract void setup_Test() ;

	/**
	 * does str begins with a prefix?
	 * @param str
	 * @return
	 */
	public abstract boolean prefix_match(final char[] str) ;

	
	// Data
	
	/** Total possible abbreviations extracted ( default : 10k )*/
	public long tta;
	
	/** number of abbreviations in current extract */
	public long numa; 
	
	/** Long form space, hold up to 10 tokens */
	public char[][] abbl;
	
	/** Short form space, hold up to 10 tokens */
	public char[][] abbs;
	
	/** identify sequences to ignore */
	public Find_Seq seq;
	
	/** Number of tokens within parentheses */
	public int[] nt; 
	
	/** Space in lst for tokens ( default 10k ) */
	public long word_space;
	
	/** Number of tokens */
	public int num;
	
	/** Holds the tokens */
	public char[][] lst;

	public static int cnam_size = 100000;
	
	/** Work space */
	public char[] cnam = new char[AbbrvE.cnam_size];
	
	/**
	 * Pointer at tokenizer class. Used to segment text
	 * in Proc function.
	 */
	public MPtok pMt = null; 
	

	// Test data
	
	/** bad SF to match exactly */
	public Set<String> match = new HashSet<String>();
	
	/** bad SF to match prefix */
	public List<String> prefix = new ArrayList<String>();
	
}
