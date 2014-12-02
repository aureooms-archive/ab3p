package ab3p.lib;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Identify sf & lf pairs from free text using multi-stage algorithm process
 * one line at a time and print out: line sf|lf|P-precision|strategy
 */
public abstract class Ab3P {

	/**
	 * Collect text for later abbreviation finding.
	 */
	public void add_text(final String text) {
		this.buffer += text;
	}

	public void add_text(final char[] text) {
		this.buffer += text;
	}

	/**
	 * Sets abbrs to the abbreviations found in previous calls to add_text.
	 * Afterwords, resets the text buffer.
	 */
	public void get_abbrs(final List<AbbrOut> abbrs) {
		this.get_abbrs(this.buffer, abbrs);
		this.buffer = "";
	}

	/**
	 * Sets abbrs to the abbreviations found in text Does not interfere with the
	 * add_text buffer.
	 */
	public void get_abbrs(final String text, final List<AbbrOut> abbrs) {
		abbrs.clear();

		if (text.isEmpty())
			return; // skip empty line
		// const_cast need so correct get_abbrs get called,
		// otherwise, infinite loop

		this.get_abbrs(text.toCharArray(), abbrs);
	}

	public abstract void get_abbrs(char[] text, List<AbbrOut> abbrs);

	/**
	 * Try a potential sf-lf form to find proper lf, strategy used, and
	 * pseudo-precision of result
	 */
	public abstract void try_pair(char[] sf, char[] lf, AbbrOut abbr);

	/**
	 * psf -- pointer short form
	 * plf -- pointer long form
	 */
	public abstract void try_strats(char[] psf, char[] plf, boolean swap, AbbrOut result);

	// default # pairs = 10,000
	public AbbrvE ab = new AbbrvEImpl();
	
	public Map<String, Double> stratPrec = new HashMap<String, Double>();
	public StratUtil util = new StratUtilImpl();
	
	// set data needed for AbbrStra
	public WordData wrdData = null;
	
	// collect text for later use
	public String buffer = "";

}
