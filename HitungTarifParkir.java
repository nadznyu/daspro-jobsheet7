import java.util.Scanner;
public class HitungTarifParkir {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jenis, durasi, total = 0;

    while (true) {
        System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
        jenis = sc.nextInt();

        if (jenis == 0) {
            System.out.println("Terimakasih sudah menggunakan layanan parkir.");
            break;
        }
        if (jenis == 1 || jenis == 2) {
            System.out.print("Masukkan durasi parkir: ");
            durasi = sc.nextInt();

            if (durasi <= 0) {
                System.out.println("Durasi tidak valid!");
                continue;
            }

            total = 0;
            if (durasi > 5) {
                total = 12500;
            } else if (jenis == 1) {
                total = durasi*3000;
            } else if (jenis == 2) {
                total = durasi*2000;
            }

            System.out.println("Total tarif parkir: Rp " +total);
        } else {
            System.out.println("Jenis kendaraan tidak valid!");
        }

        System.out.println();
    }
        sc.close();
    }
}