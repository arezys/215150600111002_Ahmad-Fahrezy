/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo4;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class MerchantMain {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        
        //System.out.println("Masukkan nama anda  : ");
        //String Nama = in.nextLine();
        //System.out.println("Masukkan NIM anda   : ");
        //String NIM = in.nextLine();
        
        //System.out.println("Nama    : "+Nama);
        //System.out.println("NIM     : "+NIM);
        
        System.out.println("Nama    : Ahmad Fahrezy Sanny");
        System.out.println("NIM     : 215150600111002");
        
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        
        System.out.println("Masukkan nama merchant  : ");
        String namaMerchant = in.nextLine();
        
        System.out.println("Masukkan nama produk    : ");
        String namaProduk = in.nextLine();
        
        System.out.println("Masukkan harga produk   : ");
        double hargaProduk = in.nextDouble();
        
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, hargaProduk));
        DataMerchant.tampilData();
        
    }
}
