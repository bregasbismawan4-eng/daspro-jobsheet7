import java.util.Scanner;

public class KafeDoWhile09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int kopi, teh, roti, totalHarga;
       int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
       String namaPelanggan;

       do{
              System.out.print("Masukkan nama pelanggan(ketik'batal' untuk keluar): ");
                namaPelanggan = sc.nextLine();
    
                if (namaPelanggan.equalsIgnoreCase("batal")) {
                    System.out.println("Transaksi dibatalkan.");
                    break;
                }

                System.out.print("jumlah kopi  ");
                kopi = sc.nextInt();
    
                System.out.print("jumlah teh  ");
                teh = sc.nextInt();
    
                System.out.print("jumlah roti  ");
                roti = sc.nextInt();
    
                totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
                System.out.println("Total yang harud dibayar: Rp" +totalHarga);
                sc.nextLine(); 
          } while (true); 
          System.out.println("Semua transaksi selesai.");
           sc.close();
       }




       
    }

