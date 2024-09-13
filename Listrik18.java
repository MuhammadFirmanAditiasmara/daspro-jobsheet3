import java.util.Scanner;

public class Listrik18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        short kwh, listrikPerKwh=1500, batasanKwh=500;
        boolean lebihDari500;
        int totalTarif;

        System.out.print("Masukkan Penggunaan listrik: ");
        kwh = input.nextShort();

        lebihDari500=kwh>batasanKwh;

        totalTarif = (kwh*listrikPerKwh);

        System.out.println("Penggunaan listrik lebih dari 500 Kwh: " + lebihDari500);
        System.out.println("Tarif listrik anda: " + totalTarif);


        
        








    }
}
