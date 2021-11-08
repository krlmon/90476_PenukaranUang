/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneychanger;
public class Uang {
    private static String nama;
    private static String negara;
    private double nilaiTukar;

    public Uang(String nama, String negara, double nominal){
        this.nilaiTukar = nominal;
        this.nama = nama;
        this.negara = negara;
    }
    
    protected void setNilaiTukar(double nilai)
    {
        nilaiTukar = nilai;
    }
    
    protected double getNilaiTukar(Uang uang)
    {
        return nilaiTukar;
    }
    
}
