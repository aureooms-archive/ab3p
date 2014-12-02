package ab3p.lib;

import ab3p.lib.AbbrOut;

import java.util.List;

public class Ab3PImpl extends Ab3P {

    public Ab3PImpl() {
        // TODO
    }

    @Override
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

	@Override
	public void try_pair(char[] sf, char[] lf, AbbrOut abbr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void try_strats(char[] psf, char[] plf, boolean swap, AbbrOut result) {
		// TODO Auto-generated method stub
		
	}

}
