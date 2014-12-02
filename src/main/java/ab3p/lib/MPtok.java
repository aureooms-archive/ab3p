package ab3p.lib;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*! \brief A class to perform tokenization.
 *
 * The MPtag class can be used to perform tokenization and segmentation
 * of strings into tokens or sentences. It is inherited and used by MPtag
 * so if the user is only interested in tagging, this class does not
 * need to be referenced.
 */
//Data structure and algorithm for finding common pairs.
public class MPtok {

	// These options are probably compile time constants
	private static char option_tagsep = '_'; // The tagsep character
	private static char option_replacesep = '-'; // Replace tagsep with this

	private static void chomp(final char[] line) {
		int i;

		i = line.length - 1;
		while (i >= 0 && line[i] == '\n' || line[i] == '\r') {
			line[i--] = '\0';
		}
	}

	public static final int MPTOK_VERSION = 11; // The latest version
	public static final int MAX_WORDS = 10000; // Maximum number of words in a
	// sentence
	public static final int MAX_ABB = 100;

	public enum ABB {
		ABB, EOS, NUM
	};

	public MPtok() {
		this("");
	}

	public MPtok(final String idir) {
		this(idir, "");
	}

	// / \brief A MPtok object, giving the install directory \p idir where data
	// files can be found
	public MPtok(final String idir, final String cnam) {
		// TODO
	}

	public void init() {
		// TODO
	} // Initialize (call only once)

	public void init(final String idir) {
		this.option_dir = idir;
		this.init();
	} // Initialize using specified install directory

	public String option_pretag; // The tag to use on tokens
	public int option_segment; // Segment into sentences
	public int option_hyphen; // Hyphens are separate tokens
	public int option_comma; // Commas are always tokenized
	public int option_pretok; // The text is pre-tokenized
	public int option_new; // Use new algorithms, used in development only
	public int option_doteos; // If " . " occurs, it's an end EOS (new >= 5)

	public void set_segment(final int i) {
		// TODO
	} // /< \brief Sentences are broken up during tokenization (default 1)

	public void set_token(final int i) {
		// TODO
	} // /< \brief Break tokens apart with white space (default 1)

	public void set_hyphen(final int i) {
		// TODO
	} // /< \brief Hyphens are separate tokens (default 0)

	public void set_comma(final int i) {
		// TODO
	} // /< \brief Commas are separate tokens (default 1)

	public void set_pretag(final char[] a) {
		// TODO
	} // /< \brief Use this tag on all tokens (default empty string)

	public void set_pretok(final int i) {
		// TODO
	} // /< \brief Assume string is already tokenized using spaces (default 0)

	public void set_new(final int i) {
		// TODO
	} // /< \brief Use a previous algorithm (defaults to most recent)

	public void set_doteos(final int i) {
		// TODO
	} // /< \brief Ignore abbreviations, and always assume a period ends a
		// sentence (default 0)

	public void merge_words(final int s, final int e) {
		// TODO
	} // merge words between s and e (idiom)

	public void split_words() {
		// TODO
	} // split all merged words

	public String tokenize(final String str) {
		return null;
		// TODO
	} // /< \brief Tokenize, save (in \p word), and return space delimited
		// tokens

	public String segment(final String str) {
		return null;
		// TODO
	} // /< \brief Segment, save (in \p sent), and return newline delimited
		// sentences

	public String save_string(final String str) {
		return null;
		// TODO
	} // save a buffer

	public String tokenize_nosave(final String str) {
		return null;
		// TODO
	} // tokenize without saving

	public String tokenize(final String str, final int i) {
		return null;
		// TODO
	} // do tokenization with or without inserting spaces between them

	public void print(final int i) {
		// TODO
	} // /< \brief Print tokens/tags with given verbosity

	public List<String> word; // /< \brief Vector of words (tokens) of most
	// recently tagged (or tokenized) text
	public List<String> tag; // /< \brief Vector of tags of most recently tagged
	// (or tokenized) text
	public List<String> sent; // /< \brief Vector of sentences of most recently
	// sentence-segmented text

