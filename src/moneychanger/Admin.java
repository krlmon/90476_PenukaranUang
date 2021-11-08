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
    private MataUang mataUang;
    private String password;
    
    protected Admin(){
        super();
        super.setUsername("admin");
        super.setNama("Administrator");
        super.setAlamat("Surabaya");
        this.password = "123456";
        System.out.println("Create Admin");
    }
    protected void tambahUang(String nama, String negara, double nominal, double saldo){
        mataUang = new MataUang(nama, negara, nominal);
        mataUang.setSaldo(saldo);
    }
    
    protected void updateSaldo(MataUang mataUang, double saldo){
        mataUang.setSaldo(saldo);
    }
    
    protected void updateNilaiTukar(MataUang mataUang, double nilaiTukar){
        mataUang.setNilaiTukar(nilaiTukar);
    }
    
    protected String getPassword(Admin adm){
        return password;
    }
}
