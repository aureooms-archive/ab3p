package ab3p.lib.strategy;

public class AbbrStraBase extends AbbrStra {

	@Override
	public void token(final char[] aStr, final char[][] aLst) {
		// TODO Auto-generated method stub

	}

	@Override
	public long tokenize(final char[] aStr, final char[][] aLst) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long num_token(final char[] aStr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long first_ch(final char[] aStr, final char[] aFch, final long aNum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long is_upperal(final char[] aStr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long is_alpha(final char[] aStr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void str_tolower(final char[] aStr1, final char[] aStr2) {
		// TODO Auto-generated method stub

	}

	@Override
	public long get_str(final char[] aStr1, final char[] aStr2, final long aNum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isupper_str(final char[] aStr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean is_onealpha(final char[] aStr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count_upperstr(final char[] aStr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void get_alpha(final char[] aStr1, final char[] aStr2) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean lf_ok(final char[] aShrtf, final char[] aLongf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean set_condition(final char[] aSf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long strategy(final char[] aSf, final char[] aStr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long search_backward(final long aSloc, final long aTnum, final long aTloc, final char[] aSf, final boolean aFirst) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long search_backward_adv(final char[] aSf, final boolean aFirst) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void extract_lf(final long aBegin, final long aEnd) {
		// TODO Auto-generated method stub

	}

	@Override
	public void extract_lf(final long aBegin, final long aEnd, final char[] aStr) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exist_skipword(final long aNsf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exist_n_skipwords(final long aNsf, final long aN) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exist_n_stopwords(final long aNsf, final long aN) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean stopword_ok(final long aNsf, final long aNsw) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean skip_stop_ok(final long aNsf, final long aNsw, final long aN) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean skip_stop_ok2(final long aNsf, final long aNsw, final long aN) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean skipword_ok(final long aNsf, final long aNsw) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean is_subword(final long aNsf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean is_BeginWrdMatch(final long aNsf, final boolean aGeneral) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean is_WithinWrdMatch(final long aNsf, final boolean aGeneral) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean is_FirstLetMatch(final long aNsf, final boolean aGeneral) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean is_FirstLetMatch2(final long aNsf, final boolean aGeneral) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean is_FirstLetSMatch(final char[] aSf, final boolean aGeneral) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean is_ContLetMatch(final long aNsf) {
		// TODO Auto-generated method stub
		return false;
	}

}
