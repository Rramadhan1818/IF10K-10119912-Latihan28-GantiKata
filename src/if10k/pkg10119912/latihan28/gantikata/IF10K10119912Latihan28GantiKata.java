/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * 
 */
public class IF10K10119912Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt, ganti_kata, menjadi_kata;
         
        System.out.println("===== Program Ganti Kata =====");
        System.out.println();        
        System.out.print("Masukkan Kalimat : ");        
        txt = scan.nextLine();
        System.out.print("Ganti Kata : ");        
        ganti_kata = scan.nextLine();  
        System.out.print("Ganti Kata : ");        
        menjadi_kata = scan.nextLine();
        
        String replaceString=txt.replace(ganti_kata, menjadi_kata);
        System.out.println(replaceString);  
    }
    
}
