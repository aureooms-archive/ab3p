package ab3p.lib;

import ab3p.lib.AbbrOut;
import ab3p.lib.strategy.AbbrStra;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.List;

public class Ab3PImpl extends Ab3P {
	
	private static final String AB3P_PREC_DAT = "WordData/Ab3P_prec.dat";

    public Ab3PImpl() throws IOException {
    	
    	this.buffer = "";
    	this.wrdData= new WordData();
    	
    	String sf_grp = "";
    	String sf_nchr = "";
    	String strat = "";
    	
    	/** precision */
    	double value = 0;
    	
    	String file_name = Ab3PImpl.AB3P_PREC_DAT;
    	   	
    	InputStream inputStream = new FileInputStream( file_name );
    	Reader reader = new BufferedReader( new InputStreamReader( inputStream ) );
    	StreamTokenizer tokenizer = new StreamTokenizer( reader );
    	
    	// get precision of a given #-ch SF's strategy
    	while ( true ) {
    		
    		int ttype;
    		
    		// parse first token
    		
    		ttype = tokenizer.nextToken();
    		
    		if ( ttype != StreamTokenizer.TT_WORD ) {
    			throw new IOException( "first token in line must be a word" );
    		}
    		
    		sf_grp = tokenizer.sval;
    		
    		// parse second token
    		
    		ttype = tokenizer.nextToken();
    		
    		if ( ttype != StreamTokenizer.TT_NUMBER ) {
    			throw new IOException( "second token in line must be a number" );
    		}
    		
    		sf_nchr = Integer.toString( (int) tokenizer.nval );
    		
    		// parse third token
    		
    		ttype = tokenizer.nextToken();
    		
    		if ( ttype != StreamTokenizer.TT_WORD ) {
    			throw new IOException( "third token in line must be a word" );
    		}
    		
    		strat = tokenizer.sval;
    		
    		// parse fourth token
    		
    		ttype = tokenizer.nextToken();
    		
    		if ( ttype != StreamTokenizer.TT_NUMBER ) {
    			throw new IOException( "fourth token in line must be a number" );
    		}
    		
    		value = tokenizer.nval;
    		

    		// record entry
    		
    		stratPrec.put( sf_grp + sf_nchr + strat, value );

    		//set strategy sequence
			util.push_back_strat( sf_grp + sf_nchr, strat );

			ttype = tokenizer.nextToken();

			if ( ttype == StreamTokenizer.TT_EOL ) {
				continue;
			}
			else if ( ttype == StreamTokenizer.TT_EOF ) {
				break;
			}
			else {
				throw new IOException( "garbage 5th token in current line" );
			}
    	}
    }

    @Override
    public void get_abbrs(char[] text, List<AbbrOut> abbrs) throws Exception {
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
	public void try_pair(char[] sf, char[] lf, AbbrOut result) throws Exception {
		  
		  //process i) lf (sf)
		  try_strats( sf, lf, false, result );
		  
		  //process ii) sf (lf)
		  this.ab.token(lf);
		  try_strats( this.ab.lst[this.ab.num-1], sf, true, result );
		
	}

	@Override
	public void try_strats(char[] psf, char[] plf, boolean swap, AbbrOut result) throws Exception {
		

		// SF group eg) Al1, Num2, Spec3
		// null if sf is not ok, otherwise sfg will be assigned
		String sfg = util.group_sf(psf,plf);
		
		if (sfg == null || ( swap && util.exist_upperal(psf) != 0 ) ) {
			return;
		}

		char[] sf = new char[1000], sfl = new char[1000];

		// strategy sequence for a given #-ch SF group
		List<String> strats = util.get_strats(sfg);
		
		// sf will be w/o non-alnum
		util.remove_nonAlnum(psf,sf);

		// go through strategies
		for( int j = 0 ; j < strats.size() ; ++j ) {
			
			// set a paticular strategy
		    AbbrStra strat = util.strat_factory(strats.get(j));
		    
		    // set wordset, stopword
		    strat.wData = wrdData;
		    
		    if( strat.strategy(sf,plf) != 0 ) {
		    	
		    	// case sensitive
		    	strat.str_tolower(sf,sfl);

		    	if( strat.lf_ok(psf,strat.lf) ) {
		    		
		    		final String key = sfg + strats.get(j);

			        if( !stratPrec.containsKey(key) ) {
			        	throw new Exception( "No precision assigned for " + key );
			        }

			        double p = stratPrec.get( key );

			        if( p > result.prec ) {
			        	// TODO
			        	// CHECK IF STRING CASTING IS SAFE
			        	result.sf = new String(psf);
			        	result.lf = new String(strat.lf);
			        	result.prec = p;
			        	result.strat = strats.get(j);
			        }

			        return;
		        
		      }
		    	
		    }
		    
		  }
		
	}

}
