/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakPBO2;

/**
 *
 * @author Hp
 */
public class Baju {
    String jenis;
    int jumlah, harga;
    
    public Baju (String x, int y){
        jenis = x;
        jumlah = y;
    }
    
    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;
    
    void hargaa(){
        if(jumlah > 100){
            harga = bajua - 5000;
        }
        else{
            harga = bajua;
        }
    }
    void hargab(){
        if(jumlah > 100){
            harga = bajub - 5000;
        }
        else{
            harga = bajub;
        }
    }
    void hargac(){
        if(jumlah > 100){
            harga = bajuc - 15000;            
        }
        else{
            harga = bajuc;            
        }
    }
    
    void display(){
        if(jenis.equalsIgnoreCase("a"))
            hargaa();
        else if(jenis.equalsIgnoreCase("b"))
            hargab();
        else if(jenis.equalsIgnoreCase("c"))
            hargac();
        System.out.println("Jenis yang anda beli    : "+jenis);
        System.out.println("Harga per buah          : "+harga);
        System.out.println("Total harga             : "+harga*jumlah);
    }
    
}
