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
public class User {
    private String username,nama, alamat;
    
    public User(String uname, String nm, String almt){
        this.username = uname;
        this.nama = nm;
        this.alamat = almt;        
    }
    
    public void setUsername(String usernm){
        this.username = usernm;
    }
    
    public String getUsername(){
        return username;
    }
    public void setNama (String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    public void setAlamat (String alamat){
        this.nama = alamat;
    }
    
    public String getAlamat(){
        return alamat;
    }
}
