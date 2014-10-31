package ab3p.lib;

/**
 * Created by genius on 30/08/14.
 */
public class Chash extends Hash {

    public Chash(){
        // TODO
    }
    public Chash(char[] nm){
        // TODO
    }

    /**
     * n gets appended to type if >-1
     */
    public Chash(int n, char[] nm){
        // TODO
    }

    public void create_ctable(Count Ct, int excess){
        // TODO
    } //Adds "ct" for counts
    //Calls create_htable and then prodoces the array of counts.
    public void create_ctable(int mz, Count Ct,int excess) {
        // TODO
    } //Adds "ct" for counts
    //Creates a numbered version of above
    public void create_ctable(BList Lt,int excess) {
        // TODO
    } //Adds "ct" for term #
    //and starts the count at 1 and in lexical order. count() will
    //return 0 if term not in list.
    public void create_ctable(int mz, BList Lt,int excess) {
        // TODO
    } //Adds "ct" for term #
    //Creates a numbered version of above

    public void gopen_ctable_map() {
        // TODO
    } //Calls gopen_htable_map and also
    //maps "ct" file.
    public void gopen_ctable_map(int mz) {
        // TODO
    } //Calls gopen_htable_map and also
    //maps "ct" file.
    public void gclose_ctable_map() {
        // TODO
    } //Calls gclose_htable_map and also
    //Unmaps "ct" file.
    public void gclose_ctable_map(int mz) {
        // TODO
    } //Calls gclose_htable_map and also
    //Unmaps "ct" file.

    public long count(char[] str) {
        // TODO
        return -1;
    } //Returns count if present, else 0.

    //Data
    public long[] cnt;
}
