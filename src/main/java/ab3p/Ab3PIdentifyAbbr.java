package ab3p;

import ab3p.lib.Ab3P;
import ab3p.lib.AbbrOut;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ab3PIdentifyAbbr {

	/**
	Identify sf & lf pairs from free text using multi-stage algorithm
	process one line at a time and print out:
	line
	  sf|lf|P-precision|strategy
	*/

	void main (String[] argv) throws IOException {

	  //get text from a file
	  if (argv.length != 1) {
	    System.err.println("Usage: identify_abbr <filename>"); 
	    System.exit(1);
	  }

	  Ab3P ab3p = new Ab3P();

	  String filename = argv[0];
      File file = new File(filename);
      FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);

      String line;
      List<AbbrOut> abbrs = new ArrayList<AbbrOut>();

	  while((line = bufferedReader.readLine()) != null) {

	    ab3p.get_abbrs(line, abbrs);
	    System.out.println(line);
	    for ( AbbrOut abbr : abbrs ) {
            abbr.print(System.out);
            System.out.println();
        }

	  }

      bufferedReader.close();
	}

	
	
}
