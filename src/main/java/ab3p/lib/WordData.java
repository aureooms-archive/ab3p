package ab3p.lib;

/**
 * Created by genius on 30/08/14.
 */
public class WordData {
        public WordData(char[] wrdname, char[] stpname, char[] lfsname) {
            // TODO

        }
        public WordData(char[] wrdname, char[] stpname) {
            this(wrdname, stpname, new char[]{'L', 'f', '1', 'c', 'h', 'S', 'f'});
        }
        public WordData(char[] wrdname) {
            this(wrdname, new char[]{'s', 't', 'o', 'p'});
        }
        public WordData() {
            this(new char[]{'w', 'r', 'd', 's', 'e', 't', '3'});
        }


        public Chash wrdset; //sigle word in MEDLINE
        public Hash stp; //stopword
        public Hash lfs; //lfs (1-ch sf) for FirstLet match cases >=2
}
