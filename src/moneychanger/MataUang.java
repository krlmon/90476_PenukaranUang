/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneychanger;

/**
 *
 * @author GENESIS
 */
public class MataUang extends Uang{
    private String nm,ngr;
    private double nmnl,saldo,rupiah;
    
    protected MataUang(String nm, String ngr, double nmnl) {
        super(nm, ngr,nmnl);
    }
    
    protected void setSaldo(double sld){
        this.saldo = sld;
    }
    
    protected double getSaldo(MataUang mataUang){
        mataUang.getSaldo(mataUang);
        return saldo;
    }
    
    protected double getRupiah(MataUang mataUang){
        rupiah = super.getNilaiTukar(mataUang)*mataUang.getSaldo(mataUang);
        return rupiah;
    }

}
