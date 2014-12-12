package ab3p.lib.iret;

import ab3p.lib.BList;

public class HashImpl extends FBaseImpl implements Hash {

	/** Holds the bit map. */
	public char[] strmap;

	/** Holds the offsets to strmap. */
	public long[] addr;

	/** Number of words. */
	public long nwrds;

	/** Truncation number, size of har. */
	public long tnum;

	/** Holds hash array. */
	public long[] harr;

	/** Holds the hash coefficients. */
	public long[] farr;

	public long[] px0;
	public long[] px1;
	public long[] px2;
	public long[] px3;
	public long[] px4;
	public long[] px5;
	public long[] px6;
	public long[] px7;
	public long[] px8;
	public long[] px9;
	public long[] px10;
	public long[] px11;


	public HashImpl () {
		super("hshset".toCharArray(),"null".toCharArray());
	}
	
	public HashImpl (char[] nam) {
		super("hshset".toCharArray(),nam);
	}
	
	/**
	 * n gets appended to type if >-1
	 */
	public HashImpl(int n , char[]nam) {
		super("hshset".toCharArray(),n,nam);
	}

	@Override
	public void create_htable(BList Lst, int excess) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create_htableM(BList Lst, int excess) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create_htable(int mz, BList Lst, int excess) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gopen_htable_map() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gopen_htable_map(int mz) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gclose_htable_map() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gclose_htable_map(int mz) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gopen_htable_copy(Hash pH) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long find(char[] str) {
		// TODO Auto-generated method stub
		return 0;
	}

}
