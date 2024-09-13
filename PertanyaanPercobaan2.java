import java.util.Scanner;

public class PertanyaanPercobaan2 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     //Deklarasi
     boolean keanggotaan;
     int jmlKopi, jmlTeh, jmlRoti, nominalInt;
     double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
     float diskon = 10/100f;
     double  nominalBayar, totalHarga;
     byte totalByte;

 
     System.out.print("Masukkan keanggotaan (true/false): ");
          keanggotaan = input.nextBoolean(); 
          System.out.print("Masukkan jumlah pembelian kopi: ");
          jmlKopi = input.nextInt(); 
          System.out.print("Masukkan jumlah pembelian teh: ");
          jmlTeh = input.nextInt(); 
          System.out.print("Masukkan jumlah pembelian roti: ");
          jmlRoti = input.nextInt();
          
          
          totalHarga = (jmlKopi*hargaKopi) + (jmlTeh*hargaTeh) + ( jmlRoti*hargaRoti);
          totalByte = (byte) totalHarga;
 
          nominalBayar = totalHarga - (diskon *totalHarga);
          nominalInt = (int) nominalBayar;
 
          System.out.println("Keanggotaan pelanggan " + keanggotaan);
          System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti" );
          System.out.println("Total bayar " + totalByte);
       input.close(); 
}    
}
