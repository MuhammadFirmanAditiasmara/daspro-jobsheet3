import java.util.Scanner;

public class Gaji18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Deklarasi
        int jmlJamKerja;
        float upahPerJam, totalGaji, gajiMurni, gajiAkhir, gajiBonus, gajiTambahan, bonus = 10/100f, pajak = 5/100f;

        System.out.print("Masukkan jam kerja: ");
        jmlJamKerja= input.nextInt();
        System.out.print("Masukkan upah per jam: ");
        upahPerJam= input.nextFloat();
        //totalGaji
        gajiMurni = (jmlJamKerja*upahPerJam);
        gajiTambahan = (gajiMurni*bonus);
        gajiBonus= (gajiMurni+gajiTambahan);
        gajiAkhir = (gajiBonus*pajak);

        totalGaji = (gajiBonus - gajiAkhir);

        System.out.println("Jumlah jam kerja: " + jmlJamKerja + " jam");
        System.out.println("Upah per jam: Rp " + upahPerJam );
        System.out.println("Total gaji: Rp " + totalGaji);




    }    
}
