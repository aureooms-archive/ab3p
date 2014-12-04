package ab3p.lib.strategy;

import ab3p.lib.WordData;

public abstract class AbbrStra implements Strategy {

	/** tokennize & set ntk */
	public abstract void token(char[] str, char lst[][]);

	/** tokennize & return # tokens */
	public abstract long tokenize(char[] str, char lst[][]);

	/** return # tokens */
	public abstract long num_token(char[] str);

	public abstract long first_ch(char[] str, char[] fch, long num);

	public abstract long is_upperal(char[] str);

	public abstract long is_alpha(char[] str);

	public abstract void str_tolower(char[] str1, char[] str2);

	public abstract long get_str(char[] str1, char[] str2, long num);

	public abstract boolean isupper_str(char[] str);

	public abstract boolean is_onealpha(char[] str);

	/** return # upper-case 1st letter of consecutive tokens (backward) */
	public abstract long count_upperstr(char[] str);

	/** set str2 with only alphabet of str1 */
	public abstract void get_alpha(char[] str1, char[] str2);

	public abstract boolean lf_ok(char[] shrtf, char[] longf);

	
	/**
	 * Search backward to find match starting from sf[sloc].
	 * Returns 1 if matches.
	 * sf[0] must match with begin word.
	 * 
	 * @param sloc
	 * @param tnum
	 * @param tloc
	 * @param sf
	 * @param first
	 * @return
	 */
	public abstract long search_backward(long sloc, long tnum, long tloc, char[] sf, boolean first);

	/** Searches for next model setting. Returns 1 if finds one. */
	public abstract long search_backward_adv(char[] sf, boolean first);

	/** save strings from begin to end of tok to lf */
	public abstract void extract_lf(long begin, long end);

	/** save strings from begin to end of str's tok to lf */
	public abstract void extract_lf(long begin, long end, char[] str);


	// ---
	// After set mod check conditions.
	// ==
	//
	// nsf : # ch in sf
	// nsw : # allowed skipword
	// general:true allow 1st ch match after non-alnum
	
	/** true if at least one skip word exists */
	public abstract boolean exist_skipword(long nsf);

	/** true if exist n consecutive skip words between tokens but cannot be more than n */
	public abstract boolean exist_n_skipwords(long nsf, long n);

	/** true if exist n consecutive skip stopwords between tokens but cannot be more than n */
	public abstract boolean exist_n_stopwords(long nsf, long n);

	/** true if at most (can be 0) nsw skip stopword in row exists */
	public abstract boolean stopword_ok(long nsf, long nsw);

	/** true if at most (can be 0) nsw skip word, which include at least n stopwords, in row exists */
	public abstract boolean skip_stop_ok(long nsf, long nsw, long n);

	
	/** true if nsw skip word, which include at least n stopwords, in row exists */
	public abstract boolean skip_stop_ok2(long nsf, long nsw, long n);

	/** true if at most (can be 0) nsw skip word in row exists */
	public abstract boolean skipword_ok(long nsf, long nsw);

	/** true if matching string is begin of a tok or a word in wrdlist */ 
	public abstract boolean is_subword(long nsf);

	/**
	 * true if begining ch of a word match
	 * if general is true, allow match after non-alnum (eg, 1-alpha)
	 *  
	 * @param nsf
	 * @param general
	 * @return
	 */
	public abstract boolean is_BeginWrdMatch(long nsf, boolean general);

	/**
	 * true if within word match
	 * if general is true, 1-Alpha: 'A' is not within word match
	 * 
	 * @param nsf
	 * @param general
	 * @return
	 */
	public abstract boolean is_WithinWrdMatch(long nsf, boolean general);

	/**
	 * true if each ch of sf match with 1st ch of word
	 * (true: Alpha anyword Beta (AB))
	 * if general=true, true: 1-Alpha Beta, Alpha-Beta
	 *  
	 * @param nsf
	 * @param general
	 * @return
	 */
	public abstract boolean is_FirstLetMatch(long nsf, boolean general);

	/** at least one 1-Alpha */
	public abstract boolean is_FirstLetMatch2(long nsf, boolean general);

	/** true if first letter match & 's' match with last ch of lf */
	public abstract boolean is_FirstLetSMatch(char[] sf, boolean general);

	/** true if two or more consecutive letter match */ 
	public abstract boolean is_ContLetMatch(long nsf);

	// ---

	
	/** sf applied to a strategy */
	char[] pch; 
	
	/** sf, potential lf */
	char[] ps, pl;
	
	/** sf & potential lf used in a strategy */
	char[] sf = new char[100], text = new char[10000];
	
	/** lf found by a strategy */
	public char[] lf = new char[10000]; 
	
	/**
	 * token of potential lf
	 * lower after strategy, original after extract_lf(b,e,str)
	 */
	char[][] tok = new char[1000][1000];
	
	/** # tokens */
	long ntk; 
	
	/**
	 * match locations of tok with a given sf
	 * mod[sf_inx][0]=tok inx, mod[sf_inx][1]=match loc in tok[mod[sf_inx][0]]
	 */
	long[][] mod = new long[100][2]; 
	

	
	// for each n_ch-SF
	
	/** selected pairs for this strategy */
	long npairs; 
	
	/** total pairs */
	long tpairs; 
	
	/** # selected unique sfs for this strategy */
	long nsfs; 
	
	/** # matchs (success strategy & given sf == real sf) */
	long nmatchs; 
	
	/** # accumulated matchs up to this strategy */
	long amatchs; 
	
	/** SF condition */
	long setCondition;
	
	/** if 1 select SF |SF|>=nsf */
	long greaterEqNsf;
	
	
	// wData

	public WordData wData = null;

}
