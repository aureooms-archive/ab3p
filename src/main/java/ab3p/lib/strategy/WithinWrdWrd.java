package ab3p.lib.strategy;

/*
 - a matching sub-string must be word
 (eg, success: AlphaBeta (AB), Beta is word
 x-AlphaBeta (AB) )
 - at least one within word match
 (eg,fail: Alpha Beta Word (ABW), Alpha x-Beta x-Word (ABW)
 success: AlphaBeta Word (ABW), x-AlphaBeta inWord (ABW))
 */
public abstract class WithinWrdWrd extends AbbrStra {

}
