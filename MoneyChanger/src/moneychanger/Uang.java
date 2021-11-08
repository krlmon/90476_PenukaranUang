/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneychanger;
public class Uang {
    private static String nama;
    private double nominal;

    public Uang(String nama, double nominal){
        this.nominal = nominal;
        this.nama = nama;
    }
    
    protected double getNominal(Uang uang)
    {
        return nominal;
    }
    
}
