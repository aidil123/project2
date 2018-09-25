/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;

public class MarkahKesuluruhan 
{
    public static void main (String[]args)
    {
        int FP;
        int COA;
        int WP;
        int SI;
        
        int Jumlah_Markah;
        int Purata_Markah;
        int Peratus_Markah;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Sila masukkan markah Fundamental of Programming :");
        FP = input.nextInt();
        
        System.out.println("\nSila masukkan markah Computer Organization and Architecture :");
        COA = input.nextInt();
        
        System.out.println("\nSila masukkan markah Web Programming :");
        WP = input.nextInt();
        
        System.out.println("\nSila masukkan markah System Interface :");
        SI = input.nextInt();
        
        Jumlah_Markah = FP + COA + WP + SI;
        Purata_Markah = Jumlah_Markah/4;
        Peratus_Markah = Jumlah_Markah*100/400;
        
        System.out.println("\nJumlah markah : " + Jumlah_Markah);
        System.out.println("Purata markah : " + Purata_Markah);
        System.out.println("Peratus markah : " + Peratus_Markah + "%");
    }
}
