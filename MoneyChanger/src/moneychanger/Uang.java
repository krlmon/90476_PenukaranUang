/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneychanger;
public class Uang {
    private String negara, mataUang;
    private double nominal,saldo, nilaiTukar;

      public Uang(){
        this.mataUang = "Dollar";
        this.negara = "USA";
        this.nominal = 100;
        this.nilaiTukar = 14200;
        hitRupiah(this.nominal,this.nilaiTukar);
    }
      
    public Uang(String nama, String negara, double nominal, double nilaiTukar){
        this.mataUang = nama;
        this.negara = negara;
        this.nominal = nominal;
        this.nilaiTukar = nilaiTukar;
        hitRupiah(nominal,nilaiTukar);
    }
    
    
    protected  String getNegara(){
        return this.negara;
    }
    
    protected  String getMatauang(){
        return this.mataUang;
    }
    
    protected double getNominal()
    {
        return nominal;
    }
    
    protected void setSaldo(double sld){
        this.saldo = sld;
    }
    
    protected double getSaldo(){
        return saldo;
    }
    
    protected void setNilaiTukar(double nltkr){
        this.nilaiTukar = nltkr;
    }
    
    protected double getNilaiTukar(){
        return nilaiTukar;
    }
    
    protected void hitRupiah(double nominal, double nilaiTukar){
        this.saldo = nominal*nilaiTukar;
    }
    
}
