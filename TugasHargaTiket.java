import java.util.Scanner;
public class TugasHargaTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000, jmlTiket = 0, totalTiket = 0;
        double totalHarga = 0, totalHargaTiket = 0;
        double diskonTiket1 = 0.90;
        double diskonTiket2 = 0.85;
        String pesan = " ";

        while (true) {
            System.out.print("Jumlah tiket yang dibeli ('ketik 0 untuk keluar'): ");
            jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                System.out.println("Jumlah tiket tidak valid!");
                break;
            }
            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket negatif. ulang!");
                continue;
            }
            if (jmlTiket > 10) {
                totalHarga = (hargaTiket*jmlTiket)*diskonTiket2;
                pesan = "Mendapatkan diskon 15%";
            } else if (jmlTiket > 4) {
                totalHarga = (hargaTiket*jmlTiket)*diskonTiket1;
                pesan = "Mendapatkan diskon 10%";
            } else {
                totalHarga = hargaTiket*jmlTiket;
                pesan = "Tidak mendapatkan diskon";
            }
            totalHargaTiket += totalHarga;
            totalTiket += jmlTiket;

            System.out.println("Harga tiket: " + (int) totalHarga);
            System.out.println(""+pesan);
            System.out.println();
            }

            System.out.println();
            System.out.println("Total tiket yang terjual: " +totalTiket);
            System.out.println("Total harga penjualan tiket: " + (int) totalHargaTiket);
        
    }
}
