/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Cuaca 
{
    public static void main(String []args)
    {
        String lokasi = "Alor Setar, Kedah";
        double longitude = 650506.29819875;
        double latitude = 676775.1343634;
        float suhu = 88.398926f;
        boolean banjir = false;
        
        System.out.println("Laporan Cuaca Hari Ini");
        System.out.println("Lokasi : " + lokasi);
        System.out.println("Koordinat GPS >>");
        System.out.println("Longitude : " + longitude + "  Latitude : " + latitude);
        System.out.println("Suhu : " + suhu + "*F");
        System.out.println("Amaran Banjir : " + banjir);
    }
}
