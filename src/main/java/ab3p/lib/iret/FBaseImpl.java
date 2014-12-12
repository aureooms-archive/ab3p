package ab3p.lib.iret;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FBaseImpl implements FBase {

	/** Command, what should happen to resources. */
	int cflag;

	/** Bit string status of resources, 1 open, 0 closed. */
	int oflag;

	/**
	 * flags to mark whether a resource is open or not
	 * 0 means closed, 1 means open
	 * Used for those resources that are either completely
	 * closed or completely open.
	 */
	int open1;


	/**
	 * flags to mark whether a resource is open or not
	 * 0 means closed, 1 means open
	 * Used for those resources that are either completely
	 * closed or completely open.
	 */
	int open2;


	/**
	 * flags to mark whether a resource is open or not
	 * 0 means closed, 1 means open
	 * Used for those resources that are either completely
	 * closed or completely open.
	 */
	int open3;


	/**
	 * flags to mark whether a resource is open or not
	 * 0 means closed, 1 means open
	 * Used for those resources that are either completely
	 * closed or completely open.
	 */
	int open4;

	/**
	 * flags to mark whether a resource is open or not
	 * 0 means closed, 1 means open
	 * Used for those resources that are either completely
	 * closed or completely open.
	 */
	int open5;

	char[] type;

	/** If nonnegative integer it is appended to end of type in constructing file name */
	int tpnm;

	char[] name;

	/** If nonnegative integer it is appended to end of name in constructing file name */
	int nmnm;

	/** Usual print flag, 1 for verbose output, 0 for none Print flag set to 1 by default. */
	int pflag;

	/** Flag set to 1 for external path from path file, 0 for internal path */
	int eflag; 

	/** Path stored here if eflag=0. */
	char[] path;

	/** Path extension stored here if eflag=2. */
	char[] pnam;
	


	/**
	 * tp is type name, nm is name
	 * @param tp
	 * @param nm
	 */
    public FBaseImpl(char[] tp,char[] nm) {
    	// TODO
    }
    
	/**
	 * tp is type name, if nonnegative tn is appended to end of tp, nm is name
	 * @param tp
	 * @param tn
	 * @param nm
	 */
    public FBaseImpl(char[] tp,int tn,char[] nm) {
    	// TODO
	}
    
    /**
     * tp is type name, nm is name
	 * pt is pointer at a string sss and reads the path from file path_sss in
	 * current directory. But if sss begins with ':' then skips this character
	 * and remaining string is the path string itself.
     * @param tp
     * @param nm
     * @param pt
     */
    public FBaseImpl(char[] tp,char[] nm,char[] pt) {
    	// TODO
	}

	@Override
	public void set_type_num(int tn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set_name_num(int nn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void change_type(char[] nm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void change_name(char[] nm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set_name(char[] nm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subname(char[] tph, char[] tpl, char[] nm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set_path_internal(char[] pt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set_path_name(char[] pa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void map_down(FBase pFb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void map_down_sub(FBase pFb, char[] subtype) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get_pathx(char[] cn, char[] a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get_pathx(char[] cn, long n, char[] a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public char[] add_num(char[] ptr, long n, char[] buf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] cat_num(char[] ptr, long n, char[] buf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileInputStream get_Istr(char[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileOutputStream get_Ostr(char[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileInputStream get_Istr(long n, char[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileOutputStream get_Ostr(long n, char[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dst_Istr(FileInputStream pfin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dst_Ostr(FileOutputStream pfout) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int Exists(char[] a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Exists(long n, char[] a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char[] get_Read(char[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] get_Read(long n, char[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] get_Mmap(char[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] get_Mmap(long n, char[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] get_Wmap(char[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] get_Wmap(long n, char[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dst_Mmap(char[] a, char[] ptr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dst_Mmap(long n, char[] a, char[] ptr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bin_Writ(char[] a, long nm, char[] ptr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bin_Writ(long n, char[] a, long nm, char[] ptr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int Gcom(int sflag) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Rcom(int sflag) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mark(long first, int second, char[] string) {
		// TODO Auto-generated method stub
		
	}

}