	public char[] text; // Input text arg
	public int text_len; // It's length
	public int[] tokflag; // token flags
	public int[] endflag; // end-sentence flags

	public String option_cnam; // A suffix, for opening variant support files
	public String option_dir; // Directory to find things

	protected void set_tokflag() {
		// TODO
	}

	protected void set_endflag() {
		// TODO
	}

	protected void set_endflag_01() {
		// TODO
	}

	protected int size_buff() {
		return -1;
		// TODO
	}

	// read a file of pairs into a data structure,
	// the file must be sorted first
	protected void init_pair(final String file_name) throws IOException {
		final File file = new File(file_name);
		final Reader reader = new FileReader(file);
		final BufferedReader bufferedReader = new BufferedReader(reader);

		for (String pair; (pair = bufferedReader.readLine()) != null;) {
			if (pair.length() > 0) {
				this.common_pair.add(pair);
			}
		}
		bufferedReader.close();

	} // read a file of common pairs

	// List of abbreviations in 3 categories
	// ABB = can occur mid sentence
	// EOS = can occur at end of sentence
	// NUM = only used before numbers
	protected void init_abbr(final String file_name) throws FileNotFoundException {
		final File file = new File(file_name);
		final Scanner scanner = new Scanner(file);

		String typ, abb;
		final Map<String, Integer> val = new HashMap<String, Integer>();
		val.put("ABB", ABB.ABB.ordinal());
		val.put("EOS", ABB.EOS.ordinal());
		val.put("NUM", ABB.NUM.ordinal());

		while (scanner.hasNext()) {
			typ = scanner.next();
			if (val.containsKey(typ)) {
				abb = scanner.next();
				if (abb.length() > 0)
					this.common_abbr.put(abb, val.get(typ));
			}
		}

		scanner.close();
	} // read a file of abbreviations

	protected void tok_0() {
		// TODO
	}

	protected void tok_1() {
		// TODO
	}

	protected void tok_2() {
		// TODO
	}

	protected void tok_3() {
		// TODO
	}

	protected void tok_5_6_7() {
		// TODO
	}

	protected void tok_8_9() {
		// TODO
	}

	protected void tok_10() {
		// TODO
	}

	protected void tok_11() {
		// TODO
	}

	protected void tok_12() {
		// TODO
	}

	protected void tok_13() {
		// TODO
	}

	protected void tok_14() {
		// TODO
	}

	protected void tok_15() {
		// TODO
	}

	protected void tok_15_1() {
		// TODO
	}

	protected void tok_16() {
		// TODO
	}

	protected void tok_16_1() {
		// TODO
	}

	protected void tok_17() {
		// TODO
	}

	protected void tok_20() {
		// TODO
	}

	protected void tok_20_1() {
		// TODO
	}

	protected void tok_20_2() {
		// TODO
	}

	protected void tok_21() {
		// TODO
	}

	protected void tok_21a() {
		// TODO
	}

	protected void tok_22() {
		// TODO
	}

	protected void tok_23() {
		// TODO
	}

	protected void tok_24() {
		// TODO
	}

	protected void tok_25() {
		// TODO
	}

	protected void tok_26() {
		// TODO
	}

	protected void tok_27() {
		// TODO
	}

	protected void tok_28() {
		// TODO
	}

	protected void tok_29() {
		// TODO
	}

	protected void tok_29a() {
		// TODO
	}

	protected void tok_30() {
		// TODO
	}

	protected void tok_31() {
		// TODO
	}

	protected void tok_32() {
		// TODO
	}

	protected void tok_33() {
		// TODO
	}

	protected int complex_check() {
		return -1;
		// TODO
	}

	protected void map_escapes() {
		// TODO
	}

	protected void tok_un() {
		// TODO
	}

	protected void append_token(final String str, final int[] i, final char[] ch, final int j) {
	}

	protected String token_string() {
		return null;
		// TODO
	}

	protected Set<String> common_pair = new HashSet<String>();
	protected Map<String, Integer> common_abbr = new HashMap<String, Integer>();

	private int option_token; // Output tokenized text (only use internally)
	private int tok_initialized; // is it inited?
}
