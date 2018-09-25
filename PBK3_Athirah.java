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

public class PBK3_Athirah {
    public static void main (String [] args) {
    
    int FOP ;
    int COA;
    int WP;
    int SI ;
 
    Scanner input = new Scanner (System.in);
    
    System.out.println ("masukkan markah untuk FOP");
    FOP = input.nextInt();
    
    System.out.println ("masukkan markah untuk COA");
    COA = input.nextInt();
    
    System.out.println ("masukkan markah untuk WP");
    WP = input.nextInt();
    
    System.out.println ("masukkan markah untuk SI");
    SI = input.nextInt();
    
    double jumlah_markah = FOP+COA+WP+SI;
   System.out.println ("jumlah_markah ;" + jumlah_markah);
   
   double jumlah_purata = jumlah_markah/4;
   System.out.println ("jumlah_purata ;" + jumlah_purata);
   
   double peratus_markah = jumlah_purata*100/400;
   System.out.println ("peratus_markah ;" + peratus_markah);
  
    
}
 }
