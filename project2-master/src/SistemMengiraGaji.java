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

public class SistemMengiraGaji 
{
    public static void main (String []args)
    {
        String nama_pekerja;
        int bil_jam_kerja_hari;
        int bil_hari_kerja_bulan;
        int bil_jam_kerja_lebih_masa;
     
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan nama pekerja : ");
        nama_pekerja = input.nextLine();
        
        System.out.println("\nMasukkan bilangan jam bekerja sehari : ");
        bil_jam_kerja_hari = input.nextInt();
        while (bil_jam_kerja_hari > 9)
        {
            System.out.println("\nBilangan jam sehari tidak boleh melebihi 9 jam,");
            System.out.println("sila masukkan bilangan jam yang betul : ");
            
            bil_jam_kerja_hari = input.nextInt();
        }
        
        System.out.println("\nMasukkan bilangan hari bekerja :");
        bil_hari_kerja_bulan = input.nextInt();
        while (bil_hari_kerja_bulan > 30)
        {
            System.out.println("\nBilangan hari pekerja tidak boleh melebihi 30 hari,");
            System.out.println("sila masukkan bilangan hari yang betul :");
            
            bil_hari_kerja_bulan = input.nextInt();
        }
        
        System.out.println("\nMasukkan bilangan jam kerja lebih masa :");
        bil_jam_kerja_lebih_masa = input.nextInt();
        while (bil_jam_kerja_lebih_masa > 50)
        {
            System.out.println("\nBilangan hari pekerja tidak boleh melebihi 50 hari,");
            System.out.println("sila masukkan bilangan jam yang betul :");
            
            bil_jam_kerja_lebih_masa = input.nextInt();
        }
        int Jumlah_Gaji = (bil_jam_kerja_hari * 20) * bil_hari_kerja_bulan + (bil_jam_kerja_lebih_masa * 15);
        
        System.out.println("\nRumusan gaji bulanan " + nama_pekerja + "\n");
        System.out.println("Jumlah jam bekerja : " + bil_jam_kerja_hari + " jam");
        System.out.println("Jumlah hari bekerja : " + bil_hari_kerja_bulan + " hari");
        System.out.println("Jumlah jam lebih masa : " + bil_jam_kerja_lebih_masa + " jam\n");
        System.out.println("JUMLAH GAJI : RM" + Jumlah_Gaji);
    }
}
