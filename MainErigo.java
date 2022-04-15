/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakPBO2;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class MainErigo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga 100000 ");
        System.out.println("Baju B dengan harga 125000 ");
        System.out.println("Baju C dengan harga 175000 ");
        
        System.out.print("Baju yang akan anda beli bertipe : ");
        String A = in.nextLine();
        
        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        int B = in.nextInt();
        
        Baju hitung = new Baju(A,B);
        
        hitung.display();
    }
}
