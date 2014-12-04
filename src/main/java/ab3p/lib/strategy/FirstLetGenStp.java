package ab3p.lib.strategy;

/**
 * - sf ch matches with 1st ch or ch right after non-alphanum of lf
 * - allowing one skip stopword between tokens (no more than one in row)
 * at least one skip stopword in total
 * (eg, success: alpha and beta (AB), 1-alpha and beta (AB)
 * fail: alpha beta (AB), alpha word beta (AB))
 */
public class FirstLetGenStp extends AbbrStraBase {

}
