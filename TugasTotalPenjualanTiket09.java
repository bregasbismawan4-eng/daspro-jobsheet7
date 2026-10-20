import java.util.Scanner;

public class TugasTotalPenjualanTiket09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket, totalBayar, diskon;
        int totalTiket = 0;
        int totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi jumlah valid!");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }
            totalBayar = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                diskon = totalBayar * 15 / 100;
            } else if (jumlahTiket > 4) {
                diskon = totalBayar * 10 / 100;
            } else {
                diskon = 0;
            }
            totalBayar = totalBayar - diskon;

            System.out.println("Diskon: Rp " + diskon);
            System.out.println("Total yang harus dibayar: Rp " + totalBayar);

            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;
        }
        System.out.println("Total tiket terjual: " + totalTiket);
    System.out.println("Total penjualan tiket: Rp " + totalPenjualan);
        sc.close();
    }
}