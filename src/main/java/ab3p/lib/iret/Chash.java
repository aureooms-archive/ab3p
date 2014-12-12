package ab3p.lib.iret;

import ab3p.lib.BList;
import ab3p.lib.Count;

public interface Chash extends Hash {


	/**
	 * Adds "ct" for counts
	 * Calls create_htable and then prodoces the array of counts.
	 * @param Ct
	 * @param excess
	 */
    public void create_ctable(Count Ct, int excess);
    
    /**
     * Adds "ct" for counts
     * Creates a numbered version of above 
     * @param mz
     * @param Ct
     * @param excess
     */
    public void create_ctable(int mz, Count Ct, int excess);
    
    /**
     * Adds "ct" for term #
     * and starts the count at 1 and in lexical order. count() will
     * return 0 if term not in list. 
     * @param Lt
     * @param excess
     */
    public void create_ctable(BList Lt, int excess);
    
    /**
     * Adds "ct" for term #
     * Creates a numbered version of above 
     * @param mz
     * @param Lt
     * @param excess
     */
    public void create_ctable(int mz, BList Lt, int excess);
    
    /**
     * Calls gopen_htable_map and also
     * maps "ct" file. 
     */
    public void gopen_ctable_map();
    
    /**
     * Calls gopen_htable_map and also
     * maps "ct" file. 
     * @param mz
     */
    public void gopen_ctable_map(int mz);
    
    /**
     * Calls gclose_htable_map and also
     * Unmaps "ct" file. 
     */
    public void gclose_ctable_map();
    
    /**
     * Calls gclose_htable_map and also
     * Unmaps "ct" file. 
     * @param mz
     */
    public void gclose_ctable_map(int mz);
    
    /**
     * Returns count if present, else 0.
     * @param str
     * @return
     */
    public long count(char[] str);
    
    
}
