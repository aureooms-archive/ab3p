package ab3p.lib.iret;

import ab3p.lib.BList;

public interface Hash extends FBase {

	/**
	 * "str" for file of strings,
	 * "ad" for address file, "nm" numbers, 
	 * "ha" hash array. Excess is # powers of 2 above size.
	 * @param Lst
	 * @param excess
	 */
	public void create_htable(BList Lst, int excess);
	
	/**
	 * creates in memory ready for use
	 * and no need to call gopen or gclose functions
	 * @param Lst
	 * @param excess
	 */
	public void create_htableM(BList Lst, int excess);
	
	/**
	 * "str" for file of strings,
	 * Creates a numbered version of above
	 * @param mz
	 * @param Lst
	 * @param excess
	 */
	public void create_htable(int mz, BList Lst, int excess);

	/**
	 * Creates memory maps
	 */
	public void gopen_htable_map(); 
	
	/**
	 * Creates memory maps
	 * @param mz
	 */
	public void gopen_htable_map(int mz);
	
	/**
	 * Destroys memory maps and deletes memory
	 */
	public void gclose_htable_map();
	
	/**
	 * Destroys memory maps and deletes memory
	 * @param mz
	 */
	public void gclose_htable_map(int mz); 
	/**
	 * Copies memory maps
	 * @param pH
	 */
	public void gopen_htable_copy(Hash pH);

	/**
	 * Return number+1 if present, else 0.
	 * Number is not lexical order but hash order and then lexical
	 * within collesion groups.
	 * @param str
	 * @return
	 */
	public long find(char[] str);

}
