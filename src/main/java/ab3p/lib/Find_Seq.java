package ab3p.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Seq {
	private final List<Boolean> my_rate = new ArrayList<Boolean>();
	private int my_numa;
	private char[][] my_abbs;
	private final List<String> seq_i = new ArrayList<String>();
	private final List<String> seq_I = new ArrayList<String>();
	private final List<String> seq_a = new ArrayList<String>();
	private final List<String> seq_A = new ArrayList<String>();

	public Find_Seq() {
		this.seq_i.add("i");
		this.seq_i.add("ii");
		this.seq_i.add("iii");
		this.seq_i.add("iv");
		this.seq_i.add("v");
		this.seq_i.add("vi");

		this.seq_I.add("I");
		this.seq_I.add("II");
		this.seq_I.add("III");
		this.seq_I.add("IV");
		this.seq_I.add("V");
		this.seq_I.add("VI");

		this.seq_a.add("a");
		this.seq_a.add("b");
		this.seq_a.add("c");
		this.seq_a.add("d");
		this.seq_a.add("e");
		this.seq_a.add("f");

		this.seq_A.add("A");
		this.seq_A.add("B");
		this.seq_A.add("C");
		this.seq_A.add("D");
		this.seq_A.add("E");
		this.seq_A.add("F");
	}

	/**
	 * flag the SFs whether part of sequence or not
	 * @param numa
	 * @param abbs
	 */
	public void flag_seq(final int numa, final char[][] abbs) {

		this.my_numa = numa;
		this.my_abbs = abbs;

		// my_rate.resize(numa); C++
		// TODO find faster equivalent
		while (this.my_rate.size() > numa) {
			this.my_rate.remove(this.my_rate.size() - 1);
		}
		while (this.my_rate.size() < numa) {
			this.my_rate.add(false);
		}

		for (int i = 0; i < numa; ++i) {
			this.my_rate.set(i, true);
		}

		this.find_seq(this.seq_i);
		this.find_seq(this.seq_I);
		this.find_seq(this.seq_a);
		this.find_seq(this.seq_A);

		this.create_seq();
	}

	/**
	 * true if good SF, false if part of sequence
	 * @param i
	 * @return
	 */
	public boolean rate(final int i) {
		return this.my_rate.get(i);
	}

	private void find_seq(final List<String> seq) {
		for (int i_abbr = 0; i_abbr < this.my_numa - 1; ++i_abbr) {
			// need to see at least 2 in sequence

			if (Arrays.equals(seq.get(0).toCharArray(), this.my_abbs[i_abbr])) {
				int i_seq = 1;
				while (i_seq < seq.size() && i_seq + i_abbr < this.my_numa && Arrays.equals(seq.get(i_seq).toCharArray(), this.my_abbs[i_abbr + i_seq])) {
					++i_seq;
				}

				if (i_seq > 1) {
					for (int i = 0; i < i_seq; ++i) {
						this.my_rate.set(i_abbr + i, false);
					}
				}
			}

		}
	}

	private void create_seq() {

		for (int i_abbr = 0; i_abbr < this.my_numa; ++i_abbr) {

			final int len = this.my_abbs[i_abbr].length;

			if (this.my_abbs[i_abbr][len - 1] == '1') {
				// create sequence and test

				final String prefix = new String(this.my_abbs[i_abbr], 0, len - 1);
				final int seq_len = this.my_numa - i_abbr; // max possible
				// length
				final List<String> seq = new ArrayList<String>();
				// sequence starts with 1
				for (int i = 1; i <= seq_len; ++i) {
					final String s = prefix + Integer.toString(i);
					seq.add(s);
				}

				// cout << seq << '\n';
				this.find_seq(seq);
			}
		}
	}

}
