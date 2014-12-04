package ab3p.lib.strategy;

/**
 * For sf consisting of capital letters & lower-case 's' - First letter & 's' in
 * the last token of lf (success: Alpha Betas (ABs), 1-Alpha Betas (ABs),
 * 1-Alpha-Betas (ABs), Alpha BetaS (ABs) fail: Alpha Beta xxs (ABs) )
 */
public class FirstLetGenS extends AbbrStraBase {

	@Override
	public boolean set_condition(char[] aSf) {

		// sf must be an original sf
		// true if sf is like ABCs
		
		// TODO Auto-generated method stub
		return super.set_condition(aSf);
	}

}
