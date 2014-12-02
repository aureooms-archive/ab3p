package ab3p.lib;

public class BList extends Btree {

    public BList() {
        //TODO
    }

    public BList(BList list) {
        super(list);
    }


    /**
     * Adds the string *str to the tree if not already in list
     */

    void add_key(char[] str) {
        //TODO
    }


    /**
     * Adds the string *str to the tree if
     * not already in list and counts it.
     */
    void add_key_count(char[] str) {
        //TODO
    }


    /**
     * Adds the string *str to the tree if
     * not already in list and counts it. Uses the actual string pointer instead
     * of making a copy
     */
    void addp_key_count(char[] str) {
        //TODO
    }


    /**
     * Used to count the number of keys.
     */
    long cnt_key;
}
