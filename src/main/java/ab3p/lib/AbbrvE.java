package ab3p.lib;

/**
 * Created by genius on 30/08/14.
 */
public class AbbrvE {
    public int numa;
    public char[][] abbs;
    public char[][] abbl;
    private MPtok pMt;

    public void Proc(char[] pxh) {

        long i,j;
        char[] pch, ptr;
        
        pMt.segment(pxh);
        for(i=0;i<pMt.sent.size();i++){
            Extract2( (pMt->sent[i]).c_str() );
        }

        seq.flag_seq( numa, abbs );
        j=0;
        for(i=0;i<numa;i++){
            if( seq.rate(i) ){
                if(j<i){
                    pch=abbl[i];
                    if(ptr=strchr(pch,'|')){
                        *ptr='/';
                        ptr++;
                        while(ptr=strchr(pch,'|')){
                            *ptr='/';
                            ptr++;
                        }
                    }
                    abbl[j]=pch;
                    pch=abbs[i];
                    if(ptr=strchr(pch,'|')){
                        *ptr='/';
                        ptr++;
                        while(ptr=strchr(pch,'|')){
                            *ptr='/';
                            ptr++;
                        }
                    }
                    abbs[j]=pch;
                    nt[j]=nt[i];
                }
                j++;
            }
            else {
                delete [] abbl[i];
                delete [] abbs[i];
            }
        }

        numa=j;
        
        
    }

    public void cleara() {
    }
}
