/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneychanger;
import java.util.Scanner;
/**
 *
 * @author GENESIS
 */
public class Auth{
    private static Admin[] admin = new Admin[100];
    private static User[] user = new User[100];
    private static int jumUser = 1, index=0;
    private static String isLogin="";
            
    
     public static int dataAdmin() {
        String userAdmin = "admin";
        String namaAdmin = "Admin";
        String alamatAdmin = "Surabaya";
        String passAdmin = "123456";
        admin[index] = new Admin(userAdmin, namaAdmin, alamatAdmin, passAdmin);            
        user[index] = new User(userAdmin, namaAdmin, alamatAdmin, passAdmin);
        return 1;
    }
    
    public static int dataUser() {
        return user.length;
    }
     public static int dataUser(String unm, String nm, String alm, String password) {
        user[jumUser] = new User(unm, nm, alm, password);
        index = index + 1;
        jumUser = jumUser + 1;
        return jumUser-1;
    }
     
      public static Admin[] getAdmin(){
        return admin;
    }
      
    
    public static User[] getUser(){
        return user;
    }
    
    static int loginAdmin(String nama, String password){
        int loop = 0;
           try{
            for(int i=0; i <= dataAdmin(); i++){
                if(admin[i].getUsername().equals(nama) && admin[i].getPassword().equals(password)){
                    isLogin = admin[i].getUsername();
                    break;
                }
               loop++;
            }
        } catch (Exception e){
             loop = -1;
             System.err.println("Gagal Login");
        }
        return loop;
    }
    static int loginUser(String nama, String password){
        int loop = 0;
           try{
            for(int i=0; i <= dataUser(); i++){
                if(user[i].getUsername().equals(nama) && user[i].getPassword().equals(password)){
                    isLogin = user[i].getUsername();
                    index = i;
                    break;
                }
               loop++;
            }
        } catch (Exception e){
             System.err.println("Gagal Login " + user[loop].getUsername() + " " + user[loop].getPassword());
             loop = -1;
        }
        return loop;
    }
    
    
    protected String logout(User usr){
       isLogin = "";
       return isLogin;
    }
     public static String getIsLogin(){
       return isLogin;
    }
    
     
     public static int getJumlUser(){
       return jumUser;
    }
     
}
