/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneychanger;
import moneychanger.DataProcess.*;
/**
 *
 * @author GENESIS
 */public class Transaksi {
   DataProcess dataProcess = new DataProcess();
   private double jual, beli,jumlah;
    private int jmlData = 0;
    
   public Transaksi(double jual, double beli, double jumlah ){
       this.jual = jual;
       this.beli = beli;
       this.jumlah = jumlah;
   }
   public void setJual(double jual){
      this.jual = jual;
   }
   public double getJual(){
       return jual;
   }
   public void setBeli(double beli){
      this.beli = beli;
   }
   public double getBeli(){
       return beli;
   }
 }