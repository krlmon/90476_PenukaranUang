/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneychanger;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MoneyChanger {
    private int jumlah, perolehan, kembalian, s, e, r;
    private static boolean isLogin;
    private static int pil, tot, jml;
    protected static String access;
    private static String uname,upass;
    private static Auth auth = new Auth();
    private static Admin adm;
    private User usr;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        adm = new Admin();
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        do{
                System.out.println("\n========================");
                System.out.println("=====  M  E  N  U  =====");
                System.out.println("========================");
                System.out.println("1. Login Admin");
                System.out.println("2. Login User");
                System.out.println("5. Tukar Dollar");
                System.out.println("6. Tukar Euro");
                System.out.println("========================");
                System.out.print("Masukkan pilihan : ");
                pil = scan.nextInt();
                
            switch(pil){
                case 1:
                    System.out.println("\n=========================");
                    System.out.println("======  L O G I N  ======");
                    System.out.println("=========================");
                    System.out.print("Masukkan User : ");
                    uname = scan.next();
                    System.out.print("\nMasukkan Password : ");
                    upass = scan.next();
                    if(auth.login(adm.getUsername(adm), upass) == true){
                        access = "Admin";
                        pil = 7;
                    }else{
                        access = "User";
                        pil = 0;
                    }
                    System.out.println("Access = "+access+" "+adm.getPassword(adm)+" / "+upass);
                    break;
                  case 5:
                    System.out.println("\n=========================");
                    System.out.println("=====  D O L L A R  =====");
                    System.out.println("=========================");
                    System.out.print("Masukkan Jumlah Rupiah : ");
                    tot = scan.nextInt();
                    System.out.print("\nMasukkan Jumlah Dollar : ");
                    jml = scan.nextInt();
                    break;
                  case 6:
                    System.out.println("\n=========================");
                    System.out.println("========  E U R O  ========");
                    System.out.println("=========================");
                    System.out.print("Masukkan Jumlah Rupiah : ");
                    tot = scan.nextInt();
                    System.out.print("\nMasukkan Jumlah Euro : ");
                    jml = scan.nextInt();
                    break;
                  case 7:
                    System.out.println("\n========================");
                    System.out.println("=====  MENU  ADMIN  ====");
                    System.out.println("========================");
                    System.out.println("1. Tambah Uang");
                    System.out.println("2. Update Saldo");
                    System.out.println("========================");
                    System.out.print("Masukkan pilihan : ");
                    pil = scan.nextInt();
                  default:
                      if(access == "Admin"){
                          pil = 7;
                      }else{
                        access = "";
                        pil = 0;
                      }
                    break;
                }
            
    }while(access != "" && pil != 0);
      
    }
    public static void clrscr(){
    //Clears Screen in java
    try {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    } catch (IOException | InterruptedException ex) {}
}
}
