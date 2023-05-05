import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i=1; i>0; i++) {
            System.out.println();
            System.out.println("=================================================");
            System.out.println("Selamat Datang di Program Penghitung Ongkos Kirim");
            System.out.println("1. Mulai Hitung Ongkos Kirim");
            System.out.println("2. EXIT");
            System.out.println("Silahkan Pilih Angka 1/2: ");
            float pilihan = input.nextFloat();
            if (pilihan == 1) {
                System.out.println("Masukkan Panjang Barang (cm): ");
                int panjangBarang = input.nextInt();
                System.out.println("Masukkan Lebar Barang (cm): ");
                int lebarBarang = input.nextInt();
                System.out.println("Masukkan Tinggi Barang (cm): ");
                int tinggiBarang = input.nextInt();
                Dimensi dimensi = new Dimensi();
                dimensi.inputDimensi(panjangBarang,lebarBarang,tinggiBarang);
                System.out.println("Masukkan Berat Barang (kg): ");
                float beratBarang = input.nextFloat();
                Berat berat = new Berat();
                berat.inputBerat(beratBarang);
                if (dimensi.hitungDimensi() > berat.hitungBerat()) {
                    System.out.println("Harga Ongkir: Rp " + dimensi.hitungDimensi());
                } else {
                    System.out.println("Harga Ongkir: Rp " + berat.hitungBerat());
                }
            } else if (pilihan == 2) {
                System.out.println("Terimakasih, Have a Good Day!");
                break;
            } else {
                System.out.println("Nomor yang Anda Masukkan Salah, Silahkan Pilih Nomor 1/2:");
            }
        }
    }
}