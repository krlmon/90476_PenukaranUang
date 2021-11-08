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
    private String negara;
    private double saldo,rupiah, nilaiTukar;
    
    protected MataUang(String nm, String neg, double nmnl) {
        super(nm, nmnl);
        this.negara = neg;
    }
    
    protected void setSaldo(double sld){
        this.saldo = sld;
    }
    
    protected double getSaldo(MataUang mataUang){
        mataUang.getSaldo(mataUang);
        return saldo;
    }
    
    protected void setNilaiTukar(double nltkr){
        this.nilaiTukar = nltkr;
    }
    
    protected double getNilaiTukar(){
        return nilaiTukar;
    }
    
    protected double getRupiah(MataUang mataUang){
        rupiah = super.getNominal(mataUang)*mataUang.getSaldo(mataUang);
        return rupiah;
    }
    
    protected  String getNegara(){
        return this.negara;
    }

}
