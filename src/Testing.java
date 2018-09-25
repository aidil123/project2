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

public class Testing 
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Maukkan jejari slinder : ");
        double jejari = input.nextDouble();
        System.out.print("Memasukkan tinggi : ");
        double tinggi = input.nextDouble();
        double pie = 3.142;
        double purata = (pie * (jejari * jejari) * tinggi);
        System.out.print("Isipadu sebuah silinder yang mempunyai jejari "); 
        System.out.print(jejari + " dan tinggi " + tinggi); 
        System.out.print(" adalah " + purata);
    }
}
