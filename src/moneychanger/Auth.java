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
public class Auth{
    private Admin adm;
    private String username,password;
    private boolean isLogin=false;
    
    public boolean login(String usernm, String pass){
        this.username = usernm;
        this.password = usernm;
        
        if(this.password == pass){
            this.isLogin = true;
        }else{
            this.isLogin = false;
        }
        return this.getIsLogin();
    }
        
     protected boolean logout(User usr){
       isLogin = false;
       return isLogin;
    }
     private boolean getIsLogin(){
       return isLogin;
    }
}
