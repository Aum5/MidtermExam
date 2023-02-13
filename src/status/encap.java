package status;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aumth
 */
public class encap {
 
     public enum input{zero,one,two,three};
    public enum output{Rejected, Pending, Processing, Approved };
    
    private input i;
    private output o;
 

    /**
     * @return the i
     */
    public input getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(input i) {
        this.i = i;
    }

    /**
     * @return the o
     */
    public output getO() {
        return o;
    }

    /**
     * @param o the o to set
     */
    public void setO(output o) {
        this.o = o;
    }
    
    
    
}
