package ab3p.lib;

import ab3p.lib.AbbrOut;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by genius on 30/08/14.
 */
public class Ab3P {

    public Ab3P() {
        // TODO
    }

    /**  Collect text for later abbreviation finding. **/
    public void add_text( String text ) {
        buffer += text;
    }

    public void add_text(char[] text) {
        buffer += new String(text);
    }

    /**  Sets abbrs to the abbreviations found in previous calls to add_text.
     Afterwords, resets the text buffer.  **/
    public void get_abbrs( List<AbbrOut> abbrs ) {
        this.get_abbrs(buffer, abbrs);
        buffer = "";
    }

    /**  Sets abbrs to the abbreviations found in text
     Does not interfere with the add_text buffer.  **/
    public void get_abbrs(String text, List<AbbrOut> abbrs ) {
        abbrs.clear();

        if(text.isEmpty()) return; // skip empty line
        // const_cast need so correct get_abbrs get called,
        // otherwise, infinite loop
        char[] ch = new char[text.length()];
        text.getChars(0, text.length(), ch, 0);
        this.get_abbrs(ch, abbrs);
    }

    public void get_abbrs(char[] text, List<AbbrOut> abbrs) {
        abbrs.clear();

        if (text.length == 0) return; // skip empty line

        ab.Proc(text); //extract potential SF & LF pairs

        for(int i = 0; i < ab.numa; i++) {
            AbbrOut result = new AbbrOut();

            try_pair( ab.abbs[i], ab.abbl[i], result);

            // preserve results
            if ( result.prec > 0 ) {
                abbrs.add(result);
            }
        }
        ab.cleara();
    }

    /**  Try a potential sf-lf form to find proper lf, strategy used,
     and pseudo-precision of result **/
    public void try_pair( char[] sf, char[] lf, AbbrOut abbr ){
        // TODO
    }

    /**
      * psf -- pointer short form
      * plf -- pointer long form
      */
    public void try_strats ( char[] psf, char[] plf, boolean swap, AbbrOut result ) {
        // TODO
    }


    //default # pairs = 10,000
    public AbbrvE ab = new AbbrvE();

    public Map<String, Double> stratPrec = new HashMap<String, Double>();
    public StratUtil util = new StratUtil();

    //set data needed for AbbrStra
    public WordData wrdData = new WordData();

    // collect text for later use
    public String buffer = "";

}
