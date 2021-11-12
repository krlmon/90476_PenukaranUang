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
    private static Admin[] admin = new Admin[100];
    //private User usr;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //adm = new Admin();
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Proses.dataAdmin();
        do{
                System.out.println("\n========================");
                System.out.println("=====  M  E  N  U  =====");
                System.out.println("========================");
                System.out.println("1. Login Admin");
                System.out.println("2. Menu User");
                System.out.println("5. Daftar Mata Uang");
                System.out.println("6. Keluar");
                System.out.println("========================");
                System.out.print("Masukkan pilihan : ");
                pil = scan.nextInt();
                
            switch(pil){
                case 1:
                    Proses.loginAdmin();
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
                }
    }while(pil != 6);
      
    }
    
    public static void setPil(int pil){
        pil = pil;
    }
}
