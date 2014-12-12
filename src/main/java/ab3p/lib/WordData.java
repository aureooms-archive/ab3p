package ab3p.lib;

import ab3p.lib.iret.Chash;
import ab3p.lib.iret.ChashImpl;
import ab3p.lib.iret.Hash;
import ab3p.lib.iret.HashImpl;

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
		
		this.wrdset = new ChashImpl(wrdname);
		this.stp = new HashImpl(stpname);
		this.lfs = new HashImpl(lfsname);
		
		this.wrdset.set_path_name("Ab3P".toCharArray());
		this.wrdset.gopen_ctable_map();
		this.stp.set_path_name("Ab3P".toCharArray());
		this.stp.gopen_htable_map();
		this.lfs.set_path_name("Ab3P".toCharArray());
		this.lfs.gopen_htable_map();
		
	}

	/** sigle word in MEDLINE */
	public Chash wrdset = new ChashImpl();
	
	/** stopword */
	public Hash stp = new HashImpl();
	
	/** lfs (1-ch sf) for FirstLet match cases >=2 */
	public Hash lfs = new HashImpl();
	
}
