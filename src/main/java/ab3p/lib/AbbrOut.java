package ab3p.lib;

import java.io.PrintStream;

public class AbbrOut {

    public String sf = "", lf = "", strat = "";
    public double prec = 0;
    
	@Override
	public String toString() {

		final StringBuilder sb = new StringBuilder();

		sb.append("  ");
		sb.append(this.sf);
		sb.append("|");
		sb.append(this.lf);
		sb.append("|");
		sb.append(this.prec);

		return sb.toString();
	}

    public void print (PrintStream out) {
        out.print(' ');
        out.print(this.sf);
        out.print('|');
        out.print(this.lf);
        out.print('|');
    }
	
}
