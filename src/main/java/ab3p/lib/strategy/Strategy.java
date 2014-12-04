package ab3p.lib.strategy;

public interface Strategy {

	/** must set nonAlphaSF=true if want to use SF containing non-alphabet */
	public boolean set_condition(char[] sf);
 
	/** sf & str will be lower-cased (OCt-25-2007) */
	public long strategy(char[] sf, char[] str);

}
