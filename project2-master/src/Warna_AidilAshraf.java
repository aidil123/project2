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

public class Warna_AidilAshraf 
{
  public static void main (String[]args)
  {
      String nama_klien,pilihan_warna,ulasan;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Sila masukkan nama anda : ");
      nama_klien = input.nextLine();
      
      System.out.println("\nMerah Biru Kuning Hijau Hitam Putih");
      System.out.println("Sila masukkan warna kegemaran anda : ");
      pilihan_warna = input.next();
      
      switch(pilihan_warna)
      {
          case "Merah" : {ulasan = "Membawa makna kekuatan, kemarahan dan semangat";}
          break;
          case "Biru" : {ulasan = "Membawa maksud ketenangan, keikhalasan dan harapan";}
          break;
          case "Kuning" : {ulasan = "Melambangkan kegembiraan, penuh semangat dan riang";}
          break;
          case "Hijau" : {ulasan = "Menggambarkan kehidupan, kestabilan dan ketulenan";}
          break;
          case "Hitam" : {ulasan = "Dikaitkan dengan kejahatan dan penuh kerahsiaan";}
          break;
          case "Putih" : {ulasan = "Adakah berani tetapi tidak suka tunjukkan keberanian";}
          break;
          default : {pilihan_warna = "Tiada dalam senarai"; ulasan = "Pilihan warna anda tiada dalam senarai";} 
      }
       System.out.println("\nNama anda : " + nama_klien);
       System.out.println("Pilihan warna kegemaran : " + pilihan_warna);
       System.out.println("Ulasan : " + ulasan);
  }
}
