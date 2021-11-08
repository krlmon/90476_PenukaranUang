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
    private MataUang mataUang[] = new MataUang[100];
    private String password;
    
    protected Admin(){
        super("admin", "123456", "Surabaya");
    }
    
    protected void updateSaldo(MataUang mataUang, double saldo){
        mataUang.setSaldo(saldo);
    }
    
    protected String getPassword(Admin adm){
        return password;
    }
}
