package ab3p.lib;

import java.io.PrintStream;

/**
 * Created by genius on 30/08/14.
 */
public class AbbrOut {

    public String sf = "", lf = "", strat = "";
    public double prec = 0;

    public void print (PrintStream out) {
        out.print(' ');
        out.print(sf);
        out.print('|');
        out.print(lf);
        out.print('|');
    }
}
