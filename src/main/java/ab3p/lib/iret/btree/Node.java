package ab3p.lib.iret.btree;

public class Node {

	public Node () {
		// TODO
	}

	/** Argument is the string for this node. */
	public Node(char[] string) {
		// TODO
	}

	/** Arguments are first the string and then the data pointer. */
	public Node(char[] string, Object rel) {
		// TODO
	}

	/**
	 * Prints out the node in simple format.
	 */
	public void debug(){
		// TODO
	}

	/** String pointer. */
	private char[] str;

	/** Data pointer. */
	private Object rel;

	/** Points down to the page below or to NULL. */
	private Page pdn;

}
