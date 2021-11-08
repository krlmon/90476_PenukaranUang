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
    private static boolean isLogin=false;
    
    public boolean login(Admin adm, String pass){
        
        if(adm.getPassword(adm).equals(pass)){
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
     protected boolean getIsLogin(){
       return isLogin;
    }
}
