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
public class Proses{
    private static Admin[] admin = new Admin[100];
    private static boolean isLogin=false;
    private static String uname,upass;
    private static int cekAdmin=-1;
    private static Scanner input = new Scanner(System.in);
    
    public static void loginAdmin(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n=========================");
        System.out.println("======  L O G I N  ======");
        System.out.println("=========================");
        System.out.print("Masukkan User : ");
        uname = scan.next();
        System.out.print("\nMasukkan Password : ");
        upass = scan.next();
        cekAdmin = login(uname, upass);
        
        if(cekAdmin != -1){
            menuAdmin(); 
        }else{
            MoneyChanger.setPil(1);
        }
    }
        
    
     public static int dataAdmin() {
        String userAdmin[] = {"admin"};
        String namaAdmin[] = {"Admin"};
        String alamatPanitia[] = {"Surabaya"};
        String passAdmin[] = {"123456"};
        for (int i=0;i<namaAdmin.length;i++){
            admin[i] = new Admin(userAdmin[i], namaAdmin[i], alamatPanitia[i], passAdmin[i]);
        }
        return namaAdmin.length;
    }
     
      public static Admin[] getAdmin(){
        return admin;
    }
    
    static int login(String nama, String password){
        int loop = 0;
           try{
            for(int i=0; i <= dataAdmin(); i++){
                if(admin[i].getUsername().equals(nama) && admin[i].getPassword().equals(password)){
                    isLogin = true;
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
    
    
     protected boolean logout(User usr){
       isLogin = false;
       return isLogin;
    }
     protected boolean getIsLogin(){
       return isLogin;
    }
     
     private static void menuAdmin(){
        System.out.println("Selamat Datang " + getAdmin());
        int pil;
        
        do{
            System.out.println("");
            System.out.println("\n========================");
            System.out.println("\n====== A D M I N =======");
            System.out.println("\n========================");
            System.out.println("1. Tambah Matauang");
            System.out.println("2. Ubah Matauang");
            System.out.println("3. Lihat Matauang");
            System.out.println("4. Hapus Matauang");
            System.out.println("0. Log Out");
            System.out.println("\n========================");
            System.out.print("Pilih : ");
            pil = input.nextInt();
            input.nextLine();
            switch(pil){
                case 1:
                    System.out.println("Tambah");
                   // insertPeserta();
                    break;
                case 2:
                    System.out.println("Ubah");
                    //updatePeserta();
                    break;
                case 3:
                    //viewPeserta();
                    break;
                case 4:
                    //deletePeserta();
                    break;
            }
        }while(pil != 0);
    }
}
