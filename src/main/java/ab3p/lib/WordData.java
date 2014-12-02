package ab3p.lib;

public class WordData {

	private static final String WRDSET3 = "wrdset3";
	private static final String STOP = "stop";
	private static final String LF1CH_SF = "Lf1chSf";

	private static final char[] wrdnameDefault = WordData.WRDSET3.toCharArray();
	private static final char[] stpnameDefault = WordData.STOP.toCharArray();
	private static final char[] lfsnameDefault = WordData.LF1CH_SF.toCharArray();

	public WordData() {
		this(WordData.wrdnameDefault);
	}

	public WordData(final char[] wrdname) {
		this(wrdname, WordData.stpnameDefault);
	}

	public WordData(final char[] wrdname, final char[] stpname) {
		this(wrdname, stpname, WordData.lfsnameDefault);
	}

	public WordData(final char[] wrdname, final char[] stpname, final char[] lfsname) {
		// TODO
	}

	/** sigle word in MEDLINE */
	public Chash wrdset = new Chash();
	
	/** stopword */
	public Hash stp = new Hash();
	
	/** lfs (1-ch sf) for FirstLet match cases >=2 */
	public Hash lfs = new Hash();
	
}
