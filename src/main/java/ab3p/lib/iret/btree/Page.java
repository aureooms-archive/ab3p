package ab3p.lib.iret.btree;

public class Page {


	/**
	 * Constructs a new empty page. Only happens at the root.
	 */
	Page() {
		// TODO
	}


	/**
	 * Constructs a page that
	 * holds the right half of a full page. The full page is pointed at by the
	 * pz. The new pages downward pointer is set to pn.
	 * n tells how much of the full page is to remain or where to begin removal.
	 */
	Page(Page pz, Page pn, final int n) {
		// TODO
	}


	/**
	 * Used to delete without touching search keys in the nodes
	 * which were created with addp functions and do not belong to the tree.
	 */
	void clean() {
		// TODO
	}



	/**
	 * inserts in partially empty
	 * page. n is insertion point, j is number of nodes on page that are viable.
	 */
	void insert(final int n, Node nd, final int j) {
		// TODO
	}



	/**
	 * searches for string on
	 * the page. Returns 1 if found, 0 otherwise. If found p is the index, otherwise
	 * if p is 0 then the page downward pointer is to next page to search, but if
	 * p is positive then p-1 is number of node that has the downward pointer to
	 * next page to search.
	 */
	int search(Integer a, Integer b, char[] s, Integer p) {
		// TODO
		return -1;
	}



	/** Looks for longest partial match. */
	int search(Integer a, Integer b, char[] s, Integer p, PartialMatch btr) {
		// TODO
		return -1;
	}

	/** Prints out the page for debugging purposes. */
	void debug() {
		// TODO
	}



	/** Indicates the number of Nodes on the page. */
	private char ndnm;

	/** Pointer that points to the page below and also lexically below. May be NULL. */
	private Page pdn;

	/** Pointers to the nodes on the page. Some may be NULL. */
	private Node[] pnd = new Node[Globals.ord2];

}
