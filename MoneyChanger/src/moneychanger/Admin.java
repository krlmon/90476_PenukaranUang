/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneychanger;

/**
 *
 * @author Administrator
 */
public class Admin extends UserAbstract {
    Uang uang[] = new Uang[100];
    
    public Admin(String username, String nama, String alamat, String password){
        super(username, nama, alamat,password);
    }
    
    public void updateSaldo(double saldo){
       // uang.setSaldo(saldo);
    }    
    
}
