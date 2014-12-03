package ab3p.lib;

import java.util.List;

import ab3p.lib.strategy.AbbrStra;

public abstract class StratUtil {
	public abstract AbbrStra strat_factory(String name);

	public abstract List<String> get_strats(String s);

	// get the strategy sequence for a given #-ch SF group
	public abstract void push_back_strat(String sgp, String strat);

	public abstract boolean group_sf(char[] sf, String grp);

	// check if sf is ok and assign a group
	public abstract String group_sf(char[] sf, char[] lf);

	// add the contion |lf|>|sf|
	public abstract void remove_nonAlnum(char[] str1, char[] str2);

	// remove non-alnum in str1 and save it to str2
	public abstract long exist_upperal(char[] str); // return 1 if exists upper
	// char, 0 ow

	public abstract long num_token(char[] str); // return # tokens

	List<String> Al1, Al2, Al3, Al4, Al5;
	List<String> Num2, Num3, Num4, Num5;
	List<String> Spec2, Spec3, Spec4, Spec5;
}
