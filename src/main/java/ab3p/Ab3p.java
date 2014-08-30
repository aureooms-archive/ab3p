package ab3p;

public class Ab3p {

	/**
	Identify sf & lf pairs from free text using multi-stage algorithm
	process one line at a time and print out:
	line
	  sf|lf|P-precision|strategy
	*/

	void main (String[] argv) {

	  //get text from a file
	  if (argv.length != 1) {
	    System.err.println("Usage: identify_abbr <filename>"); 
	    System.exit(1);
	  }

	  Ab3P ab3p;

	  char * file = argv[1];
	  ifstream fin(file);
	  if(!fin) {
	    cout << "Cannot open " << file << endl;
	    exit(1);
	  }

	  string line;
	  vector<AbbrOut> abbrs;
	  while( getline(fin, line) ) {
	    ab3p.get_abbrs( line, abbrs );
	    cout << line << endl;
	    for ( int i = 0; i < abbrs.size() ; ++i )
	      cout << abbrs[i] << endl;
	  }

	  return 0;
	}

	
	
}
