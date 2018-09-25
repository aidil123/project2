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

public class Skor 
{
    public static void main (String[]args)
    {
        char gred;
        int skor;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Sila masukkan skor anda");
        skor = input.nextInt();
        if (skor >= 90)
        {
           gred = 'A';
        }
        else if (skor >= 80)
        {
            gred = 'B';
        }
        else if (skor >= 70)
        {
            gred = 'C';
        }
        else if (skor >= 60)
        {
            gred = 'D';
        }
        else 
        {
            gred = 'F';
        }
        System.out.println("Skor anda : " + skor + " Maka gred anda : " + gred);
    }
}
