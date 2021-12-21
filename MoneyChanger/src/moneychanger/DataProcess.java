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
public class DataProcess {
    Auth auth = new Auth();
    Pelanggan[] user = auth.getUser();
    private Uang[] uang = new Uang[100];
    private int jmlData = 0;
    
    
    public Uang[] getUang(){
        return uang;
    }
    
    public int getJmlData(){
        return jmlData;
    }
    
    public int tambahUang(String mataUang, String negara, double nominal, double nilaiTukar, double saldo) {
        uang[jmlData] = new Uang(mataUang,negara, nominal, nilaiTukar, saldo);
        jmlData = jmlData + 1;
        return jmlData;
    }
    
     public void ubahUang(int id, String nama, String negara, double nominal, double nilaiTukar, double saldo){
        Uang uang[] = getUang();
        uang[id] = new Uang(nama,negara, nominal, nilaiTukar, saldo);
     }
     
    public void hapusUang(int id){
        do{
            if(jmlData == 0){
                System.out.println("Tidak Ada Data!");
                break;
            }else{
                if(id == jmlData - 1){
                    jmlData = jmlData = 1;
                }else{
                    for(int i=id;i<jmlData;i++){
                        uang[i] = uang[i + 1];
                    }
                    jmlData = jmlData - 1;
                }
                break;
            }
        }while(true);
    }
     
   
     public void lihatUang(int index){
        Uang uang[] = getUang();
            System.out.println("\n==================================");
            System.out.println("ID : "+(index+1)
                + "\nMataUang  : " + uang[index].getMatauang()
                + "\nNegara : " + uang[index].getNegara()
                + "\nNominal : " + uang[index].getNominal()
                + "\nHarga : " + uang[index].getNilaiTukar()
                + "\nSisa Saldo : " + uang[index].getSaldo()
                + "\nNilai Tersedia : " + uang[index].getRupiah()
            );
            System.out.println("==================================");
     }
     
     public void lihatUang(){
        Uang uang[] = getUang();
        for(int i=0;i<jmlData;i++){
            System.out.println("\n==================================");
            System.out.println("ID : "+(i+1)
                + "\nMataUang  : " + uang[i].getMatauang()
                + "\nNegara : " + uang[i].getNegara()
                + "\nNominal : " + uang[i].getNominal()
                + "\nHarga : " + uang[i].getNilaiTukar()
                + "\nSisa Saldo : " + uang[i].getSaldo()
                + "\nNilai Tersedia : " + uang[i].getRupiah()
            );
            System.out.println("==================================");
        }
     }
     
     
     public void lihatPengguna(){
           try{
                for(int i = 0; i < auth.dataUser(); i++){
                    System.out.println("\n==================================");
                    System.out.println("Nama  : " + user[i].getNama()
                        + "\nAlamat : " + user[i].getAlamat()
                        + "\nUser : " + user[i].getUsername()
                        + "\nPass : " + user[i].getPassword()
                        + "\nSaldo : " + user[i].getSaldo()
                    ); 
                    System.out.println("==================================");
                }        
           } catch (Exception e){
             System.err.println("Data Pengguna Kosong");
            }
        }
     
     
     public void lihatPengguna(int idx){
            System.out.println("\n==================================");
            System.out.println("Nama  : " + user[idx].getNama()
                + "\nAlamat : " + user[idx].getAlamat()
                + "\nUser : " + user[idx].getUsername()
                + "\nPass : " + user[idx].getPassword()
            );
                try{
                    System.out.println("Saldo : " + user[idx].getSaldo());
                }catch(Exception e){
                    System.out.println("Saldo : 0");
                }
            System.out.println("==================================");
     }
     
     
     public void depositPengguna(double deposit){
        int i = auth.getIdLogin();
        user[i].setSaldo(deposit);
         lihatPengguna(i);
     }
    
}
