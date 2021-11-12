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
public class Admin extends User {
    private String password;
    
    public Admin(String username, String nama, String alamat, String password){
        super("admin", "Admin", "Surabaya");
        this.password = "123456";
    }
    
    public void updateSaldo(MataUang mataUang, double saldo){
        mataUang.setSaldo(saldo);
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getUsername(){
        return super.getUsername();
    }
    
    
}
