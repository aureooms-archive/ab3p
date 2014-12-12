package ab3p.lib.iret;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public interface FBase {


	/**
	 * Sets tpnm and uses if nonnegative: appended
	 * to end of type name
	 * @param tn
	 */
    void set_type_num(int tn);
    
    /**
     * Sets nmnm and uses if nonnegative: appended
     * to end of name
     * @param nn
     */
    void set_name_num(int nn);
       
    
    /**
     * Allows change of type string for class.
     * @param nm
     */
    void change_type(char[] nm);
    
    
    /**
     * Allows change of name string for class.
     * @param nm
     */
    void change_name(char[] nm);
    
    /**
     * Allows change of name string for class.
     * Included for compatibility
     * @param nm
     */
    void set_name(char[] nm);
     
    
    /**
     * Uses the
     * higher level type tph as type and combines lower level tpl_nm with
     * name to allow one to keep track of file types. 
     * @param tph
     * @param tpl
     * @param nm
     */
    void subname(char[] tph,char[] tpl,char[] nm);
    
    
    /**
     * Path is by default external with
     * eflag=1. But if this function called with nonempty string, then eflag=0
     * and pt stored in path and used for access to data.
     * @param pt
     */
    void set_path_internal(char[] pt);
    
    /**
     * path will be extracted from path_pa
     * and eflag=2. Naming conventions for files are unchanged
     * @param pa
     */
    void set_path_name(char[] pa);
    
    /**
     * Maps naming parameters to class instance pFb
     * @param pFb
     */
    void map_down(FBase pFb);
    
    /**
     * Maps naming parameters to class instance pFb
     * combines subtype with name to make a new name for pFb and type becomes its type
     * @param pFb
     * @param subtype
     */
    void map_down_sub(FBase pFb,char[] subtype);

    // Path access functions
    
    /**
     * Reads the path from a file "path_(*name)" and ucts the
     * file name from as "(*type)_(*name).(*a)". Cats path and file
     * name and returns the full info in cn.
     * @param cn
     * @param a
     */
    void get_pathx(char[] cn,char[] a);
       
    void get_pathx(char[] cn,long n,char[] a);
    
    /**
     * converts long to ascii
     * and cats to end of string and returns pointer to new string
     * that results. Does not change input string. The new string is
     * held in buffer space and this is overwritten at each call.
     * @param ptr
     * @param n
     * @param buf
     * @return
     */
    char[] add_num(char[] ptr,long n,char[] buf);
    
    /**
     * converts long to ascii
     * and cats to end of ptr string and then cats result to end of
     * whatever is in buffer. Does not change input string. The new string is
     * held in buffer space.
     * @param ptr
     * @param n
     * @param buf
     * @return
     */
    char[] cat_num(char[] ptr,long n,char[] buf);
    	
    
    /**
     * Opens input file stream by path and name composition.
     * @param a
     * @return
     */
    FileInputStream get_Istr(char[] a );
    
    /**
     * Opens output file stream by path and name composition.
     * @param a
     * @return
     */
    FileOutputStream get_Ostr(char[] a);
    
    FileInputStream get_Istr(long n,char[] a);
    FileOutputStream get_Ostr(long n,char[] a);

    void dst_Istr(FileInputStream pfin);
    
    
    void dst_Ostr(FileOutputStream pfout);

    /**
     * returns 1 if file exists
     * @param a
     * @return
     */
    int Exists(char[] a);
    
    
    /**
     * returns 1 if file exists
     * @param n
     * @param a
     * @return
     */
    int Exists(long n,char[] a);
    
    

    // Read in array pointers
    
    /**
     * Reads in a file into an char array and returns pointer
     * @param a
     * @return
     */
    char[] get_Read(char[] a);
       
    char[] get_Read(long n,char[] a);

    // Memory map pointers
    
    /**
     * Memory maps file by path and name composition.
     * @param a
     * @return
     */
    char[] get_Mmap(char[] a);
      
    char[] get_Mmap(long n,char[] a);
    
    /**
     * Memory maps file by path and name composition.
     * Allows to modify contents and is written out when dst_Mmap called
     * @param a
     * @return
     */
    char[] get_Wmap(char[] a);
       
    /**
     * Allows to modify contents and is written out when dst_Mmap called
     * @param n
     * @param a
     * @return
     */
    char[] get_Wmap(long n,char[] a);

    
    /**
     * Removes the memory map for ptr based on path and name composition.
     * @param a
     * @param ptr
     */
    void dst_Mmap(char[] a,char[] ptr);

    
    void dst_Mmap(long n,char[] a,char[] ptr);

    
    
    // Array of chars and binary write
    
    /**
     * Writes out nm bytes binary
     * @param a
     * @param nm
     * @param ptr
     */
    void bin_Writ(char[] a,long nm,char[] ptr);
    
    void bin_Writ(long n,char[] a,long nm,char[] ptr);

    
    

    
    // Logical accounting functions
    
    
    /**
     * sflag is bit marker such as READ_W, etc.
     * This returns 1 if sflag bit not set in oflag and is in cflag
     * If this is the case then it sets sflag in oflag.
     * @param sflag
     * @return
     */
    int Gcom(int sflag);
    
    
    /**
     * This returns 1 if sflag bit set in oflag and in cflag
     * If this is the case then it turns off sflag in oflag.
     * @param sflag
     * @return
     */
    int Rcom(int sflag);
    
    /**
     * This function prints out string in 3rd argument and count
     * if first argument is multiple of the second
     * @param first
     * @param second
     * @param string
     */
    void mark(long first, int second, char[] string);



}
