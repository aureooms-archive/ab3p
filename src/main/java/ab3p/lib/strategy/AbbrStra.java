package ab3p.lib.strategy;

import ab3p.lib.WordData;

public abstract class AbbrStra {

	public abstract void token(char[] str, char lst[][]); // tokennize & set ntk

	public abstract long tokenize(char[] str, char lst[][]); // tokennize &
	// return #
	// tokens

	public abstract long num_token(char[] str); // return # tokens

	public abstract long first_ch(char[] str, char[] fch, long num);

	public abstract long is_upperal(char[] str);

	public abstract long is_alpha(char[] str);

	public abstract void str_tolower(char[] str1, char[] str2);

	public abstract long get_str(char[] str1, char[] str2, long num);

	public abstract boolean isupper_str(char[] str);

	public abstract boolean is_onealpha(char[] str);

	public abstract long count_upperstr(char[] str);

	// return # upper-case 1st letter of consecutive tokens (backward)
	public abstract void get_alpha(char[] str1, char[] str2);

	// set str2 with only alphabet of str1
	public abstract boolean lf_ok(char[] shrtf, char[] longf);

	public abstract boolean set_condition(char[] sf);

	// must set nonAlphaSF=true if want to use SF containing non-alphabet
	public abstract long strategy(char[] sf, char[] str);

	// sf & str will be lower-cased (OCt-25-2007)
	public abstract long search_backward(long sloc, long tnum, long tloc, char[] sf, boolean first);

	// search backward to find match starting from sf[sloc]
	// Returns 1 if matches. sf[0] must match with begin word
	public abstract long search_backward_adv(char[] sf, boolean first);

	// Searches for next model setting. Returns 1 if finds one.
	public abstract void extract_lf(long begin, long end);

	// save strings from begin to end of tok to lf
	public abstract void extract_lf(long begin, long end, char[] str);

	// save strings from begin to end of str's tok to lf

	// ---after set mod check conditions
	// nsf:# ch in sf, nsw:# allowed skipword, general:true allow 1st ch match
	// after non-alnum
	public abstract boolean exist_skipword(long nsf);

	// true if at least one skip word exists
	public abstract boolean exist_n_skipwords(long nsf, long n);

	// true if exist n consecutive skip words between tokens but cannot be more
	// than n
	public abstract boolean exist_n_stopwords(long nsf, long n);

	// true if exist n consecutive skip stopwords between tokens but cannot be
	// more than n
	public abstract boolean stopword_ok(long nsf, long nsw);

	// true if at most (can be 0) nsw skip stopword in row exists
	public abstract boolean skip_stop_ok(long nsf, long nsw, long n);

	// true if at most (can be 0) nsw skip word, which include at least n
	// stopwords, in row exists
	public abstract boolean skip_stop_ok2(long nsf, long nsw, long n);

	// true if nsw skip word, which include at least n stopwords, in row exists
	public abstract boolean skipword_ok(long nsf, long nsw);

	// true if at most (can be 0) nsw skip word in row exists
	public abstract boolean is_subword(long nsf);

	// true if matching string is begin of a tok or a word in wrdlist
	public abstract boolean is_BeginWrdMatch(long nsf, boolean general);

	// true if begining ch of a word match
	// if general is true, allow match after non-alnum (eg, 1-alpha)
	public abstract boolean is_WithinWrdMatch(long nsf, boolean general);

	// true if within word match
	// if general is true, 1-Alpha: 'A' is not within word match
	public abstract boolean is_FirstLetMatch(long nsf, boolean general);

	// true if each ch of sf match with 1st ch of word
	// (true: Alpha anyword Beta (AB))
	// if general=true, true: 1-Alpha Beta, Alpha-Beta
	public abstract boolean is_FirstLetMatch2(long nsf, boolean general);

	// at least one 1-Alpha
	public abstract boolean is_FirstLetSMatch(char[] sf, boolean general);

	// true if first letter match & 's' match with last ch of lf
	public abstract boolean is_ContLetMatch(long nsf);

	// true if two or more consecutive letter match
	// ---

	char[] pch; // sf applied to a strategy
	char[] ps, pl; // sf, potential lf
	char[] sf = new char[100], text = new char[10000]; // sf & potential lf used
	// in a strategy
	char[] lf = new char[10000]; // lf found by a strategy
	char[][] tok = new char[1000][1000]; // token of potential lf
	// lower after strategy, original after extract_lf(b,e,str)
	long ntk; // # tokens
	long[][] mod = new long[100][2]; // match locations of tok with a given sf
	// mod[sf_inx][0]=tok inx, mod[sf_inx][1]=match loc in tok[mod[sf_inx][0]]

	// for each n_ch-SF
	long npairs; // selected pairs for this strategy
	long tpairs; // total pairs
	long nsfs; // # selected unique sfs for this strategy
	long nmatchs; // # matchs (success strategy & given sf == real sf)
	long amatchs; // # accumulated matchs up to this strategy
	long setCondition; // SF condition
	long greaterEqNsf; // if 1 select SF |SF|>=nsf

	WordData wData = null;

}
