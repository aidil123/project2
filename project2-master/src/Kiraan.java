/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Kiraan 
{
    public static void main (String[]args)
    {
        double mm,km;
        double mm_ke_cm,km_ke_m;
        
        mm = 35.5;
        km = 56.99;
        
        mm_ke_cm = mm / 10;
        km_ke_m = km * 1000;
        
        System.out.println("Kalkulator");
        System.out.println("Unit mm kepada cm : " + mm_ke_cm + "cm" + "\t Sebelum : " + mm + "mm");
        System.out.println("Unit km kepada m : " + km_ke_m + "m" + "\t Sebelum : " + km + "km");
    }
}
