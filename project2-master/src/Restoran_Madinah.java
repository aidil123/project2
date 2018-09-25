import java.util.Scanner;

public class Restoran_Madinah 
{
    public static void main (String[]args)
    {
        Double Senarai_harga= 0.00;
        Double Set_A=8.25;
        Double Set_B=10.00;
        Double Set_C=12.10;
        Double Set_D=14.00;
        Double Set_Couple=24.50;
        Double Set_Family=50.00;
        Boolean stop = false;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Senarai Set Makanan");
        System.out.println("Set_A");
        System.out.println("Set_B");
        System.out.println("Set_C");
        System.out.println("Set_D");
        System.out.println("Set_Couple");
        System.out.println("Set_Family");
        System.out.println("\nSila Masukkan Senarai Set Makanan ATAU Jika Selesai Masukkan Y");
        String Senarai_Set  = input.next();
       
        while(stop == false)
        {
            if("Set_A".equals(Senarai_Set))
            {
                Senarai_harga = Senarai_harga + Set_A;
            }
            else if("Set_B".equals(Senarai_Set))
            {
                Senarai_harga = Senarai_harga + Set_B;
            }
            else if("Set_C".equals(Senarai_Set))
            {
                Senarai_harga = Senarai_harga + Set_C;
            }
            else if("Set_D".equals(Senarai_Set))
            { 
                Senarai_harga = Senarai_harga + Set_D;
            }
            else if("Set_Couple".equals(Senarai_Set))
            {
                Senarai_harga = Senarai_harga + Set_Couple;
            }
            else if("Set_Family".equals(Senarai_Set))
            {
                Senarai_harga = Senarai_harga + Set_Family;
            }
            else if("Y".equals(Senarai_Set))
            {
                stop = true;
            }
            else if("y".equals(Senarai_Set))
            {
                stop = true;
            }
            
        else if(stop == true)
            {
                System.out.println(Senarai_harga);
            }
        }
    }
}
