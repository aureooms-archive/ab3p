package ab3p.lib.strategy;

/**
 * - WithinWrdFLet w/ allowing one skip word between tokens (no more than one in row)
 * at least one skip word in total
 * (success: AlphaXyy zzz Word zzz (AXW)
 * fail: AlphaXyy Word (AXW), AlphaXyy zzz yyy Word (AXW))
 */
public class WithinWrdFLetSkp extends AbbrStraBase {

}
